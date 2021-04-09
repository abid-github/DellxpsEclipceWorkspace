package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations123Test {

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("Inside @BeforeSuite Method.");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("Inside @BeforeClass of TestClass.");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside @BeforeTest Method of TestClass.");
	}

	@BeforeMethod
	public void abBeforeM() {
		System.out.println("Inside @BeforeMethod ab of TestClass.");
	}
	@BeforeMethod
	public void efBeforeM() {
		System.out.println("Inside @BeforeMethod ef of TestClass.");
	}
	@BeforeMethod
	public void cdBeforeM() {
		System.out.println("Inside @BeforeMethod cd of TestClass.");
	}

	
	@Test
	public void testA() {
		System.out.println("Inside @TestMethod A of TestClass.");
	}

	@Test
	public void testB() {
		System.out.println("Inside @TestMethod B of TestClass.");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Inside @AfterTest Method of TestClass.");
	}

	@AfterMethod
	public void abAfterMethod() {
		System.out.println("Inside @AfterMethod ab of TestClass.");
	}

	@AfterMethod
	public void cdAfterMethod() {
		System.out.println("Inside @AfterMethod cd of TestClass.");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Inside @AfterClass Method of TestClass.");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Inside @AfterSuite Method.");
	}

}
