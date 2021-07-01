package com.pattern;

public class FullPyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int trow= 5; 
		
		for ( int i =1; i <= trow; i++)
		{
			for ( int j=trow-i ; j>=1 ; j--  )
			{
				System.out.print(" ");
			}
			
			for (int k=1 ; k<=i ; k++  )
				
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		

	}

}
