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

package eu.the5zig.mod.gui.ingame;

import java.util.List;

public interface ItemStack {

	/**
	 * @return the amount of items in this stack
	 */
	int getAmount();

	/**
	 * @return the maximum durability of the ItemStack.
	 */
	int getMaxDurability();

	/**
	 * @return the current durability of the ItemStack.
	 */
	int getCurrentDurability();

	/**
	 * @return the resource key of the ItemStack.
	 */
	String getKey();

	/**
	 * @return the display name of the ItemStack.
	 */
	String getDisplayName();

	/**
	 * @return the lore of the ItemStack.
	 */
	List<String> getLore();

	/**
	 * @return the food regeneration amount of this item or {@code 0}, if this item is not a food item.
	 */
	int getHealAmount();

	/**
	 * @return the food saturation of this item or {@code 0}, if this item is not a food item.
	 */
	float getSaturationModifier();

	/**
	 * Renders the ItemStack to the screen at given coordinates.
	 *
	 * @param x                     the x-position of the ItemStack.
	 * @param y                     the y-position of the ItemStack.
	 * @param withGenericAttributes true, of the ItemStack should be rendered with generic attributes, indicated by small numbers.
	 */
	void render(int x, int y, boolean withGenericAttributes);

}
