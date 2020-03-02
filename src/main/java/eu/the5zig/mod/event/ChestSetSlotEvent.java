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

import eu.the5zig.mod.gui.ingame.ItemStack;

/**
 * This event is called whenever an item gets set into the slot of a chest.
 */
public class ChestSetSlotEvent extends Event {

	/**
	 * The title of the chest.
	 */
	private String containerTitle;
	/**
	 * The slot where the {@link #itemStack} has been set to.
	 */
	private int slot;
	/**
	 * The {@link ItemStack} that has been set.
	 */
	private ItemStack itemStack;

	public ChestSetSlotEvent(String containerTitle, int slot, ItemStack itemStack) {
		this.containerTitle = containerTitle;
		this.slot = slot;
		this.itemStack = itemStack;
	}

	/**
	 * @return the title of the chest.
	 */
	public String getContainerTitle() {
		return containerTitle;
	}

	/**
	 * @return the slot, whether the {@link ItemStack} has been set to.
	 */
	public int getSlot() {
		return slot;
	}

	/**
	 * @return the {@link ItemStack} that has been set.
	 */
	public ItemStack getItemStack() {
		return itemStack;
	}
}
