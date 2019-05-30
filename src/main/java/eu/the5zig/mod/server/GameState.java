/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.server;

public enum GameState {

	/**
	 * Lobby state.
	 */
	LOBBY,

	/**
	 * Game is Starting. All players have been teleported and are now freezed.
	 */
	STARTING,

	/**
	 * Pre game. All players can move, invincibility is on.
	 */
	PREGAME,

	/**
	 * Game.
	 */
	GAME,

	/**
	 * EndGame, eg. Deathmatch
	 */
	ENDGAME,

	/**
	 * Finished, stops the current time counter.
	 */
	FINISHED

}
