/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that a method is listening on a specific event.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EventHandler {

	/**
	 * The priority of the event handler. {@link Priority#HIGHEST} will be executed first, {@link Priority#LOWEST}
	 * will be executed last.
	 *
	 * @return the event priority.
	 */
	Priority priority() default Priority.NORMAL;

	/**
	 * @return true, if the event handler should not be called if the event has been cancelled before.
	 */
	boolean ignoreCancelled() default false;

	enum Priority {
		LOWEST, LOW, NORMAL, HIGH, HIGHEST
	}

}
