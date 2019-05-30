/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
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
