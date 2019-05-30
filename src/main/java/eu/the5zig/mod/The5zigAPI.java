/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod;

import org.apache.logging.log4j.Logger;

/**
 * Main class that holds the API instance.
 */
public class The5zigAPI {

	/**
	 * Set at runtime by the 5zig mod core.
	 */
	static ModAPI apiInstance;

	/**
	 * Set at runtime by the 5zig mod core.
	 */
	static Logger loggerInstance;

	/**
	 * @return the API instance.
	 */
	public static ModAPI getAPI() {
		return apiInstance;
	}

	/**
	 * @return a logger.
	 */
	public static Logger getLogger() {
		return loggerInstance;
	}

}
