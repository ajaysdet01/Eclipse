package Basic;

import java.util.*;

public class Array {
    public static void main(String[] args) {

        /* Declaration + Manual Initialization */
        int[] ary = new int[5];  // default values: [0, 0, 0, 0, 0]

        ary[0] = 1;  // initialization
        ary[1] = 4;
        ary[2] = 2;
        ary[3] = 3;
        // ary[4] is left as default: 0

        for (int i : ary) {
            System.out.println(i);  // prints each element in ary
        }

        System.out.println("------");

        /* Declaration + Initialization (shortcut) */
        Integer[] arry = {1, 2, 3, 4, 5};  // changed to Integer[] for reverse to work

        for (int i : arry) {
            System.out.println(i);
        }

        System.out.println("------");

        /* Arrays.toString() */
        System.out.println("ary = " + Arrays.toString(ary));
        

        /* Arrays.equals() */
        System.out.println("Arrays.equals = " + ary.equals(arry));

        /* Length of array */
        System.out.println("Length = " + ary.length);

        /* Sorting */
        Arrays.sort(ary);
        System.out.println("Sorted ary = " + Arrays.toString(ary));

        /* Reversing arry (Only works with non-primitive types like Integer[]) */
        Collections.reverse(Arrays.asList(arry));
        System.out.println("Reversed arry = " + Arrays.toString(arry));
        
		/* for loop */
        
        for(int i=0;i<arry.length;i++) {
        	System.out.println(arry[i]);
        }
    }

}
