package com.vishrosh.inputsystem.core.keyboard.listeners;

import com.vishrosh.eventsystem.core.DefaultEventHandler;
import com.vishrosh.eventsystem.core.EventBus;
import com.vishrosh.eventsystem.core.IEventListener;
import com.vishrosh.inputsystem.core.keyboard.events.KeyPressedEvent;

public class KeyPressedEventListener implements IEventListener<KeyPressedEvent>{

	@Override
	public void onEvent(KeyPressedEvent event) {
		EventBus.publishEvent(event, new DefaultEventHandler<KeyPressedEvent>());
	}
	
}
