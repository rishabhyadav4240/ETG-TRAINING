package com.sonata;

public class Studen1Details extends StudentExample{
	
	Studen1Details(int a,String b, double c){
		super(a,b,c);
	}
	
	Studen1Details(){}

	public static void main(String[] args)
	{
		
		Studen1Details s1= new Studen1Details();
		s1.stuId=123;
		s1.stuName="rishabh";
		s1.stuGrade=45678;
		s1.display();
		Studen1Details s2 =new Studen1Details(002,"govind",869);
		s2.display();
	}

}
