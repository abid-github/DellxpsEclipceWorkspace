package com.student;

import java.util.ArrayList;
import java.util.Collections;

public class PrintStudentComparator {

	int rollno;
	String name, address;

	public PrintStudentComparator(int rollno, String name, String address) {

		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return this.rollno + "-" + this.name + "-" + this.address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<PrintStudentComparator> ar = new ArrayList<PrintStudentComparator>();
		ar.add(new PrintStudentComparator(111, "bbbb", "london"));
		ar.add(new PrintStudentComparator(131, "aaaa", "nyc"));
		ar.add(new PrintStudentComparator(121, "cccc", "jaipur"));

		System.out.println(ar);

		System.out.println("****Unsorted*****");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		System.out.println("****sorted*****");

		Collections.sort(ar, new PrintSortRoll());

		System.out.println(ar);

		Collections.sort(ar, new PrintSortName());

		System.out.println(ar);
	}

}
