package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car c = context.getBean(Car.class);
        Person p = context.getBean(Person.class);

        System.out.println("Person name: " + p.getName());//Person name: Mike
        System.out.println("Car's name: "+c.getMake());//Car's name: Honda
        System.out.println("Person's car : "+p.getCar());//Person's car : null --> it doest not know it can use Car obj

        System.out.println("Person's car : "+p.getCar().getMake());// wiring
    }
}
