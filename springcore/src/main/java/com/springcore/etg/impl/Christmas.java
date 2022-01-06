package com.springcore.etg.impl;

import org.springframework.stereotype.Component;

import com.springcore.etg.ChristmasInterface;
import com.springcore.etg.GreetingInterface;

@Component
public class Christmas implements ChristmasInterface {

	@Override
	public String happyChristmas(String message) {
		GreetingInterface greeting = new Greeting();
		return greeting.sayGreeting(message);
	
		
	}

}
