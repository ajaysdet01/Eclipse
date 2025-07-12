package coding;

import java.util.*;

public class removeDuplicatesString {
	
	public static void main(String[] args) {
		
		String name = "madam";
		
		
		/* Type 1 */
		Set<Character> ss = new LinkedHashSet<>();
		
		for(int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			
			if(!(ss.contains(ch))) {
					ss.add(ch);
					
		}}
		
		System.out.println(ss);
		System.out.println(ss.toString());
		
	/* Type 2 */
		
		String name2 = "AJAY";
		
		Set ss2 = new LinkedHashSet<>();
		
		
		//for(String i:name2)()
		for(char i:name2.toCharArray()) {
			
			ss2.add(i);
		}
		
		System.out.println(ss2);
		
		
		
	
	}

}
