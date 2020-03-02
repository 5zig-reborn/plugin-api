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
 * Represents multiple messages that have been ignored.
 */
public interface IMultiPatternResult {

	/**
	 * Tries to find a message that messages a specific pattern, specified by the messages file resource key, and
	 * removes it from the ignored messages list.
	 *
	 * @param key the resource key of the pattern.
	 * @return a pattern result or null, if no such message has been ignored.
	 */
	IPatternResult parseKey(String key);

	/**
	 * @return the amount of messages that have not yet been handled.
	 */
	int getRemainingMessageCount();

	/**
	 * Gets a message at a specific index.
	 *
	 * @param index the index of the message.
	 * @return the message at the specified index.
	 */
	String getMessage(int index);

}
