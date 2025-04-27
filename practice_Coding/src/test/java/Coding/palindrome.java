package Coding;

public class palindrome {
	
	
	public static void main(String[] args) {
	
		String str = "madam";
		
		StringBuilder sb = new StringBuilder(str);
		
		StringBuilder rev = sb.reverse();
		
		System.out.println(str + " "+rev);
		
		if(str.contentEquals(rev)) {
			
			System.out.println("palindorme");
		}
		else {
			System.out.println("not palindorme..");
		}

	}
}
