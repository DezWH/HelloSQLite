package com.dez.www.hellosqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Product {

    String name;
    int quantity;

    public Product(String name, int quantity){
        this.name = name;
        this.quantity = quantity;


    }
    @Override
    public String toString(){
        return "Name: " + name + "quantity: " + quantity;

    }
}
