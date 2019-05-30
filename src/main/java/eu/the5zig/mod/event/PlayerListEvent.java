/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.event;

public class PlayerListEvent extends Event {

	private String header;
	private String footer;

	public PlayerListEvent(String header, String footer) {
		this.header = header;
		this.footer = footer;
	}

	public String getHeader() {
		return header;
	}

	public String getFooter() {
		return footer;
	}
}
