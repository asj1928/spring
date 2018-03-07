package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    HotDrink hotDrink;


    @Autowired
    public Restaurant ( HotDrink hotDrink ) {
        this.hotDrink = hotDrink;
    }
    //    public HotDrink getHotDrink ( ) {
//        return hotDrink;
//    }
//
//
//    @Autowired
//    public void setHotDrink ( HotDrink hotDrink ) {
//        this.hotDrink = hotDrink;
//    }

    @Override
    public String toString ( ) {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}
