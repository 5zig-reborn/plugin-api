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

package eu.the5zig.mod.util;

public interface CoordinateClipboard {
    /**
     * @return The x coordinate
     */
    int getLocationX();

    /**
     * @return The z coordinate
     */
    int getLocationZ();

    /**
     * Sets a new location
     * @param x The x coordinate
     * @param z The z coordinate
     */
    void setLocation(int x, int z);

    /**
     * @return The previous coordinates
     */
    CoordinateClipboard getPrevious();

    /**
     * @return The next coordinates
     */
    CoordinateClipboard getNext();

    /**
     * Creates a new coordinates page and appends it to the current one.
     * @return The new coordinates page
     */
    CoordinateClipboard makeNext();
}
