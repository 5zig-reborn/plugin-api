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
 * Called, when the client has received a chat message from the server.
 */
public class ChatEvent extends Event implements Cancelable {

	/**
	 * The message of the server.
	 */
	private String originalMessage;
	/**
	 * Can be changed by plugins.
	 */
	private String message;
	/**
	 * An object that represents a 5zig chat component.
	 */
	private Object chatComponent;
	/**
	 * An object that represents a Minecraft chat component. Used internally to send messages to the second chat.
	 */
	private Object mcComponent;

	/**
	 * Indicates whether the event has been cancelled.
	 */
	private boolean cancelled;

	public ChatEvent(String message, Object chatComponent, Object mcComponent) {
		this.originalMessage = message;
		this.chatComponent = chatComponent;
		this.mcComponent = mcComponent;
	}

	/**
	 * @return the chat message that has been received.
	 */
	public String getMessage() {
		return originalMessage;
	}

	/**
	 * Changes the chat message. The message will be only changed if {@link #isCancelled()} is {@code false}.
	 * Note, that {@link #getMessage()} still returns the original message to maintain compatibility.
	 *
	 * @param message the new message.
	 */
	public void setMessage(String message) {
		if (message == null || !message.equals(originalMessage)) {
			this.message = message;
		}
	}

	/**
	 * @return the chat message that has been changed by plugins or {@code null}, if the chat message has not been changed.
	 */
	public String getAlteredMessage() {
		return message;
	}

	/**
	 * @return the 5zig internal chat component.
	 */
	public Object getChatComponent() {
		return chatComponent;
	}

	/**
	 * @return the Minecraft internal chat component.
	 */
	public Object getMinecraftComponent() {
		return mcComponent;
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
