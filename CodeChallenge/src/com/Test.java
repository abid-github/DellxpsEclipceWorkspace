package com;

class A {
	int i = 10;

	public void printValue() {
		System.out.println("in Parent :Value A");
	}
}

class B extends A {
	int i = 15;

	public void printValue() {

		System.out.println("in child :Value B");
		System.out.println("in child " + super.i);
		System.out.println("in child" + this.i);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A pc = new B();
		// B b = new A();

		A p = new A();

		B c = new B();

		pc.printValue();
		System.out.println("-----");
		p.printValue();
		System.out.println("-----");
		c.printValue();
		System.out.println("-----");
		System.out.println("from pc ref  " + pc.i);
		System.out.println("-----");
		System.out.println("from p ref " + p.i);
		System.out.println("-----");
		System.out.println("from chile ref " + c.i);

	}

}
