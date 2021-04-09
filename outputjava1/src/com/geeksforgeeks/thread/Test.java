package com.geeksforgeeks.thread;

public class Test implements Runnable {
	public void run() {
		System.out.printf("GFGr ");
		System.out.printf("Geeksr ");
	}

	public static void main(String[] args) {
		Test obj = new Test();
		Thread thread = new Thread(obj);
		
	

		thread.start();

		System.out.printf("Geeksm ");
		try {

			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("form ");

	}
}
