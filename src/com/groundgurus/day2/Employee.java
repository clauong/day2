package com.groundgurus.day2;

/**
 *
 * @author ongsa
 */
public class Employee {

    private String firstName;
    private String middleName;
    private String lastName;
    private String jobTitle;
    private String department;
    private Address address;

    public Employee() {
    }

    public Employee(String firstName, String middleName, String lastName, String jobTitle, String department, Address address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printEmployeeDetails() {
        System.out.println("First Name: " + firstName
                + "\nMiddle Name: " + middleName
                + "\nLast Name: " + lastName
                + "\nJob Title: " + jobTitle
                + "\nDepartment: " + department
        );
        address.getAddressDetails();
    }
}
