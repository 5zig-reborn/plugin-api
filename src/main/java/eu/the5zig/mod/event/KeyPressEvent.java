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
 * Fired, whenever the client presses a key while in game.
 */
public class KeyPressEvent extends Event {

	/**
	 * The {@link org.lwjgl.input.Keyboard} key code of the key that has been pressed.
	 */
	private int keyCode;

	public KeyPressEvent(int keyCode) {
		this.keyCode = keyCode;
	}

	/**
	 * @return the {@link org.lwjgl.input.Keyboard} key code of the key that has been pressed.
	 */
	public int getKeyCode() {
		return keyCode;
	}
}
