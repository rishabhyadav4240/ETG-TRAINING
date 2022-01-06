package com.sonata;

public class StudentExample {
	int stuId;
	String stuName;
	double stuGrade;
 StudentExample(int n, String name,double b)
 {
	 this.stuId=n;
	this.stuName=name;
	this.stuGrade=b;
 }
 StudentExample(){}

public void  Details()
			{
				System.out.println("This is details");
			}
			
		
			public void display()
			{
				System.out.println(stuId);
				System.out.println(stuName);
				System.out.println(stuGrade);
			}

			public static void main(String[] args) 
			{
				StudentExample b1 = new StudentExample();
				b1.stuId=123;
				b1.stuName="xyz";
				b1.stuGrade=1234;
				b1.display();
				StudentExample b2 = new StudentExample(007,"golu",564);
				b2=b1;
				b2.display();

			}

		

	}


