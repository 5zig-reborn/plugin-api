/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.event;

/**
 * Fired every tick, as long as the client is in a world.
 */
public class WorldTickEvent extends Event {

	/**
	 * Contains a static instance of the event, as we don't want to create a new instance of an "empty" class every tick.
	 */
	public static final WorldTickEvent INSTANCE = new WorldTickEvent();

	private WorldTickEvent() {
	}
}