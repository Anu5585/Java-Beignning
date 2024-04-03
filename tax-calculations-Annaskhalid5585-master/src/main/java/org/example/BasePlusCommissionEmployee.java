package org.example;

import java.util.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double grossEarnings() {
        return super.grossEarnings() + baseSalary;
    }

    @Override
    public double tax() {

        double amount = grossEarnings();
        double tax = 0.0;

        if (amount > 200000 && amount <= 250000) {
            tax = amount * 0.23;
        } else if (amount > 150000 && amount <= 200000) {
            tax = amount * 0.23;
        } else if (amount > 100000 && amount <= 150000) {
            tax = amount * 0.2;
        } else if (amount > 75000 && amount <= 100000) {
            tax = amount * 0.15;
        } else if (amount > 45000 && amount <= 75000) {
            tax = amount * 0.08;
        } else if (amount > 20000 && amount <= 45000) {
            tax = amount * 0.05;
        } else if (amount > 10000 && amount <= 20000) {
            tax = amount * 0.2;
        } else if (amount <= 10000) {
            tax = 0.0;
        }

        return tax;
}

}
