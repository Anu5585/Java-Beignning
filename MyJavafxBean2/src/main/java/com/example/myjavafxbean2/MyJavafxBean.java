package com.example.myjavafxbean2;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class MyJavafxBean {

    public static void main(String[] args) {
        DoubleProperty a = new SimpleDoubleProperty(8);
        DoubleProperty b = new SimpleDoubleProperty(4);
        DoubleProperty c = new SimpleDoubleProperty(3);
        DoubleProperty d = new SimpleDoubleProperty(2);

        //DoubleBinding result = a.add(b);
        DoubleBinding result = Bindings.add(10.2, a);
        System.out.println("a"+result.get());

        DoubleBinding res = a.divide(c);
        System.out.println("r"+res);

        IntegerProperty aNum1 = new SimpleIntegerProperty(10);
        Integer aNum2 = 12;

        NumberBinding bb = Bindings.add(aNum1, aNum1);
        System.out.println("b"+bb);
        Bindings.add(aNum1, aNum2);
        aNum1.add(aNum2);

        Person male = new Person();
        male.setFullname("Zubair Ahmed");
        System.out.println(male);

        Person female = new Person();
        female.setFullname("Susan Brown");
        female.setEmployed(true);

        System.out.println(female);
        System.out.println(female.fullnameProperty());



    }

}

