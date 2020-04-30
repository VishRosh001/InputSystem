package com.vishrosh.inputsystem.core.mouse.events;

import com.vishrosh.eventsystem.core.EventTypes;

public class MousePressedEvent extends MouseEvent{
	
	public MousePressedEvent(int x, int y, int button) {
		super(EventTypes.MousePressed, x, y, button);
	}
	
}
