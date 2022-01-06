package com.springcore.etg.impl;

import org.springframework.stereotype.Component;

import com.springcore.etg.CalculatorInterface;
@Component
public class Calculator implements CalculatorInterface {

	@Override
	public  int add(int x, int y) {
        return x+y;
		
	}

	@Override
	public int sub(int x, int y) {
		
		return x-y;
	}

}
