package com.vishrosh.inputsystem.tests;

import javax.swing.JFrame;

import com.vishrosh.eventsystem.core.EventTypes;
import com.vishrosh.eventsystem.core.SubscribeEvent;
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
	}
	
	@SubscribeEvent(event=EventTypes.MousePressed)
	public void doSomethingWhenMousePressed(MousePressedEvent e) {
		System.out.println(e.getButton() + " : " + e.getX() + ", " + e.getY());
	}

}
