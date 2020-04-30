package com.vishrosh.inputsystem.core.keyboard.events;

import com.vishrosh.eventsystem.core.EventTypes;

public class KeyReleasedEvent extends KeyEvent{

	public KeyReleasedEvent(int keyCode) {
		super(EventTypes.KeyReleased, keyCode);
	}

}
