package com.vishrosh.inputsystem.core.keyboard.listeners;

import com.vishrosh.eventsystem.core.DefaultEventHandler;
import com.vishrosh.eventsystem.core.EventBus;
import com.vishrosh.eventsystem.core.IEventListener;
import com.vishrosh.inputsystem.core.keyboard.events.KeyTypedEvent;

public class KeyTypedEventListener implements IEventListener<KeyTypedEvent>{

	@Override
	public void onEvent(KeyTypedEvent event) {
		EventBus.publishEvent(event, new DefaultEventHandler<KeyTypedEvent>());
	}

}
