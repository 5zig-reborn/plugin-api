/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.config;

/**
 * Represents a config entry.
 *
 * @param <T> the (primitive) type of the entry.
 */
public interface IConfigItem<T> {

	/**
	 * @return the value of the config entry.
	 */
	T get();

}
