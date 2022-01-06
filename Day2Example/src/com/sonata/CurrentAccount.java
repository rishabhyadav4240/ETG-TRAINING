package com.sonata;

public class CurrentAccount extends BankExample{
CurrentAccount(int a,String b, double c){
	super(a,b,c);
}
CurrentAccount(){}
public static void main(String[] args)
{
	CurrentAccount c1= new CurrentAccount();
	c1.accNo=123;
	c1.accName="rishabh";
	c1.accBalance=45678;
	c1.display();
	CurrentAccount c2 =new CurrentAccount(456,"cyz",8569);
	c2.display();
	
	
}

}
