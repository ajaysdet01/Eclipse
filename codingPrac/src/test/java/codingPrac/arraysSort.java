package codingPrac;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import practice.String;

public class arraysSort {

	public static void main(String[] args) {
	
		//Sorting in Ascending Order
		int[] numbers = {5, 2, 8, 3, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
     
        //Descending Order
        Integer[] number2 = {5, 2, 8, 3, 1};
        Arrays.sort(number2,Collections.reverseOrder());
        System.out.println(Arrays.toString(number2));
       
        String[] name = {"a","x","g","b","z","f"};
        
       //Ascending Order
        System.out.println(Arrays.toString(name));
        
      //Descending Order
        
        Arrays.sort(name,Collections.reverseOrder());
        System.out.println(Arrays.toString(name));
        
        
        //Using Java 8 Streams:
        
        int[] numbers3 = {5, 2, 8, 3, 1};
        int [] sorted = Arrays.stream(numbers3).sorted().toArray();
        System.out.println(Arrays.toString(sorted)+ " " + "stream");
        
      //Descending Order
       Integer[] numbers4 = {5, 2, 8, 3, 1};
       Integer[] sortedNumbers = Arrays.stream(numbers4)
                                                .sorted(Comparator.reverseOrder())
                                                .toArray(Integer[]::new);
                System.out.println(Arrays.toString(sortedNumbers));
            }
    }

