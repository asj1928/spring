package com.spring.demo;

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
