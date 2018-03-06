package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main ( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext ("config.xml" ) ;
        Database database=context.getBean ( Database.class );

        System.out.println (database );
    }
}
