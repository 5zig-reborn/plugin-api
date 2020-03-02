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

import eu.the5zig.mod.config.IConfigItem;
import eu.the5zig.util.Callable;

public interface ModuleItemProperties {

	/**
	 * Adds a setting to the module item.
	 *
	 * @param key          the identifier of the setting.
	 * @param defaultValue the default value of the setting.
	 * @param maxValue     the maximum value for the setting. When reaching it, the setting will start at zero again.
	 * @see #getSetting(String)
	 */
	void addSetting(String key, int defaultValue, int maxValue);

	/**
	 * Adds a setting to the module item.
	 *
	 * @param key          the identifier of the setting.
	 * @param defaultValue the default value of the setting.
	 * @param maxValue     the maximum value for the setting. When reaching it, the setting will start at zero again.
	 * @param customValue  a {@link Callable} that is used to display a custom value.
	 * @see #getSetting(String)
	 */
	void addSetting(String key, int defaultValue, int maxValue, Callable<String> customValue);

	/**
	 * Adds a setting to the module item.
	 *
	 * @param key          the identifier of the setting.
	 * @param defaultValue the default value of the setting.
	 * @param maxValue     the maximum value for the setting. When reaching it, the setting will start at zero again.
	 * @see #getSetting(String)
	 */
	void addSetting(String key, float defaultValue, float maxValue);

	/**
	 * Adds a setting to the module item. Will be displayed as slider.
	 *
	 * @param key          the identifier of the setting.
	 * @param suffix       the suffix of the setting.
	 * @param defaultValue the default value of the setting.
	 * @param minValue     the minimum value of the setting.
	 * @param maxValue     the maximum value of the setting.
	 * @param steps        the amount of steps or {@code -1} if the value should not be clamped.
	 * @see #getSetting(String)
	 */
	void addSetting(String key, String suffix, float defaultValue, float minValue, float maxValue, int steps);

	/**
	 * Adds a setting to the module item.
	 *
	 * @param key          the identifier of the setting.
	 * @param defaultValue the default value of the setting.
	 * @see #getSetting(String)
	 */
	void addSetting(String key, boolean defaultValue);

	/**
	 * Adds a setting to the module item.
	 *
	 * @param key          the identifier of the setting.
	 * @param defaultValue the default value of the setting.
	 * @param enumClass    the class of the Enum.
	 * @see #getSetting(String)
	 */
	<E extends Enum> void addSetting(String key, E defaultValue, Class<E> enumClass);

	IConfigItem getSetting(String key);

	/**
	 * @return the formatting of the module item or {@code null}, if the default mod formatting
	 * should be used.
	 * @see #setFormatting(ModuleItemFormatting)
	 */
	ModuleItemFormatting getFormatting();

	/**
	 * Sets the formatting of the module item.
	 *
	 * @param formatting the formatting or {@code null}, if the default mod formatting should
	 *                   be used.
	 * @see #getFormatting()
	 */
	void setFormatting(ModuleItemFormatting formatting);

	/**
	 * @return true, if the prefix of the module item is currently visible.
	 * @see #setShowPrefix(boolean)
	 */
	boolean isShowPrefix();

	/**
	 * Sets the visibility of the prefix.
	 *
	 * @param showPrefix true, if the prefix of the module item should be shown.
	 * @see #isShowPrefix()
	 */
	void setShowPrefix(boolean showPrefix);

	/**
	 * @return the display name of the module name. Either {@link AbstractModuleItem#getName()}
	 * or {@link AbstractModuleItem#getTranslation()}, depending whether the method returns {@code null}
	 * or not.
	 */
	String getDisplayName();

	/**
	 * Builds a prefix according to the specified prefix. The formatting that will be used is
	 * either {@link #getFormatting()} or the default mod formatting.
	 *
	 * @param prefixText the prefix.
	 * @return a formatted prefix string.
	 * @see #buildPrefix()
	 */
	String buildPrefix(String prefixText);

	/**
	 * Builds a prefix according to the current display name. The formatting that will be used is
	 * either {@link #getFormatting()} or the default mod formatting.
	 *
	 * @return a formatted prefix string.
	 * @see #buildPrefix(String)
	 */
	String buildPrefix();

	/**
	 * Shortens the decimals of a double.
	 *
	 * @param d the double that should be shortened.
	 * @return a shortened string of the double.
	 */
	String shorten(double d);

	/**
	 * Shortens the decimals of a float.
	 *
	 * @param f the float that should be shortened.
	 * @return a shortened string of the float.
	 */
	String shorten(float f);

}
