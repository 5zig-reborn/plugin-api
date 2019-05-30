/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.event;

/**
 * Fired, whenever the client should display a new title.
 */
public class TitleEvent extends Event {

	/**
	 * The title.
	 */
	private String title;
	/**
	 * The subtitle.
	 */
	private String subTitle;

	public TitleEvent(String title, String subTitle) {
		this.title = title;
		this.subTitle = subTitle;
	}

	/**
	 * @return the title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the subtitle.
	 */
	public String getSubTitle() {
		return subTitle;
	}
}
