package java_Basic;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        // Creating Strings
        String s = "Hello world learning JAVA";
        System.out.println(s);

        String str1 = "Hello";
        String str2 = new String("Hello");

        /* Length & Empty Checks */
        System.out.println("Length: " + s.length());   // Returns length of the string
        System.out.println("isEmpty: " + s.isEmpty()); // Checks if string is empty
        System.out.println("isBlank: " + "  ".isBlank()); // Java 11+, true if only whitespace

        /* Character Access */
        System.out.println("charAt(1): " + s.charAt(1));  // Returns character at index 1

        /* Searching & Matching */
        System.out.println("indexOf('o'): " + s.indexOf('o')); // First occurrence index
        System.out.println("lastIndexOf('o'): " + s.lastIndexOf('o')); // Last occurrence
        System.out.println("contains 'World': " + s.contains("World")); // true/false
        System.out.println("startsWith 'Hello': " + s.startsWith("Hello"));
        System.out.println("endsWith 'JAVA': " + s.endsWith("JAVA"));

        /* Comparison */
        System.out.println("equals: " + str1.equals(str2));  // True if content matches
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2)); // Ignores case
        System.out.println("compareTo: " + "Apple".compareTo("Banana")); // Lexicographic compare
        System.out.println("compareToIgnoreCase: " + "apple".compareToIgnoreCase("Banana"));

        /* Replacing & Trimming */
        System.out.println("replace: " + s.replace("world", "universe")); // Replace substring
        System.out.println("replaceAll: " + s.replaceAll("\\s", "-")); // Replace regex pattern
        System.out.println("replaceFirst: " + s.replaceFirst("l", "L")); // Replace first match
        System.out.println("trim: " + "  Hello  ".trim()); // Removes leading/trailing spaces
        System.out.println("strip: " + "  Hello  ".strip()); // Unicode-aware trimming (Java 11+)

        /* Changing Case */
        System.out.println("toUpperCase: " + s.toUpperCase());
        System.out.println("toLowerCase: " + s.toLowerCase());

        /* Substrings */
        System.out.println("substring(0, 5): " + s.substring(0, 5)); // Extracts part of string
        System.out.println("substring(6): " + s.substring(6));

        /* Splitting & Joining */
        String[] words = s.split(" "); // Splits string into an array
        System.out.println("split: " + Arrays.toString(words));
        System.out.println("join: " + String.join("-", words)); // Joins array elements

        /* Formatting */
        String formatted = String.format("%s is %d years old", "Alice", 25);
        System.out.println("formatted: " + formatted);

        /* Repeat (Java 11+) */
        System.out.println("repeat: " + "Hello ".repeat(3)); // Repeats string 3 times

        /* Converting to Char Array */
        char[] charArray = s.toCharArray();
        System.out.println("toCharArray: " + Arrays.toString(charArray));

        /* Value of (Convert other types to string) */
        int num = 100;
        System.out.println("valueOf: " + String.valueOf(num));
    }
}
