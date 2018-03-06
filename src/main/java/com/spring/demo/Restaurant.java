package com.spring.demo;

public class Restaurant {
    HotDrink hotDrink;

    public Restaurant ( HotDrink hotDrink ) {
        this.hotDrink = hotDrink;
    }
    //    public HotDrink getHotDrink ( ) {
//        return hotDrink;
//    }
//
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
