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

package eu.the5zig.mod.modules;

import eu.the5zig.mod.render.RenderHelper;
import eu.the5zig.mod.render.RenderLocation;

/**
 * A module item that can be rendered onto the ingame screen.
 */
public abstract class AbstractModuleItem {

	/**
	 * Some properties of the module item, like settings and the formatting of it.
	 */
	ModuleItemProperties properties;

	RenderSettings renderSettings;

	/**
	 * @return the properties of this module item.
	 */
	public final ModuleItemProperties getProperties() {
		return properties;
	}

	/**
	 * Override this method to register new settings.
	 */
	public void registerSettings() {
	}

	/**
	 * Called, whenever the module item should be rendered.
	 *
	 * @param x              the x-position of the item.
	 * @param y              the y-position of the item.
	 * @param renderLocation the {@link RenderLocation} of the item.
	 * @param dummy          true, if the item should render dummy values.
	 */
	public abstract void render(int x, int y, RenderLocation renderLocation, boolean dummy);

	/**
	 * Implement to return the width of the module item. Usually {@link RenderHelper#getStringWidth(String)}.
	 *
	 * @param dummy true, if the item should render dummy values.
	 * @return the width of the module item.
	 */
	public abstract int getWidth(boolean dummy);

	/**
	 * Implement to return the height of the module item. Usually {@code 10}.
	 *
	 * @param dummy true, if the item should render dummy values.
	 * @return the height of the module item.
	 */
	public abstract int getHeight(boolean dummy);

	/**
	 * Override to specify, when the module item should be rendered.
	 *
	 * @param dummy true, if the item should render dummy values.
	 * @return true, if the item should be rendered.
	 */
	public boolean shouldRender(boolean dummy) {
		return true;
	}

	/**
	 * Override to return a display name.
	 *
	 * @return the name of the module item.
	 * @see #getTranslation() getTranslation(): use this method instead, if you want to return different names for different languages.
	 */
	public String getName() {
		return null;
	}

	/**
	 * @return the translation key of the module item.
	 */
	public String getTranslation() {
		return null;
	}

	/**
	 * Builds a prefix according to the specified text.
	 *
	 * @param prefixText the prefix.
	 * @return a formatted prefix string.
	 */
	protected final String getPrefix(String prefixText) {
		return properties.buildPrefix(prefixText);
	}

	/**
	 * Builds a prefix according to the current display name of the item.
	 *
	 * @return a formatted prefix string.
	 */
	protected final String getPrefix() {
		return properties.buildPrefix();
	}

	/**
	 * Shortens the decimals of a double.
	 *
	 * @param d the double that should be shortened.
	 * @return a shortened string of the double.
	 */
	protected final String shorten(double d) {
		return properties.shorten(d);
	}

	/**
	 * Shortens the decimals of a float.
	 *
	 * @param f the float that should be shortened.
	 * @return a shortened string of the float.
	 */
	protected final String shorten(float f) {
		return properties.shorten(f);
	}

	/**
	 * @return a class that contains various additional settings for the current render pass. The result of this method
	 * is changed each time before {@link AbstractModuleItem#render(int, int, RenderLocation, boolean)} is called.
	 */
	protected RenderSettings getRenderSettings() {
		return renderSettings;
	}

}
