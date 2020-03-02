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
