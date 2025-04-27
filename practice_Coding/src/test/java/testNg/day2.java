package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2 {

	@BeforeMethod
	void a() {
		System.out.println("login");
	}
	@AfterMethod
	void b() {
		System.out.println("logout");
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