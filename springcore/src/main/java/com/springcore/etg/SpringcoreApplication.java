package com.springcore.etg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springcore.etg.impl.Greeting;

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringcoreApplication.class, args);
		
		BeanFactory factory=new GenericXmlApplicationContext("beans.xml");
		//GreetingInterface greet = new Greeting();
		ChristmasInterface greet=(ChristmasInterface) ctx.getBean("christmas");
		
		//UseCalculatorInterface cal=(UseCalculatorInterface) ctx.getBean("useCalculator");
		//System.out.println(cal.useExpression());
		System.out.println(greet.happyChristmas("Rishabh"));
		}

}
