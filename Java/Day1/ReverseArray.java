package com.sonata;

public class ReverseArray {

	public static void main(String[] args)
	{
		
     int a[]= {1,2,3,4,5};
    
      
    	  System.out.println("original array is :");
    	  for (int i=0;i<a.length;i++)
    	  {
    		  System.out.println(a[i]);
    	  }
    	  
      
      
      
    	  System.out.println("array in reverse order:");
    	  for (int i=a.length-1;i>=0;i--) {
    	  System.out.println(a[i]);
    	  }
    	  
    	  
      
}
}
