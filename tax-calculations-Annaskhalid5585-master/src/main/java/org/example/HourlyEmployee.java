package org.example;

import java.util.Date;

public class HourlyEmployee extends Employee {
    private double wage;
    private int hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, int hours) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double grossEarnings() {
        return wage * hours;
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
        return 0.1 * gross;
}
}