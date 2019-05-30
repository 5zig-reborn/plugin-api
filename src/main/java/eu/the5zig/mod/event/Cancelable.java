/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.event;

/**
 * Indicates that the event can be cancelled.
 */
public interface Cancelable {

	/**
	 * @return true, if the event has been cancelled.
	 */
	boolean isCancelled();

	/**
	 * Sets the cancellation status of the event.
	 *
	 * @param cancelled true, if the event should be cancelled.
	 */
	void setCancelled(boolean cancelled);

}
