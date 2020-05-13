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

import eu.the5zig.mod.util.component.MessageComponent;

public class MessageAction {

    private String stringValue;
    private MessageComponent componentValue;
    private Action action;

    public MessageAction(Action action, String value) {
        this.stringValue = value;
        this.action = action;
    }

    public MessageAction(Action action, MessageComponent value) {
        this.componentValue = value;
        this.action = action;
    }

    public String getString() {
        return stringValue;
    }

    public Action getAction() {
        return action;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setComponentValue(MessageComponent componentValue) {
        this.componentValue = componentValue;
    }

    public MessageComponent getComponent() {
        return componentValue;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public enum Action {

        OPEN_URL(Type.CLICK),
        OPEN_FILE(Type.CLICK),
        RUN_COMMAND(Type.CLICK),
        SUGGEST_COMMAND(Type.CLICK),
        SHOW_TEXT(Type.HOVER);

        private Type type;

        Action(Type type) {
            this.type = type;
        }

        public enum Type {
            HOVER, CLICK
        }
    }
}
