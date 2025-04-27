package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterators {
	
	public static void main(String[] args) {
		
	List<String> name = Arrays.asList("a","b","c","d","e","f");
	//It provides an easy way to create a List from an array without manually adding elements.

	for(String s:name) {
		System.out.println(s);
	}
	
	// Using explicit Iterator
	Iterator it = name.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
     }

