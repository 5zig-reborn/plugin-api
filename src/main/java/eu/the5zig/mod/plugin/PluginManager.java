/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
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
