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

package eu.the5zig.mod.plugin;

import eu.the5zig.mod.event.Event;

public interface PluginManager {

	/**
	 * Registers a class as a listener. This method scans through all methods of the specified class and registers all methods
	 * that are annotated by the {@link eu.the5zig.mod.event.EventHandler} annotation.
	 *
	 * @param plugin   the plugin instance.
	 * @param listener an instance of the listener class that should be registered.
	 */
	void registerListener(Object plugin, Object listener);

	/**
	 * Unregisters a listener class instance.
	 *
	 * @param plugin   the plugin instance.
	 * @param listener the listener class instance that should be unregistered.
	 */
	void unregisterListener(Object plugin, Object listener);

	/**
	 * Unregisters all listeners of a plugin.
	 *
	 * @param plugin the plugin instance.
	 */
	void unregisterListener(Object plugin);

	/**
	 * Fires an event and calls all methods that are listening on it.
	 *
	 * @param event the event that should be fired.
	 * @return the fired event (for convenience).
	 */
	<T extends Event> T fireEvent(T event);

}
