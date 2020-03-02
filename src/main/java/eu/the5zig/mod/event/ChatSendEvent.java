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
 * Called before a chat message gets sent from the client to the server.
 *
 * @since 1.0.3
 */
public class ChatSendEvent extends Event implements Cancelable {

	/**
	 * The message of the event.
	 */
	private String message;
	/**
	 * Indicates whether the event has been cancelled.
	 */
	private boolean cancelled;

	public ChatSendEvent(String message) {
		this.message = message;
	}

	/**
	 * @return the chat message that will be sent to the server.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Alters the message that should be sent.
	 *
	 * @param message the new message that should be sent instead.
	 * @throws NullPointerException if the message is {@code null}.
	 */
	public void setMessage(String message) {
		if (message == null) {
			throw new NullPointerException("Message cannot be null.");
		}
		this.message = message;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
}
