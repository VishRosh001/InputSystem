package com.vishrosh.inputsystem.core.mouse.events;

import com.vishrosh.eventsystem.core.Event;
import com.vishrosh.eventsystem.core.EventTypes;

public class MouseEvent extends Event {

	private int x, y, button;
	
	public MouseEvent(EventTypes type, int x, int y, int button) {
		super(type);
		this.setX(x);
		this.setY(y);
		this.setButton(button);
	}
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getButton() {
		return button;
	}


	public void setButton(int button) {
		this.button = button;
	}

}
