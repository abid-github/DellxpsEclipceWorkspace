package com.student;

import java.util.Comparator;

public class PrintSortName implements Comparator <PrintStudentComparator>


{

	@Override
	public int compare(PrintStudentComparator s1, PrintStudentComparator s2) {
		// TODO Auto-generated method stub
		return  s1.name.compareTo(s2.name);
	}

}
