package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	void a() {
		System.out.println("login");
	}
	@AfterClass
	void b() {
		System.out.println("logout");
	}
	
	@Test(priority = 1)
	void m1() {
		System.out.println(" adv search");
	}

	@Test(priority = 2,invocationCount = 5,threadPoolSize = 5)
	void m2() {
		System.out.println("search");
	}
	
}