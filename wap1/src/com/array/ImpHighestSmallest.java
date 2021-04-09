package com.array;

public class ImpHighestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a= {10,0,40,2,88,99,1,-10,-2};
		
		int highest=a[0] ;
		int lowest= a[0];
		
		for (int i =0 ; i< a.length; i++)
		{
			if ( a[i] > highest )
				
				highest=a[i];
			else if (a[i]<lowest)
				lowest =a[i];
		}

		System.out.println("Highest number " +highest + " and Smallest number "+lowest );
		
		
	}

}
