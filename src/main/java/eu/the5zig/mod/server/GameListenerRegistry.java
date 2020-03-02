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

import eu.the5zig.util.Callback;

import java.util.Set;

/**
 * Utility class that holds all game mode listeners and contains util methods to send & ignore server messages.
 */
public interface GameListenerRegistry {

	/**
	 * Registers a listener that listens on a game mode.
	 *
	 * @param listener the listener that should be registered.
	 */
	void registerListener(AbstractGameListener<? extends GameMode> listener);

	/**
	 * Switches the lobby of a server and tries to match a new game mode by iterating through all listeners
	 * and calling {@link AbstractGameListener#matchLobby(String)}.
	 *
	 * @param newLobby the new lobby.
	 */
	void switchLobby(String newLobby);

	/**
	 * @return the current lobby name or {@code null}, if there is no current lobby name.
	 */
	String getCurrentLobby();

	/**
	 * @return the current nick name of the player or {@code null}, if the player is not nicked.
	 */
	String getCurrentNick();

	/**
	 * Sets a new nick name for the player.
	 *
	 * @param nickname the new nick name or {@code null}, if the player is not nicked.
	 */
	void setCurrentNick(String nickname);

	/**
	 * Sends a message from the player and ignores the result of it.
	 *
	 * @param message the message that should be sent.
	 * @param key     the message key that should be ignored, specified in the messages property file.
	 */
	void sendAndIgnore(String message, String key);

	/**
	 * Sends a message from the player and ignores multiple results of it.
	 *
	 * @param message  the message that should be sent.
	 * @param start    the first message that should be ignored, key specified in the messages property file.
	 * @param end      the last message that should be ignored, key specified in the messages property file.
	 * @param callback a callback that will be called, after the last message has been ignored. This callback will
	 *                 contain all ignored messages.
	 */
	void sendAndIgnoreMultiple(String message, String start, String end, Callback<IMultiPatternResult> callback);

	/**
	 * Sends a message from the player and ignores multiple results of it.
	 *
	 * @param message          the message that should be sent.
	 * @param startKey         the first message that should be ignored, key specified in the messages property file.
	 * @param numberOfMessages the number of messages that should be ignored.
	 * @param abortKey         a message that will cancel ignoring further messages.
	 * @param callback         a callback that will be called, after {@code numberOfMessages} messages have been ignored or
	 *                         the abort message has been received. This callback will contain all ignored messages.
	 */
	void sendAndIgnoreMultiple(String message, String startKey, int numberOfMessages, String abortKey, Callback<IMultiPatternResult> callback);

	/**
	 * @return the current game mode or {@code null}, if the client does not play on this server instance.
	 */
	GameMode getCurrentGameMode();

	/**
	 * @return a set containing all friends. You can add friends to that list in order to update the online friends module item.
	 */
	Set<String> getOnlineFriends();

	/**
	 * @return a set containing all party members.
	 */
	Set<String> getPartyMembers();

	/**
	 * @return true, if the Minecraft client currently plays on the server instance.
	 */
	boolean isOnServer();
}
