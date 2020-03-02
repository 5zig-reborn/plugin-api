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

import eu.the5zig.mod.gui.ingame.ItemStack;
import io.netty.buffer.ByteBuf;

/**
 * Extend to handle a specific game mode of a server.
 *
 * @param <T> the game mode this listener is listining on.
 */
public abstract class AbstractGameListener<T extends GameMode> {

	/**
	 * Utility class that holds all game mode listeners and contains util methods to send & ignore server messages.
	 */
	GameListenerRegistry gameListener;

	/**
	 * @return the class of the game mode this listener is listening on or {@code null}, if this listener
	 * should listen on all game modes.
	 */
	public abstract Class<T> getGameMode();

	/**
	 * Called whenever the Minecraft client changes a server lobby.
	 *
	 * @param lobby the new lobby.
	 * @return true, if the listener listens on this server lobby.
	 */
	public abstract boolean matchLobby(String lobby);

	/**
	 * Called, whenever a message from the supplied message property file matched a server chat message.
	 *
	 * @param gameMode the current game mode instance.
	 * @param key      the message key.
	 * @param match    the match result.
	 */
	public void onMatch(T gameMode, String key, IPatternResult match) {
	}

	/**
	 * Called, whenever the Minecraft client joins the server of this server instance.
	 */
	public void onServerJoin() {
	}

	/**
	 * Called, whenever the Minecraft client joins this game mode.
	 *
	 * @param gameMode the current game mode instance.
	 */
	public void onGameModeJoin(T gameMode) {
	}

	/**
	 * Called every tick, as long as the client plays on this game mode.
	 *
	 * @param gameMode the current game mode instance.
	 */
	public void onTick(T gameMode) {
	}

	/**
	 * Called, whenever a key has been pressed, while the client is playing on this game mode.
	 *
	 * @param gameMode the current game mode instance.
	 * @param code     the {@link org.lwjgl.input.Keyboard} key code.
	 */
	public void onKeyPress(T gameMode, int code) {
	}

	/**
	 * Called, when the client joins a new server while playing a game mode.
	 *
	 * @param gameMode the current game mode instance.
	 */
	public void onServerConnect(T gameMode) {
	}

	/**
	 * Called, when the client leaves a server while playing a game mode.
	 *
	 * @param gameMode the current game mode instance.
	 */
	public void onServerDisconnect(T gameMode) {
	}

	/**
	 * Called, when the client receives a custom payload from the server while playing a game mode.
	 *
	 * @param gameMode   the current game mode instance.
	 * @param channel    the channel, the payload has been sent on.
	 * @param packetData the payload data.
	 */
	public void onPayloadReceive(T gameMode, String channel, ByteBuf packetData) {
	}

	/**
	 * Called, whenever the client receives a chat message from the server while playing this game mode.
	 *
	 * @param gameMode the current game mode instance.
	 * @param message  the message that has been received.
	 * @return true, if the message should be ignored by the Minecraft client.
	 */
	public boolean onServerChat(T gameMode, String message) {
		return false;
	}

	/**
	 * Called, whenever the client receives an action bar message from the server while playing this game mode.
	 *
	 * @param gameMode the current game mode instance.
	 * @param message  the message that has been received.
	 * @return true, if the message should be ignored by the Minecraft client.
	 */
	public boolean onActionBar(T gameMode, String message) {
		return false;
	}

	/**
	 * Called, whenever the player list header and/or footer have been updated while playing on this game mode.
	 *
	 * @param gameMode the current game mode instance.
	 * @param header   the header of the player list.
	 * @param footer   the footer of the player list.
	 */
	public void onPlayerListHeaderFooter(T gameMode, String header, String footer) {
	}

	/**
	 * Called, whenever the client receives a title from the server while playing on this game mode.
	 *
	 * @param gameMode the current game mode instance.
	 * @param title    the title.
	 * @param subTitle the subtitle.
	 */
	public void onTitle(T gameMode, String title, String subTitle) {
	}

	/**
	 * Called, whenever the server teleports the client to a new location.
	 *
	 * @param gameMode the current game mode instance.
	 * @param x        the absolute x-coordinate of the player.
	 * @param y        the absolute y-coordinate of the player.
	 * @param z        the absolute z-coordinate of the player.
	 * @param yaw      the yaw-rotation of the player.
	 * @param pitch    the pitch-rotation of the player.
	 */
	public void onTeleport(T gameMode, double x, double y, double z, float yaw, float pitch) {
	}

	/**
	 * Called, whenever an {@link ItemStack} gets set into a chest slot.
	 *
	 * @param gameMode       the current game mode instance.
	 * @param containerTitle the title of the chest.
	 * @param slot           the slot.
	 * @param itemStack      the item stack.
	 */
	public void onChestSetSlot(T gameMode, String containerTitle, int slot, ItemStack itemStack) {
	}

	/**
	 * @return an utility class that holds all registered listeners.
	 */
	public final GameListenerRegistry getGameListener() {
		return gameListener;
	}
}
