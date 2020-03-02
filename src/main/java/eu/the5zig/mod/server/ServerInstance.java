/*
 * Copyright (c) 2019-2020 5zig Reborn
 * Copyright (c) 2015-2019 5zig
 *
 * This file is part of The 5zig Mod
 * The 5zig Mod is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The 5zig Mod is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with The 5zig Mod.  If not, see <http://www.gnu.org/licenses/>.
 */

package eu.the5zig.mod.server;

/**
 * Represents a custom server handler. Extend to create a custom server handler.
 * <p>
 * Create optionally a message resource file that is located in {@code core/servers}
 * of your plugin and called like {@link #getConfigName()} and ends with
 * {@code .properties}. This file should contain all messages that the mod should listen on. When
 * matched, the active {@link AbstractGameListener} will be called with the message key.
 */
public abstract class ServerInstance {

	/**
	 * Utility class that holds all game mode listeners and contains util methods to send & ignore server messages.
	 */
	GameListenerRegistry gameListener;

	/**
	 * Register all your game mode listeners in this method, using {@link #getGameListener()}
	 * and {@link GameListenerRegistry#registerListener(AbstractGameListener)}
	 */
	public abstract void registerListeners();

	/**
	 * @return the display name of the server instance.
	 */
	public abstract String getName();

	/**
	 * @return the config name of the server instance, used for modules and the message property file.
	 */
	public abstract String getConfigName();

	/**
	 * Called, whenever the client joins a Minecraft server to check, whether the server
	 * is handled by any registered server instance.
	 *
	 * @param host the host of the Minecraft server.
	 * @param port the port of the Minecraft server.
	 * @return true, if the server should be handled by this server instance.
	 */
	public abstract boolean handleServer(String host, int port);

	/**
	 * @return an utility class that holds all registered listeners.
	 */
	public final GameListenerRegistry getGameListener() {
		return gameListener;
	}
}
