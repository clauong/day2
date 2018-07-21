package com.groundgurus.day2;

/**
 *
 * @author ongsa
 */
public class Shop {

    String name; //access modifier is 'default' [accessible on same class, same package]
    private String[] items; //access modifier is 'private' [accessible on same class]
    private String address;
    private int noOfEmployees;

    //constructor
    public Shop() {
    }

    //constructor
    public Shop(String name, String[] items, String address, int noOfEmployees) {
        this.name = name;
        this.items = items;
        this.address = address;
        this.noOfEmployees = noOfEmployees;
    }

    //access modifier, return type, class name
    public String findByItemName(String name) {
        return "";
    }

    public void printDetails() {
        System.out.println("Shop.name: " + name);
        for (String item : items) {
            System.out.println("items: " + item);
        }
        System.out.println("Shop.address: " + address);
        System.out.println("Shop.noOfEmployees: " + noOfEmployees);
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(int noOfEmployees) {
        if (noOfEmployees > 0) {
            this.noOfEmployees = noOfEmployees;
        } else {
            System.err.println("Set no. of Employees");
        }
    }

    Object areMinorsAllowed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
