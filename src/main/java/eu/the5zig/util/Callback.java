/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.util;

public interface Callback<V> {

	/**
	 * Override to listen for a call in the future.
	 *
	 * @param callback a value.
	 */
	void call(V callback);

}
