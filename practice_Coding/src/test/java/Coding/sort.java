package Coding;

import java.util.Arrays;
import java.util.Collections;

public class sort {

	public static void main(String[] args) {
		
		int[] arry = {8,9,2,7,1,2,10,7,0};
		Integer[] arry2 = {8,9,2,7,1,2,10,7,0};
		
		Arrays.sort(arry);
		System.out.println(Arrays.toString(arry));
		
		
		//decending
		Arrays.sort(arry2,Collections.reverseOrder());
		System.out.println(Arrays.toString(arry2));
	}
}
