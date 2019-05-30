/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.gui.ingame;

import java.util.HashMap;

/**
 * A class that represents a sidebar scoreboard.
 */
public interface Scoreboard {

	/**
	 * @return the title of the scoreboard.
	 */
	String getTitle();

	/**
	 * @return a map, containing all scores together with their name.
	 */
	HashMap<String, Integer> getLines();
}
