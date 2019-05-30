/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
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
