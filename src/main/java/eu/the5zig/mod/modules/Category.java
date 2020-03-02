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
