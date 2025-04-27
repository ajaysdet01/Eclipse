package java_Basic;

import java.util.Arrays;

public class arrays {
	
	public static void main(String[] args) {
		
		   String[] a = {"a", "x", "g", "b", "z", "f"};
	       int[] b = {1, 4, 34, 6, 2, 60, 5, 0, 8};
	       Object[] c = {"a", 2};
	        
	    // Accessing 
	       System.out.println(a[0]);
	       
	    // Modify
	       a[2] = "3";
	       System.out.println(a);
	       System.out.println(Arrays.toString(a));
	    
	   // Count(Length)
	       System.out.println(b.length);
	       

	  //each Loop 
	       for(String xx:a) {
	    	   System.out.println(xx);
	       }
	       
	 // for Loop 
	      for(int i=0;i<b.length;i++) {
	    	  System.out.println(b[i]); 
	      }
	 // Copy
	     String[] copyof = Arrays.copyOf(a,a.length);
	     System.out.println(Arrays.toString(copyof));
	     System.out.println("cpy off");
	     
	 // Comparing 
	        int[] Array1 = {1, 2, 3, 4, 5};
	        int[] Array2 = {1, 2, 3, 4, 5};
	        boolean isequal = Arrays.equals(Array1, Array2);
	        System.out.println(isequal);
	 
	// Filling
	        int[] num = new int[5];
	       Arrays.fill(num,3);
	       System.out.println(Arrays.toString(num));     
	       
	}
}
