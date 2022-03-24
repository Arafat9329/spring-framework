package com.cydeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {

//    //Field Injection
//    @Autowired //will give you warring
//    OfficeHours officeHours;

    OfficeHours officeHours;

//    @Autowired// even without this annotation, spring will do it
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {
        System.out.println("Weekly Java teaching hours : " + (20 + officeHours.getHours()));
    }
}
