package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintStudent implements Comparable<PrintStudent>

{
	int rollno;
	String name;
	String city;
	
	

	// String s = "Hello";

	/*
	 * public int getRollno() { return rollno; }
	 * 
	 * public void setRollno(int rollno) { this.rollno = rollno; }
	 */

	PrintStudent(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	// overriding the toString() method
	public String toString() {
		return rollno + "- " + name + " - " + city;
	}

	public static void main(String args[]) {
		PrintStudent s1 = new PrintStudent(101, "Raj", "lucknow");
		PrintStudent s2 = new PrintStudent(102, "Vijay", "ghaziabad");
		PrintStudent s3 = new PrintStudent(103, "abid", "noida");

		List<PrintStudent> sl = new ArrayList<PrintStudent>();

		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(new PrintStudent(104, "aslam", "delhi"));

		Collections.sort(sl);

		// System.out.println(sl);

		for (PrintStudent student : sl) {
			System.out.println(student);
		}

		System.out.println(s1.name);

		// If you print any object, java compiler internally invokes the toString()
		// method on the object.
		// So overriding the toString() method, returns the desired output, it can be
		// the state of an object etc. depends on your implementation.

		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()

	}

	@Override
	public int compareTo(PrintStudent o) {

		if (this.rollno < o.rollno) {
			return -1;
		}

		return 1;
	}
}
