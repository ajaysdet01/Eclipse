// SecondClass.java
package p2;

//importing pkg
import p1.p1Class;

public class p2Class {
    // Instance variable
     int number;


    // Method to display the number
    public void displayNumber() {
        System.out.println("Number from SecondClass: " + number);
    }

    public static void main(String[] args) {
        // Creating an object of FirstClass
    	p1Class firstObject = new p1Class();
    	firstObject.message = "ajay.....";
        firstObject.displayMessage();

        // Creating an object of SecondClass
        p2Class secondObject = new p2Class();
        secondObject.number=10;
        System.out.println(secondObject.number);
        secondObject.displayNumber();
        
    }
}
