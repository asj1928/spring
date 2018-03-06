package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main ( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext (" config.xml" ) ;
//        Database database=context.getBean ( Database.class );
//                                                                          Q1
//        System.out.println (database );

        Restaurant  teaRestaurant=context.getBean ( "TeaRestaurant",Restaurant.class );
        teaRestaurant.getHotDrink ().prepareHotDrink ();                    //Q3

        Restaurant expressTeaRestaurant=context.getBean ( "expressTeaRestaurant",Restaurant.class );
        expressTeaRestaurant.getHotDrink ().prepareHotDrink ();             //Q4

        Complex complex=context.getBean ( Complex.class );
        System.out.println (complex );                                     //Q5
    }
}
