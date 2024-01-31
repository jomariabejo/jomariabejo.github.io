package org.uds;

public class Magazine extends LibraryItem {
    String publisher;

    Magazine(String title, int checkoutPeriod, String publisher) {
        super(title, checkoutPeriod);
        this.publisher = publisher;
    }

    @Override
    void checkout() {
        super.checkout();
        System.out.println("Publisher: " + publisher);
        System.out.println("Happy reading!");
    }
}

