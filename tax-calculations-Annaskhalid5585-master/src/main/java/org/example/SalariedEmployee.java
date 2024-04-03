package org.example;

import java.util.Date;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double salary) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.salary = salary;
    }

    @Override
    public double grossEarnings() {
        // Assuming monthly salary, calculating for 30 days
        return salary * 30;
    }

    @Override
    public double tax() {

        double gross = grossEarnings();
        if (gross > 200000 && gross <= 250000) {
            return gross * 0.23;
        } else if (gross > 150000 && gross <= 200000) {
            return gross * 0.23;
        } else if (gross > 100000 && gross <= 150000) {
            return gross * 0.2;
        } else if (gross > 75000 && gross <= 100000) {
            return gross * 0.15;
        } else if (gross > 45000 && gross <= 75000) {
            return gross * 0.08;
        } else if (gross > 20000 && gross <= 45000) {
            return gross * 0.05;
        } else if (gross > 10000 && gross <= 20000) {
            return gross * 0.2;
        } else if (gross <= 10000) {
            return 0.0;
        }
        return 0.25 *gross;
}
}