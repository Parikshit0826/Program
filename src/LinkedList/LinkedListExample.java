package LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Print all elements
        System.out.println("Fruits List: " + fruits);

        // Add element at first and last
        fruits.addFirst("Strawberry");
        fruits.addLast("Grapes");

        // Print updated list
        System.out.println("After adding first and last: " + fruits);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Get first and last elements
        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());

        // Iterate through the list
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
