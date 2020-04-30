package com.vishrosh.inputsystem.core.keyboard.events;

import com.vishrosh.eventsystem.core.Event;
import com.vishrosh.eventsystem.core.EventTypes;

public class KeyEvent extends Event{

	private int keyCode;
	
	public KeyEvent(EventTypes type, int keyCode) {
		super(type);
		this.keyCode = keyCode;
	}

	public int getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(int keyCode) {
		this.keyCode = keyCode;
	}


}
