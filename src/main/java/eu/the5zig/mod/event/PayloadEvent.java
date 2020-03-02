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

import io.netty.buffer.ByteBuf;

/**
 * Called, whenever the client receives a custom payload from the server.
 */
public class PayloadEvent extends Event {

	/**
	 * The channel the payload has been sent on.
	 */
	private String channel;
	/**
	 * The payload itself.
	 */
	private ByteBuf payload;

	public PayloadEvent(String channel, ByteBuf payload) {
		this.channel = channel;
		this.payload = payload;
	}

	/**
	 * @return the channel the payload has been sent on.
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @return the custom payload that has been sent.
	 */
	public ByteBuf getPayload() {
		return payload;
	}
}
