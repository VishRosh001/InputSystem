package com.vishrosh.inputsystem.tests;

import com.vishrosh.eventsystem.core.EventBus;
import com.vishrosh.eventsystem.core.EventBusSubscribers;

public class Main{
	
	static Window w;

	public static void main(String[] args) {
		
		w = new Window();
		
		EventBusSubscribers.RegisterToEventBus(w);
		EventBus.registerMethodsToEvents();
		
		w.setVisible(true);
	}
}