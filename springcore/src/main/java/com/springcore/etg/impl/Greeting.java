package com.springcore.etg.impl;

import org.springframework.stereotype.Component;

import com.springcore.etg.GreetingInterface;

@Component
public class Greeting implements GreetingInterface {

	@Override
	public String sayGreeting(String name) {

		return "Good Morning" +name;
	}

}
