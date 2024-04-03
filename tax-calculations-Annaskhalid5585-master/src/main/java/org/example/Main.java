package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee( "John", "Smith", "111-11-1111",new Date(1987,12,15), 150000.00 );
        HourlyEmployee hourlyEmployee = new HourlyEmployee( "Karen", "Price", "222-22- 2222",new Date(2023,12,1), 2500.00, 40 );
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333",new Date(1990,3,15), 100000, .25 );
        BasePlusCommissionEmployee basePlusCommissionEmployee =new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",new Date(2023,3,15),5000, .25, 15000 );


        Employee[] employees = new Employee[ 4 ];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;




        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i].grossEarnings()+"+"+employees[i].tax()+"+"+employees[i].netEarnings());

 }
}
}