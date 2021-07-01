package com.student;

import java.util.Comparator;

public class PrintSortRoll implements Comparator < PrintStudentComparator> 

{

	@Override
	public int compare(PrintStudentComparator s1, PrintStudentComparator s2) {
		// TODO Auto-generated method stub
		return  s1.rollno-s2.rollno;
	}

	
}
