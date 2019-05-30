/*
 * Copyright (c) 2019 5zig
 *
 * This software is released under the MIT License.
 * https://opensource.org/licenses/MIT
 */

package eu.the5zig.mod.modules;

import eu.the5zig.mod.The5zigAPI;
import eu.the5zig.mod.render.RenderLocation;
import eu.the5zig.mod.server.GameMode;
import eu.the5zig.mod.server.GameState;

public abstract class LargeTextItem<T extends GameMode> extends GameModeItem<T> {

	public LargeTextItem(Class<? extends T> modeClass, GameState... state) {
		super(modeClass, state);
	}

	@Override
	public void render(int x, int y, RenderLocation renderLocation, boolean dummy) {
		if (dummy) {
			return;
		}
		The5zigAPI.getAPI().getRenderHelper().drawLargeText(The5zigAPI.getAPI().getFormatting().getPrefixFormatting() + getText());
	}

	protected abstract String getText();

	@Override
	protected Object getValue(boolean dummy) {
		return getText();
	}

	@Override
	public int getWidth(boolean dummy) {
		return 0;
	}

	@Override
	public int getHeight(boolean dummy) {
		return 0;
	}
}
