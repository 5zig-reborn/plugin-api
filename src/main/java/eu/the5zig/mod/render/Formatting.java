/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.render;

public interface Formatting {

	/**
	 * @return the default formatting of the prefixes of all module items.
	 */
	String getPrefixFormatting();

	/**
	 * @return the default formatting of all module items.
	 */
	String getMainFormatting();

	/**
	 * @return the default formatting of the brackets of all module items.
	 */
	String getBracketFormatting();

}
