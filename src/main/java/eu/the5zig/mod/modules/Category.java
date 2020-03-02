/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.modules;

/**
 * All categories that a module can have.
 */
public enum Category {

	GENERAL("GENERAL"), EQUIP("EQUIP"), SERVER_GENERAL("SERVER_GENERAL"), SERVER_TIMOLIA("SERVER_TIMOLIA"), SERVER_GOMMEHD("SERVER_GOMMEHD"), SERVER_PLAYMINITY("SERVER_PLAYMINITY"),
	SERVER_BERGWERK("SERVER_BERGWERK"), SERVER_HYPIXEL("SERVER_HYPIXEL"), SERVER_VENICRAFT("SERVER_VENICRAFT"), SERVER_CYTOOXIEN("SERVER_CYTOOXIEN"), SERVER_SIMPLEHG("SERVER_SIMPLEHG"),
	SERVER_OCC("SERVER_OCC"),
	SYSTEM("SYSTEM"), OTHER("OTHER");

	private String name;

	Category(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
