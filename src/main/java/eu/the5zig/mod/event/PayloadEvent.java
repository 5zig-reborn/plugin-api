/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
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
