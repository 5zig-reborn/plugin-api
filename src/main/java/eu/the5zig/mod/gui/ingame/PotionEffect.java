/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
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
