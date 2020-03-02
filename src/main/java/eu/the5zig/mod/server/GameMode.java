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
 * An abstract class that represents a server game mode. Override to store custom values for each specific game mode.
 */
public abstract class GameMode {

	/**
	 * Stores a unix time stamp that is either used to display the remaining time or current time, depending
	 * on the {@link #state}.
	 */
	protected long time;
	/**
	 * The current game state.
	 */
	protected GameState state;

	// Preset fields.
	protected int kills;
	protected int killStreak;
	protected long killStreakTime;
	protected int killstreakDuration = 1000 * 20;
	protected int deaths;
	protected String winner;
	protected boolean respawnable;

	public GameMode() {
		this.time = -1;
		killStreakTime = -1;
		this.state = GameState.LOBBY;
		this.respawnable = false;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public GameState getState() {
		return state;
	}

	public void setState(GameState state) {
		this.state = state;
		if (state == GameState.FINISHED) {
			time = System.currentTimeMillis() - time;
		} else {
			this.time = -1;
		}
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getKillStreak() {
		if (killStreakTime != -1 && System.currentTimeMillis() - killStreakTime > 0) {
			killStreakTime = -1;
			killStreak = 0;
		}
		return killStreak;
	}

	public void setKillStreak(int killStreak) {
		this.killStreak = killStreak;
		this.killStreakTime = System.currentTimeMillis() + killstreakDuration;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public boolean isRespawnable() {
		return respawnable;
	}

	public void setRespawnable(boolean canRespawn) {
		this.respawnable = canRespawn;
	}

	public abstract String getName();

}
