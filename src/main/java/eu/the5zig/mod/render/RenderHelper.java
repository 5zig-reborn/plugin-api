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

package eu.the5zig.mod.render;

import java.util.List;

/**
 * A class that contains various render utility methods.
 */
public interface RenderHelper {

	/**
	 * Draws a String at given position with shadow.
	 *
	 * @param string The String
	 * @param x      The x Coordinate
	 * @param y      The y Coordinate
	 * @param format Arguments referenced by the format specifiers in the format string
	 */
	void drawString(String string, int x, int y, Object... format);

	/**
	 * Draws a String at given position with shadow.
	 *
	 * @param string The String
	 * @param x      The x Coordinate
	 * @param y      The y Coordinate
	 */
	void drawString(String string, int x, int y);

	/**
	 * Draws a centered String at given position with shadow.
	 *
	 * @param string The String
	 * @param x      The x Coordinate/the middle of the rendered text.
	 * @param y      The y Coordinate
	 */
	void drawCenteredString(String string, int x, int y);

	/**
	 * Draws a centered String at given position.
	 *
	 * @param string The String
	 * @param x      The x Coordinate/the middle of the rendered text.
	 * @param y      The y Coordinate
	 * @param color  The hex-color the rendered text should have.
	 */
	void drawCenteredString(String string, int x, int y, int color);

	/**
	 * Draws a String at given position with color and shadow.
	 *
	 * @param string The String
	 * @param x      The y Coordinate
	 * @param y      The x Coordinate
	 * @param color  The color of the String
	 * @param format Arguments referenced by the format specifiers in the format string
	 */
	void drawString(String string, int x, int y, int color, Object... format);

	/**
	 * Draws a String at given position with color and shadow.
	 *
	 * @param string The String
	 * @param x      The y Coordinate
	 * @param y      The x Coordinate
	 * @param color  The color of the String
	 */
	void drawString(String string, int x, int y, int color);

	/**
	 * Draws a String at given position with color.
	 *
	 * @param string     The String
	 * @param x          The y Coordinate
	 * @param y          The x Coordinate
	 * @param color      The color of the String
	 * @param withShadow True, if the String should have a shadow.
	 */
	void drawString(String string, int x, int y, int color, boolean withShadow);

	/**
	 * Splits the input string into parts that are not longer than the specified max width.
	 *
	 * @param string   The string that should be split.
	 * @param maxWidth The maximum width the split parts should be long.
	 * @return a list containing all split parts of the String.
	 */
	List<String> splitStringToWidth(String string, int maxWidth);

	/**
	 * @param string The String whose width should be calculated.
	 * @return the width of the String.
	 */
	int getStringWidth(String string);

	/**
	 * Shortens a String to a specified width.
	 *
	 * @param string The String that should be shortened.
	 * @param width  The maximum width the String should have.
	 * @return a String that is not longer than the specified width.
	 */
	String shortenToWidth(String string, int width);

	/**
	 * Draws a rectangle at given position.
	 *
	 * @param left   the left x-coordinate of the rectangle.
	 * @param top    the top y-coordinate of the rectangle.
	 * @param right  the right x-coordinate of the rectangle.
	 * @param bottom the bottom y-coordinate of the rectangle.
	 * @param color  the color of the rectangle, as hexadecimal argb-value.
	 *               Eg. red: {@code 0xFFFF0000}, blue: {@code 0xFF0000FF}, 50% opaque green: {@code 0x8800FF00}.
	 */
	void drawRect(double left, double top, double right, double bottom, int color);

	/**
	 * Draws a rectangle with a gradient at given position.
	 *
	 * @param left             the left x-coordinate of the rectangle.
	 * @param top              the top y-coordinate of the rectangle.
	 * @param right            the right x-coordinate of the rectangle.
	 * @param bottom           the bottom y-coordinate of the rectangle.
	 * @param startColor       the start color of the rectangle, as hexadecimal argb-value.
	 *                         Eg. red: {@code 0xFFFF0000}, blue: {@code 0xFF0000FF}, 50% opaque green: {@code 0x8800FF00}.
	 * @param endColor         the end color of the rectangle, as hexadecimal argb-value.
	 *                         Eg. red: {@code 0xFFFF0000}, blue: {@code 0xFF0000FF}, 50% opaque green: {@code 0x8800FF00}.
	 * @param verticalGradient true, if the gradient should be on the vertical axis, false, if the gradient
	 *                         should be on the vertical axis.
	 */
	void drawGradientRect(double left, double top, double right, double bottom, int startColor, int endColor, boolean verticalGradient);

	/**
	 * Draws the outline of a rectangle at given position.
	 *
	 * @param left   the left x-coordinate of the rectangle.
	 * @param top    the top y-coordinate of the rectangle.
	 * @param right  the right x-coordinate of the rectangle.
	 * @param bottom the bottom y-coordinate of the rectangle.
	 * @param color  the color of the rectangle, as hexadecimal argb-value.
	 *               Eg. red: {@code 0xFFFF0000}, blue: {@code 0xFF0000FF}, 50% opaque green: {@code 0x8800FF00}.
	 */
	void drawRectOutline(int left, int top, int right, int bottom, int color);

	/**
	 * Draws the inline of a rectangle at given position.
	 *
	 * @param left   the left x-coordinate of the rectangle.
	 * @param top    the top y-coordinate of the rectangle.
	 * @param right  the right x-coordinate of the rectangle.
	 * @param bottom the bottom y-coordinate of the rectangle.
	 * @param color  the color of the rectangle, as hexadecimal argb-value.
	 *               Eg. red: {@code 0xFFFF0000}, blue: {@code 0xFF0000FF}, 50% opaque green: {@code 0x8800FF00}.
	 */
	void drawRectInline(int left, int top, int right, int bottom, int color);

	/**
	 * Draws a centered, scaled string at given position.
	 *
	 * @param string the string that should be rendered.
	 * @param x      the center of the horizontal axis of the string.
	 * @param y      the y-position of the string.
	 * @param scale  the scale of the string.
	 */
	void drawScaledCenteredString(String string, int x, int y, float scale);

	/**
	 * Draws a scaled string at given position.
	 *
	 * @param string the string that should be rendered.
	 * @param x      the x-position of the string.
	 * @param y      the y-position of the string.
	 * @param scale  the scale of the string.
	 */
	void drawScaledString(String string, int x, int y, float scale);

	/**
	 * Draws a large text to the center of the screen. Only one large text will be rendered at once.
	 *
	 * @param string the string that should be drawn.
	 */
	void drawLargeText(String string);

}
