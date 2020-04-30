package com.vishrosh.inputsystem.tests;

import javax.swing.JFrame;

import com.vishrosh.eventsystem.core.EventTypes;
import com.vishrosh.eventsystem.core.SubscribeEvent;
import com.vishrosh.inputsystem.core.keyboard.KeyHandler;
import com.vishrosh.inputsystem.core.keyboard.events.KeyPressedEvent;
import com.vishrosh.inputsystem.core.keyboard.events.KeyReleasedEvent;
import com.vishrosh.inputsystem.core.keyboard.events.KeyTypedEvent;
import com.vishrosh.inputsystem.core.mouse.MouseHandler;
import com.vishrosh.inputsystem.core.mouse.events.MousePressedEvent;

public class Window extends JFrame{

	private static final long serialVersionUID = -4356287702083967275L;
	
	public Window() {
		super("Title");
		this.setSize(600, 500);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addMouseListener(new MouseHandler());
		this.addKeyListener(new KeyHandler());
	}
	
	@SubscribeEvent(event=EventTypes.MousePressed)
	public void doSomethingWhenMousePressed(MousePressedEvent e) {
		System.out.println(e.getButton() + " : " + e.getX() + ", " + e.getY());
	}
	
	@SubscribeEvent(event=EventTypes.KeyPressed)
	public void doSomethingWhenKeyboardPressed(KeyPressedEvent e) {
		System.out.println("Key Pressed: " + e.getKeyCode());
	}
	
	@SubscribeEvent(event=EventTypes.KeyReleased)
	public void doSomethingWhenKeyboardReleased(KeyReleasedEvent e) {
		System.out.println("Key Released: " + e.getKeyCode());
	}
	@SubscribeEvent(event=EventTypes.KeyTyped)
	public void doSomethingWhenKeyboardTyped(KeyTypedEvent e) {
		System.out.println("Key Typed: " + e.getKeyChar());
	}

}
