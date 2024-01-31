package org.uds;

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("The Catcher in the Rye", 14, "J.D. Salinger");
        LibraryItem item2 = new Magazine("National Geographic", 7, "National Geographic Society");

        // Dynamic polymorphism in action
        item1.checkout();
        System.out.println("------------------------");
        item2.checkout();
    }
}