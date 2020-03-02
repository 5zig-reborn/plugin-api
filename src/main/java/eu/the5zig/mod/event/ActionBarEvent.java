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
