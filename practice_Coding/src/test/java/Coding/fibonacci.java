package Coding;

public class fibonacci {
	
	public static void main(String[] args) {
		
	int n= 10,num1 = 1,num2 = 2;
	
	System.out.println(num1);
	System.out.println(num2);
	
	for(int i=2;i<n;i++) {
		
		int num3 = num1 + num2;
		
		System.out.println(num3);
		
		num1=num2;
		num2=num3;
		
	}
	}
}
