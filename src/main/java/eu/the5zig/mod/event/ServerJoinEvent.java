/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
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
