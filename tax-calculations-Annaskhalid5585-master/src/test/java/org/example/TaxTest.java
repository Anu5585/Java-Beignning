package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Date;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TaxTest {
    Employee[] employees;
    @BeforeAll
    public void setup(){

        SalariedEmployee salariedEmployee = new SalariedEmployee( "John", "Smith", "111-11-1111",new Date(1987,12,15), 150000.00 );
        HourlyEmployee hourlyEmployee = new HourlyEmployee( "Karen", "Price", "222-22- 2222",new Date(2023,12,1), 2500.00, 40 );
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333",new Date(1990,3,15), 100000, .25 );
        BasePlusCommissionEmployee basePlusCommissionEmployee =new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",new Date(2023,3,15),5000, .25, 15000 );


        employees = new Employee[ 4 ];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;


    }

    @Test
    public void calc_Salaried_employee_tax(){
        Assertions.assertEquals(30000.0,employees[0].tax());
    }

    @Test
    public void calc_Hourly_employee_tax(){
        Assertions.assertEquals(15000.0,employees[1].tax());
    }

    @Test
    public void calc_Commission_employee_tax(){
        Assertions.assertEquals(1250,employees[2].tax());
    }

    @Test
    public void calc_base_Plus_Commission_Employee_tax(){
        Assertions.assertEquals(3250.0,employees[3].tax());
    }


}
