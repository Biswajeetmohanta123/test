package com.example.springboot;
import org.springframework.stereotype.Component;
public class Objects {
    private String name;
    private String address;

    public Objects(String name, String address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString(){
        return "name=" + name + ", address=" + address;
    }
}
