package com.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrintStudentComparable implements Comparable<PrintStudentComparable>

{
	int rollno;
	String name;
	String city;

	public int getRollno() {
		return this.rollno;
	}

	public void setRollno(int r) {
		this.rollno = r;
	}

	PrintStudentComparable(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	// overriding the toString() method
	public String toString() {
		return rollno + "- " + name + " - " + city;
	}

	@Override
	public int compareTo(PrintStudentComparable o) {

		if (this.rollno < o.rollno) {

			return -1;
		}

		return 1;
	}

	public static void main(String args[]) {

		PrintStudentComparable s1 = new PrintStudentComparable(1, "Raj", "lucknow");
		PrintStudentComparable s2 = new PrintStudentComparable(101, "Vijay", "ghaziabad");
		PrintStudentComparable s3 = new PrintStudentComparable(103, "abid", "noida");
		PrintStudentComparable s4 = new PrintStudentComparable(-20, "illegal1", "lucknow");
		PrintStudentComparable s5 = new PrintStudentComparable(-10, "illigal2", "lucknow");
		PrintStudentComparable s6 = new PrintStudentComparable(-30, "illigal3", "lucknow");
		List<PrintStudentComparable> sl = new ArrayList<PrintStudentComparable>();

		sl.add(s1);
		sl.add(null);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		sl.add(new PrintStudentComparable(104, "aslam", null));
		sl.add(null);
		sl.add(null);
		sl.add(s5);
		sl.add(s6);

		System.out.println(sl.size());

		while (sl.contains(null) == true)

		{
			sl.remove(null);

		}

		System.out.println(sl);
		System.out.println(sl.size());

		Iterator<PrintStudentComparable> it = sl.iterator();

		while (it.hasNext())

		{
			if (it.next().getRollno() < 0)
				it.remove();
		}

		/*
		 * for (int i =0 ;i<sl.size(); i++) { if ( sl.get(i).getRollno()<0) {
		 * sl.remove(i); } System.out.println("remove" + sl.size()); }
		 */

		Collections.sort(sl);

		System.out.println(sl);

		for (PrintStudentComparable student : sl) {
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

}
