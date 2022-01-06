package com.sonata;

public class MobileProduct extends Product{
	void totalPrice() {
		System.out.println("this is abstract method");
	}

	public static void main(String[] args) 
	{
		
MobileProduct m1=new MobileProduct();
m1.totalPrice();
	}

}
