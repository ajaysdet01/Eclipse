package coding;

public class reverseString {
	
	public static void main(String[] args) {
		
		/* Using String Builder */
		String name = "ajay";
		
		StringBuilder sb = new StringBuilder(name);
		
		System.out.println(sb.reverse());
		
		/* for loop */
		
		for (int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
	}

}
