// SecondClass.java
package java_Basic;

public class SecondClass {
    // Instance variable
    private int number;

    // Constructor
    public SecondClass(int number) {
        this.number = number;
    }

    
    // Method to display the number
    public void displayNumber() {
        System.out.println("Number from SecondClass: " + number);
    }

    public static void main(String[] args) {
        // Creating an object of FirstClass
        FirstClass firstObject = new FirstClass("Hello from SecondClass");
        firstObject.displayMessage();

        // Creating an object of SecondClass
        SecondClass secondObject = new SecondClass(10);
        secondObject.displayNumber();
    }
}
