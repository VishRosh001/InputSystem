package com.vishrosh.inputsystem.core.keyboard.events;

import com.vishrosh.eventsystem.core.Event;
import com.vishrosh.eventsystem.core.EventTypes;

public class KeyTypedEvent extends Event{
	
	private char keyChar;
	
	public KeyTypedEvent(char keyChar) {
		super(EventTypes.KeyTyped);
		this.setKeyChar(keyChar);
	}

	public char getKeyChar() {
		return keyChar;
	}

	public void setKeyChar(char keyChar) {
		this.keyChar = keyChar;
	}

}
