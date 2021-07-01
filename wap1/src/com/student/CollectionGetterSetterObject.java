package com.student;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetterObject {

	private List<Person> listpeople;

	public List<Person> getListpeople() {
		return new ArrayList<Person>(this.listpeople);
	}

	public void setListpeople(List<Person> list1) {
		this.listpeople = new ArrayList<Person>(list1);
	}

	public static void main(String[] args) {

		CollectionGetterSetterObject app = new CollectionGetterSetterObject();

		List<Person> pl = new ArrayList<Person>();

		pl.add(new Person("abid"));
		pl.add(new Person("aslam"));
		pl.add(new Person("iram"));
		pl.add(new Person("myra"));
		pl.add(new Person("mysha"));

		app.setListpeople(pl);
		System.out.println("List 1: " + pl);

		pl.get(2).setName("Aslam Hussain");

		List<Person> list2 = app.getListpeople();

		System.out.println("List 2: " + list2);

		pl.get(0).setName("Hussain Abid");

		List<Person> list3 = app.getListpeople();

		System.out.println("List 3: " + list3);

	}

}




class Person {
	private String name;

	public Person(String n) {
		this.name = n;
	}

	public void setName(String n) {
		this.name = n;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
