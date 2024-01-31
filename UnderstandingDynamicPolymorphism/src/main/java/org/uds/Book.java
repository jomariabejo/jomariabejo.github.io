package org.uds;

public class Book extends LibraryItem {
    String author;

    Book(String title, int checkoutPeriod, String author) {
        super(title, checkoutPeriod);
        this.author = author;
    }

    @Override
    void checkout() {
        super.checkout();
        System.out.println("Author: " + author);
        System.out.println("Enjoy your reading!");
    }
}
