/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.event;

/**
 * Fired, whenever the client receives an action bar message from the server.
 */
public class ActionBarEvent extends Event implements Cancelable {

	/**
	 * The message of the server.
	 */
	private String message;

	/**
	 * Indicates whether this event has been cancelled.
	 */
	private boolean cancelled;

	public ActionBarEvent(String message) {
		this.message = message;
	}

	/**
	 * @return the action bar message that the client has received from the server.
	 */
	public String getMessage() {
		return message;
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
