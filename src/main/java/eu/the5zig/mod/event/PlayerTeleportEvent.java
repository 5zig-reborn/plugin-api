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

package eu.the5zig.mod.event;

/**
 * Fired, when the server teleports the client to a new Location
 */
public class PlayerTeleportEvent extends Event {

	/**
	 * The absolute x-coordinate of the player.
	 */
	private double x;
	/**
	 * The absolute y-coordinate of the player.
	 */
	private double y;
	/**
	 * The absolute z-coordinate of the player.
	 */
	private double z;
	/**
	 * The yaw-rotation of the player.
	 */
	private float yaw;
	/**
	 * The pitch-rotation of the player.
	 */
	private float pitch;

	public PlayerTeleportEvent(double x, double y, double z, float yaw, float pitch) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.yaw = yaw;
		this.pitch = pitch;
	}

	/**
	 * @return the absolute x-coordinate of the player.
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return the absolute y-coordinate of the player.
	 */
	public double getY() {
		return y;
	}

	/**
	 * @return the absolute z-coordinate of the player.
	 */
	public double getZ() {
		return z;
	}

	/**
	 * @return the yaw-rotation of the player.
	 */
	public float getYaw() {
		return yaw;
	}

	/**
	 * @return the pitch-rotation of the player.
	 */
	public float getPitch() {
		return pitch;
	}
}
