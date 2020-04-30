package com.vishrosh.inputsystem.core.keyboard.events;

import com.vishrosh.eventsystem.core.EventTypes;

public class KeyPressedEvent extends KeyEvent{

	public KeyPressedEvent(int keyCode) {
		super(EventTypes.KeyPressed, keyCode);
	}

}
