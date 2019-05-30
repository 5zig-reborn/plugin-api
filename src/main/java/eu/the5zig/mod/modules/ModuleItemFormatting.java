/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.modules;

import eu.the5zig.util.minecraft.ChatColor;

/**
 * Stores the formatting of a module item.
 */
public interface ModuleItemFormatting {

	/**
	 * @return the formatting of the prefix (either {@link ChatColor#RESET}, {@link ChatColor#BOLD},
	 * {@link ChatColor#ITALIC}, {@link ChatColor#UNDERLINE} or {@link ChatColor#STRIKETHROUGH}).
	 */
	ChatColor getPrefixFormatting();

	/**
	 * @return the color of the prefix.
	 */
	ChatColor getPrefixColor();

	/**
	 * @return the main formatting (either {@link ChatColor#RESET}, {@link ChatColor#BOLD},
	 * {@link ChatColor#ITALIC}, {@link ChatColor#UNDERLINE} or {@link ChatColor#STRIKETHROUGH}).
	 */
	ChatColor getMainFormatting();

	/**
	 * @return the main color.
	 */
	ChatColor getMainColor();

}