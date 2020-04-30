package com.vishrosh.inputsystem.core.mouse.events;

import com.vishrosh.eventsystem.core.EventTypes;

public class MouseReleasedEvent extends MouseEvent{

	public MouseReleasedEvent(int x, int y, int button) {
		super(EventTypes.MouseReleased, x, y, button);
	}

}
