/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.util;

/**
 * Represents a keybinding.
 *
 * @see eu.the5zig.mod.ModAPI#registerKeyBiding(String, int, String)
 */
public interface IKeybinding {

	/**
	 * @return true, if the keybinding has been pressed.
	 */
	boolean callIsPressed();

	/**
	 * @return the key code of the keybinding.
	 */
	int callGetKeyCode();

}
