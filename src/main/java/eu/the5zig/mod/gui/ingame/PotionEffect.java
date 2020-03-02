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

public interface PotionEffect extends Comparable<PotionEffect> {

	/**
	 * @return the name of the potion effect.
	 */
	String getName();

	/**
	 * @return the remaining time of the potion effect in ticks.
	 */
	int getTime();

	/**
	 * @return the formatted time string of the potion effect.
	 */
	String getTimeString();

	/**
	 * @return the amplifier of the potion effect, starting from 0.
	 */
	int getAmplifier();

	/**
	 * @return the icon index of the potion effect or -1, if it has no item.
	 */
	int getIconIndex();

	/**
	 * @return true, if the potion effect is good.
	 */
	boolean isGood();

	/**
	 * @return true, if the potion effect emits particles.
	 */
	boolean hasParticles();

	/**
	 * @return the color of the liquid for this potion.
	 */
	int getLiquidColor();

}
