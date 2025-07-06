package Basic;

import java.util.Arrays;

public class Forloop {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
	
		System.out.println("--------------");
		
		/* reverse */
		
		for (int j = a.length - 1; j >= 0; j--) {
		    System.out.println(a[j]);
		}
	}
}
