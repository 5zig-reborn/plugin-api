/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.server;

/**
 * Represents the result of a matched pattern.
 */
public interface IPatternResult {

	/**
	 * @return the size of the result.
	 */
	int size();

	/**
	 * Gets a matched group at the specified index.
	 *
	 * @param index the index.
	 * @return a matched group at the specified index or an empty string, in the index exceeds the total group count.
	 */
	String get(int index);

	/**
	 * Allows you to ignore the matched message.
	 *
	 * @param ignore true, if the matched message should be ignored.
	 * @since 1.0.1
	 */
	void ignoreMessage(boolean ignore);

}
