package Coding;

public class reverseString {
	
	public static void main(String[] args) {
		
		String a = "automation";
		String b = "testing";
		
		
		StringBuilder sb = new StringBuilder(a);
		StringBuffer sb2 = new StringBuffer(b);
		
		System.out.println(sb.reverse());
		System.out.println(sb2.reverse());
	}

}
