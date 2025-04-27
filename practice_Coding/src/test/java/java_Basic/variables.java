package java_Basic;

public class variables {
	
	static Object[] name = {"ajay", "kumar", 123};  // Creates a static with global variable

	public static void main(String[] args) {
	    int num = 5;           // Integer variable
	    float flo = 10.f;      // Float variable (10.f is correct syntax)
	    double dou = 4.d;      // Double variable (4.d is correct syntax)
	    String name1 = "ajay"; // String variable
	    String name2 = "reddy"; // String variable
	    char c = 'a';          // Character variable
	    boolean b = true;      // Boolean variable
	    
	   System.out.println(num + " " + flo + " " + dou + " " + name + " " + c + " " + b);
	    
	    // This concatenates name (array), name2 (String), and name1 (String)
	   System.out.println(name2 + name1);
	   
	   // Prints the length of string name1 (will print 4)
	   System.out.println(name1.length());
	    
	   System.out.println(name);
	    
	    // Enhanced for loop - correctly prints each element of the 'name' array
	    for(Object a : name) {
	        System.out.println(a);
	    }
	    
	    // Traditional for loop - prints numbers array without spaces
	    int[] numbers = {1, 2, 3, 4, 5};
	    for (int i = 0; i < numbers.length; i++) {
	        System.out.print(numbers[i]);  // print (not println) means no line breaks
	    }
	    

	}

}
