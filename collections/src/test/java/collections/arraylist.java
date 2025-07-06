package collections;

import java.util.*;

public class arraylist {  // class name should start with uppercase by convention

    public static void main(String[] args) {

        // Create ArrayList of Strings
        List<String> list = new ArrayList<>();

        // Add elements
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");

        System.out.println("Original List: " + list);

        // Add at specific index
        list.add(1, "Anjur");

        // For-each loop
        System.out.println("Using for-each:");
        for (String s : list) {
            System.out.println(s);
        }

        // Remove by value
        list.remove("Apple");
        System.out.println("After removing 'Apple': " + list);

        //Remove by index
        list.remove(0);
        System.out.println("After removing by index': " + list);

        // Retrieve by index
        System.out.println("Element at index 0: " + list.get(0));

        // Replace element
        list.set(0, "Flowers");
        System.out.println("After replacing index 0 with 'Flowers': " + list);

        // Contains check
        System.out.println("Contains 'Mango': " + list.contains("Mango"));

        // Size of list
        System.out.println("Size of list: " + list.size());

        // Sort list (ascending)
        list.sort(null);  // null uses natural ordering (A-Z)
        System.out.println("Sorted list: " + list);
        
        Collections.reverse(list);
        System.out.println(list);
        
        list.clear();
        System.out.println(list);
    }
}
