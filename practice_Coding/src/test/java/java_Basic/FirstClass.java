// FirstClass.java
package part1;

public class FirstClass {
    // Instance variable
    private String message;

    // Constructor
    public FirstClass(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message from FirstClass: " + message);
    }
}
