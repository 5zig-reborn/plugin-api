/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.modules;

import eu.the5zig.mod.The5zigAPI;
import eu.the5zig.mod.server.GameMode;
import eu.the5zig.mod.server.GameState;
import eu.the5zig.mod.server.ServerInstance;

/**
 * A module item that renders only whenever the client is playing on the specified game mode.
 *
 * @param <T> the game mode.
 */
public abstract class GameModeItem<T extends GameMode> extends StringItem {

	/**
	 * The class of the game mode.
	 */
	private Class<? extends T> modeClass;
	/**
	 * The game states in which the game mode should be rendered or {@code null} if the item should be rendered
	 * in all game states.
	 */
	private GameState[] state;

	/**
	 * Creates a new game mode item.
	 *
	 * @param modeClass the class of the game mode.
	 * @param state     the game states when the item should be rendered or none, if the item should be rendered
	 *                  in all game states.
	 */
	public GameModeItem(Class<? extends T> modeClass, GameState... state) {
		this.modeClass = modeClass;
		this.state = state;
	}

	/**
	 * The item will be only rendered, if the Minecraft client is playing on the specified game mode and either
	 * no specific game states have been specified or one of the specified game states is active.
	 *
	 * @param dummy true, if the item should render dummy values.
	 * @return true, if the item should be rendered.
	 */
	@Override
	public boolean shouldRender(boolean dummy) {
		if (dummy) {
			return true;
		}
		ServerInstance activeServer = The5zigAPI.getAPI().getActiveServer();
		if (activeServer != null && activeServer.getGameListener().getCurrentGameMode() != null
				&& modeClass.isAssignableFrom(activeServer.getGameListener().getCurrentGameMode().getClass())) {
			if (state != null && state.length != 0) {
				for (GameState gameState : state) {
					if (getGameMode().getState() == gameState) {
						return getValue(false) != null;
					}
				}
				return false;
			}
			return getValue(false) != null;
		}
		return false;
	}

	/**
	 * @return the active game mode instance.
	 */
	protected T getGameMode() {
		return modeClass.cast(The5zigAPI.getAPI().getActiveServer().getGameListener().getCurrentGameMode());
	}
}
