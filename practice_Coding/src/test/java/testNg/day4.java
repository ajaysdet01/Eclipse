package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class day4 {

	@BeforeSuite
	void x() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	void y() {
		System.out.println("after Suite");
	}
	
	@BeforeTest
	void e() {
		System.out.println("Before Test");
	}
	@AfterTest
	void f() {
		System.out.println("after Test");
	}
	@BeforeMethod
	void c() {
		System.out.println("Before Method");
	}
	@AfterMethod
	void d() {
		System.out.println("after method");
	}
	@BeforeClass
	void a() {
		System.out.println("Before class");
	}
	@AfterClass
	void b() {
		System.out.println("After class");
	}
	
	@Test(priority = 1)
	void m1() {
		System.out.println(" adv search");
	}

	@Test(priority = 2)
	void m2() {
		System.out.println("search");
	}

}
