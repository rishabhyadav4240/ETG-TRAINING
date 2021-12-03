package com.sonata;

public class StringVowels {

	public static void main(String[] args)
	{
	
		char ch[] = {'r','i','s','h','a','b','h'};
	
	 for (int i = 0; i < ch.length; i++)
     {
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
             ch[i]='$'; 
            }   
     }
     for (int i = 0; i < ch.length; i++) {
         System.out.print(ch[i]);
     }
 }

	}


