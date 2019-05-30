/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
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
