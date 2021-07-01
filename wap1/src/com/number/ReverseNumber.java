package com.number;

public class ReverseNumber {

	public static void main(String[] args) {

		int x = 5492;//2945
		int rev = 0;
		int rem;

		while (x != 0)

		{
			rem = x % 10;
			
			//System.out.println(rem);
			rev = rev * 10 + rem;
			System.out.println(rev);
			
			x = x / 10;
			
		}

		
		System.out.println(rev);
		
		
		
		
		

		// using inbuilt method

		
		  int x2 = 1287;
		  
		  // in case of long need to use String.valueof ()
		  
		  //String x1 = String.valueOf(x2);
		  
		  String x1 =Integer.toString(x2);
		  
		  
		//  Object I = new Integer (x2); 
		 // String x1= I.toString();
		  
		  
		  StringBuffer sb = new StringBuffer(x1); sb.reverse();
		  
		  System.out.println(sb);
		 

	}

}
