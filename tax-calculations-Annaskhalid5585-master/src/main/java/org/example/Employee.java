package org.example;

import java.util.Date;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public abstract double grossEarnings();

    public abstract double tax();

    public double netEarnings() {
        return grossEarnings() - tax();
}
}