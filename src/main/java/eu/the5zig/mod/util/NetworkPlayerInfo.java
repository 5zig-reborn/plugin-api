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

package eu.the5zig.mod.util;

import com.mojang.authlib.GameProfile;

/**
 * A class that represents an entry of the network player list.
 */
public interface NetworkPlayerInfo {

	/**
	 * @return the {@link GameProfile} of this player.
	 */
	GameProfile getGameProfile();

	/**
	 * @return the display name of this player or {@code null}, if no special display name has been set.
	 */
	String getDisplayName();

	/**
	 * Sets a new display name for this player. If the unformatted string does not equal {@link GameProfile#getName()} of this player, a yellow star (*) will be added in front of the name.
	 * <br>
	 * Setting a display name will also override any scoreboard assigned team color.
	 *
	 * @param displayName the new display name for this player.
	 */
	void setDisplayName(String displayName);

	/**
	 * @return the player response time to server in milliseconds.
	 */
	int getPing();

}
