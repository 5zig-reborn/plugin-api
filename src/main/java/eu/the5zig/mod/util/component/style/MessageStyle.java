/*
 * Copyright (c) 2019-2020 5zig Reborn
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

package eu.the5zig.mod.util.component.style;

public class MessageStyle {
    private MessageAction hover;
    private MessageAction click;

    public MessageStyle(MessageAction hover, MessageAction click) {
        this.hover = hover;
        this.click = click;
    }

    public MessageAction getOnClick() {
        return click;
    }

    public MessageAction getOnHover() {
        return hover;
    }

    public void setOnClick(MessageAction click) {
        this.click = click;
    }

    public void setOnHover(MessageAction hover) {
        this.hover = hover;
    }
}
