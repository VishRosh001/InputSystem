package com.vishrosh.inputsystem.core.mouse.listeners;

import com.vishrosh.eventsystem.core.DefaultEventHandler;
import com.vishrosh.eventsystem.core.EventBus;
import com.vishrosh.eventsystem.core.IEventListener;
import com.vishrosh.inputsystem.core.mouse.events.MousePressedEvent;

public class MousePressedEventListener implements IEventListener<MousePressedEvent>{

	@Override
	public void onEvent(MousePressedEvent e) {
		EventBus.publishEvent(e, new DefaultEventHandler<MousePressedEvent>());
	}

}
