package org.uds;

public class LibraryItem {
    String title;
    int checkoutPeriod;

    LibraryItem(String title, int checkoutPeriod) {
        this.title = title;
        this.checkoutPeriod = checkoutPeriod;
    }

    void checkout() {
        System.out.println("Checking out: " + title);
        System.out.println("Checkout period: " + checkoutPeriod + " days");
    }
}