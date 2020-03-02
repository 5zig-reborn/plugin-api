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
 * Called when a player finishes editing a sign.
 *
 * @since 1.0.9
 */
public class SignEditEvent extends Event {

	/**
	 * The lines of the sign
	 */
	private String[] lines;

	public SignEditEvent(String[] lines) {
		this.lines = lines;
	}

	/**
	 * Gets the text of a specific line.
	 *
	 * @param index the index of the line.
	 * @return the text of a specific line.
	 */
	public String getLine(int index) {
		return lines[index];
	}

	/**
	 * Changes the text of a specific line.
	 *
	 * @param index the index of the line
	 * @param text  the new text
	 * @throws NullPointerException if the text is {@code null}.
	 */
	public void setLine(int index, String text) {
		if (text == null) {
			throw new NullPointerException("Line cannot be null.");
		}
		this.lines[index] = text;
	}

	/**
	 * @return an array that contains all lines of the sign.
	 */
	public String[] getLines() {
		return lines;
	}
}
