package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main ( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext (" config.xml" ) ;
        Database database=context.getBean ( Database.class );
                                                                          //Q1 && Q8(check config.xml
        System.out.println (database );
//
//        Restaurant  teaRestaurant=context.getBean ( "TeaRestaurant",Restaurant.class );
//        teaRestaurant.getHotDrink ().prepareHotDrink ();                    //Q3
        Restaurant  Restaurant=context.getBean ( "Restaurant",Restaurant.class );
        Restaurant.getHotDrink ().prepareHotDrink ();                            //Q9 @autowired by setterMethod
//
    //        boolean  teaRestaurant=context.isPrototype ( "TeaRestaurant");
    //        System.out.println ("TeaRestaurant isPrototype :"+teaRestaurant );    //Q7

////        Restaurant expressTeaRestaurant=context.getBean ( "expressTeaRestaurant",Restaurant.class );
////        expressTeaRestaurant.getHotDrink ().prepareHotDrink ();             //Q4
//
//        Complex complex=context.getBean ( Complex.class );
//        System.out.println (complex );                                     //Q5

//        Restaurant rs= (Restaurant) context.getBean ( "RestaurantQ6a",Restaurant.class );
//
//       rs.hotDrink.prepareHotDrink ();                                    //Q6 by constructor

    }
}
