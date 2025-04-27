package Coding;

import java.util.HashSet;

public class Remove_Duplicates_Array_str {
	
	public static void main(String[] args) {
		
		//Array
		
		int [] arr = {1,2,3,4,4,5,5,5,6,7,8,9,9,9};
		
		
		HashSet<Integer> hs= new HashSet<>();
		
		for(int a:arr) {
			hs.add(a);
		}
		System.out.println(hs);
		
		//string
		
		String str = "ajaykumarreddy";
		HashSet<Character> sets = new HashSet<>();
		
		for(char ss:str.toCharArray()) {
			
			System.out.println(ss);
			
			sets.add(ss);
		}
		
		System.out.println(sets);
		
	}
}
