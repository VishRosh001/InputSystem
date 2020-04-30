package com.vishrosh.inputsystem.core.keyboard.listeners;

import com.vishrosh.eventsystem.core.DefaultEventHandler;
import com.vishrosh.eventsystem.core.EventBus;
import com.vishrosh.eventsystem.core.IEventListener;
import com.vishrosh.inputsystem.core.keyboard.events.KeyReleasedEvent;

public class KeyReleasedEventListener implements IEventListener<KeyReleasedEvent>{

	@Override
	public void onEvent(KeyReleasedEvent event) {
		EventBus.publishEvent(event, new DefaultEventHandler<KeyReleasedEvent>());
	}

}
