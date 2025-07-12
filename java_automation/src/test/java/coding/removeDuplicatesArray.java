package coding;

import java.util.*;

public class removeDuplicatesArray {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,5,3};
		
		System.out.println(Arrays.toString(arr));
		Set<Integer> ss = new HashSet<>();
		
		for(int i:arr) {
			
			ss.add(i);
		}
		
		System.out.println(ss);
		
		
	}
}
