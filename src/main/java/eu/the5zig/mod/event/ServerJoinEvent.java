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

package eu.the5zig.mod.event;

/**
 * Fired, whenever the client joins a Minecraft server (network). This does <b>not</b> include switching servers on a BungeeCord network.
 */
public class ServerJoinEvent extends Event {

	/**
	 * The host of the server.
	 */
	private String host;
	/**
	 * The port of the port.
	 */
	private int port;

	public ServerJoinEvent(String host, int port) {
		this.host = host;
		this.port = port;
	}

	/**
	 * @return the host of the server.
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @return the port of the server.
	 */
	public int getPort() {
		return port;
	}
}
