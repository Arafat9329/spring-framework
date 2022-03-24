package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

        PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);

        PartTimeMentor pt3 = container.getBean(PartTimeMentor.class);// will give the @Primary one

        ft.createAccount();

        pt.createdAccount();

        pt3.createdAccount();

        String st = container.getBean(String.class);
        System.out.println(st);
    }
}
