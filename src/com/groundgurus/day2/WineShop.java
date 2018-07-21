package com.groundgurus.day2;

/**
 *
 * @author ongsa Inheritance
 */
public class WineShop extends Shop {

    private boolean areMinorsAllowed;

    public WineShop(String name, String[] items, String address, int noOfEmployees, boolean areMinorsAllowed) {
        super(name, items, address, noOfEmployees);
        this.areMinorsAllowed = areMinorsAllowed;
    }

    public boolean isareMinorsAllowed() {
        return areMinorsAllowed;
    }

    public void setAreMinorsAllowed(boolean areMinorsAllowed) {
        this.areMinorsAllowed = areMinorsAllowed;
    }

    public void printDetails() {
        super.printDetails();
        //alt + insert
        System.out.println("WineShop.minors = " + areMinorsAllowed);
    }
}
