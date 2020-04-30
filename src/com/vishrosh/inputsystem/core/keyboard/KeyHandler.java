package com.vishrosh.inputsystem.core.keyboard;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.vishrosh.inputsystem.core.keyboard.events.KeyPressedEvent;
import com.vishrosh.inputsystem.core.keyboard.events.KeyReleasedEvent;
import com.vishrosh.inputsystem.core.keyboard.events.KeyTypedEvent;
import com.vishrosh.inputsystem.core.keyboard.listeners.KeyPressedEventListener;
import com.vishrosh.inputsystem.core.keyboard.listeners.KeyReleasedEventListener;
import com.vishrosh.inputsystem.core.keyboard.listeners.KeyTypedEventListener;

public class KeyHandler implements KeyListener{
	
	KeyPressedEventListener kpl = new KeyPressedEventListener();
	KeyReleasedEventListener krl = new KeyReleasedEventListener();
	KeyTypedEventListener ktl = new KeyTypedEventListener();
	
	@Override
	public void keyPressed(KeyEvent e) {
		kpl.onEvent(new KeyPressedEvent(e.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		krl.onEvent(new KeyReleasedEvent(e.getKeyCode()));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		ktl.onEvent(new KeyTypedEvent(e.getKeyChar()));
	}

}
