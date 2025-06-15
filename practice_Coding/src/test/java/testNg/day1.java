package testNg;

import org.testng.annotations.Test;

public class day1 {
	
	@Test(priority=1)
	void m1() {
		System.out.println("get web site");
		
	}
	@Test(priority=2)
	void b2() {
		System.out.println("enter cred");
		
	}
	
	@Test(priority=3)
	void y1() {
		System.out.println("buy mobile");
		
	}
	@Test()
	void a1() {
		System.out.println("logout");
		
	}
	

}
