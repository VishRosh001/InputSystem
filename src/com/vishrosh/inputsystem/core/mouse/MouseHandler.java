package com.vishrosh.inputsystem.core.mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.vishrosh.inputsystem.core.mouse.events.MousePressedEvent;
import com.vishrosh.inputsystem.core.mouse.listeners.MousePressedEventListener;

public class MouseHandler implements MouseListener{
	
	MousePressedEventListener mpl = new MousePressedEventListener();
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("sdfs");
		mpl.onEvent(new MousePressedEvent(e.getX(), e.getY(), e.getButton()));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

}
