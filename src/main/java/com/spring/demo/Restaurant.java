package com.spring.demo;

import org.springframework.beans.factory.annotation.Required;

public class Restaurant {
    HotDrink hotDrink;

    public HotDrink getHotDrink ( ) {
        return hotDrink;
    }


    public void setHotDrink ( HotDrink hotDrink ) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString ( ) {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}
