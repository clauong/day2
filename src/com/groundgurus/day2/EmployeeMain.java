package com.groundgurus.day2;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author ongsa
 */
public class EmployeeMain {

    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Claudine", "Mabutas", "Ong",
                "Programmer", "IT Department",
                new Address("#123 ABC Drive", "Robinsons Village", "Antipolo", "Rizal", "ABC123")
        );
        firstEmployee.printEmployeeDetails();

        Employee secondEmployee = new Employee("Lanie", "Rivera", "Abasola",
                "Accountant", "Finance Department",
                new Address("#456 DEF Street", "Sta. Mariz Village", "Makati", "Metro Manila", "DEF456")
        );
        secondEmployee.printEmployeeDetails();
        
    }
}
