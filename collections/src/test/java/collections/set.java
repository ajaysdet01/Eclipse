package collections;

import java.util.HashSet;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		
		        Set<String> fruits = new HashSet<>();

		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Mango");
		        fruits.add("Apple");  // Duplicate ignored

		        System.out.println("Fruits Set: " + fruits); // No duplicates

		        System.out.println("Contains Mango? " + fruits.contains("Mango")); // true

		        fruits.remove("Banana");
		        System.out.println("After removal: " + fruits);

		        System.out.println("Size: " + fruits.size());

		        // Iteration
		        for (String fruit : fruits) {
		            System.out.println("Fruit: " + fruit);
		        }

	}
}
