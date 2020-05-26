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

import eu.the5zig.mod.The5zigAPI;
import eu.the5zig.mod.render.RenderHelper;
import eu.the5zig.mod.render.RenderLocation;

/**
 * A module item that renders a simple text to the screen. Simply extend this class and
 * override {@link #getValue(boolean)}.
 */
public abstract class StringItem extends AbstractModuleItem {

	/**
	 * Renders a simple text as item onto the screen. The text needs to be returned from an extending class.
	 *
	 * @param x              the x-position of the item.
	 * @param y              the y-position of the item.
	 * @param renderLocation the {@link RenderLocation} of the item.
	 * @param dummy          true, if the item should render dummy values.
	 */
	@Override
	public void render(int x, int y, RenderLocation renderLocation, boolean dummy) {
		String prefix = getPrefix();
		renderPrefix(prefix, x, y);
		RenderHelper renderer = The5zigAPI.getAPI().getRenderHelper();
		String value = String.valueOf(getValue(dummy));
		int mainColor = getMainColor();
		renderer.drawString(formatValue(value), x + renderer.getStringWidth(prefix), y, mainColor);
	}

	/**
	 * Only renders the item when {@link #getValue(boolean)} is not {@code null}.
	 *
	 * @param dummy true, if the item should render dummy values.
	 * @return true, if the item should be rendered.
	 */
	@Override
	public boolean shouldRender(boolean dummy) {
		return getValue(dummy) != null;
	}

	/**
	 * The actual text that will be rendered.
	 *
	 * @param dummy true, if the item should render dummy values.
	 * @return the actual text that will be rendered.
	 */
	private String getText(boolean dummy) {
		return getPrefix() + String.valueOf(getValue(dummy));
	}

	/**
	 * The width of the text.
	 *
	 * @param dummy true, if the item should render dummy values.
	 * @return the width of the module item.
	 */
	@Override
	public int getWidth(boolean dummy) {
		return The5zigAPI.getAPI().getRenderHelper().getStringWidth(getText(dummy));
	}

	/**
	 * The height of the text.
	 *
	 * @param dummy true, if the item should render dummy values.
	 * @return the height of the module item.
	 */
	@Override
	public int getHeight(boolean dummy) {
		return 10;
	}

	/**
	 * Needs to be implemented to return a custom value.
	 *
	 * @param dummy true, if the method should return dummy values.
	 * @return a value that should be rendered or {@code null} if the item should not be rendered to the screen.
	 */
	protected abstract Object getValue(boolean dummy);
}
