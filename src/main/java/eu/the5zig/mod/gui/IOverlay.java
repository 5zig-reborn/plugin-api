/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.gui;

/**
 * Represents an overlay that can display a notification in the top right corner of the screen.
 */
public interface IOverlay {

	/**
	 * Displays an overlay.
	 *
	 * @param title    the title of the overlay (will be rendered in yellow, if no other color specified).
	 * @param subtitle the subtitle of the overlay.
	 */
	void displayMessage(String title, String subtitle);

	/**
	 * Displays an overlay.
	 *
	 * @param title           the title of the overlay (will be rendered in yellow, if no other color specified).
	 * @param subtitle        the subtitle of the overlay.
	 * @param uniqueReference a unique reference that allows future modification of the overlay.
	 * @since 1.0.12, Minecraft 1.12
	 */
	void displayMessage(String title, String subtitle, Object uniqueReference);

	/**
	 * Displays an overlay.
	 *
	 * @param message the subtitle of the overlay. The title will be {@code "The 5zig Mod"}
	 */
	void displayMessage(String message);

	/**
	 * Displays an overlay.
	 *
	 * @param message         the subtitle of the overlay. The title will be {@code "The 5zig Mod"}
	 * @param uniqueReference a unique reference that allows future modification of the overlay.
	 * @since 1.0.12, Minecraft 1.12
	 */
	void displayMessage(String message, Object uniqueReference);

	/**
	 * Displays an overlay and splits the message into two lines.
	 *
	 * @param message the message that should be displayed.
	 */
	void displayMessageAndSplit(String message);

	/**
	 * Displays an overlay and splits the message into two lines.
	 *
	 * @param message         the message that should be displayed.
	 * @param uniqueReference a unique reference that allows future modification of the overlay.
	 * @since 1.0.12, Minecraft 1.12
	 */
	void displayMessageAndSplit(String message, Object uniqueReference);

}
