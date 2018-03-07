package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Database {
    private String name;
    private Integer port;

    @Override
    public String toString ( ) {
        return "Database{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }

    public String getName ( ) {
        return name;
    }


    @Autowired
    public void setName ( String name ) {
        this.name = name;
    }

    public Integer getPort ( ) {
        return port;
    }

    public void setPort ( Integer port ) {
        this.port = port;
    }
}
