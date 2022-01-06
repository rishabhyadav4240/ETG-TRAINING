package com.springcore.etg.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.etg.CalculatorInterface;
import com.springcore.etg.UseCalculatorInterface;
@Component
public class UseCalculator implements UseCalculatorInterface {
	@Autowired
	CalculatorInterface Calculator;

	@Override
	public int useExpression() {
		
		return (Calculator.add(30,40)+Calculator.sub(50,30));
	}

}
