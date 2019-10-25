package com.example.food;

public class Item {
    public int id;
    public String name;
    public double price;
    public String detail;
    public int image;
    public int count;

    public Item(int id, String name, double price, String detail,int image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.image = image;
    }
}
