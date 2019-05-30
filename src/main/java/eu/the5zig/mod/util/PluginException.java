/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.util;

/**
 * Thrown, if there was any problem when loading a plugin.
 */
public class PluginException extends Exception {

	public PluginException() {
		super();
	}

	public PluginException(String message) {
		super(message);
	}

	public PluginException(String message, Throwable cause) {
		super(message, cause);
	}

	public PluginException(Throwable cause) {
		super(cause);
	}
}
