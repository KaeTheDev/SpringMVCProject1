package com.test.util;


public class Item
{
    private String name;
    private String description;
    private int quantity;
    private float price;

    //No Args Constructor
    public Item()
    {
        name = "";
        description = "";
        quantity = 0;
        price = 0;
    }

//All Args Contstructor
    public Item(String name, String description, int quantity, float price)
    {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public float getPrice() {return price;}

    public void setPrice(float price) {this.price = price;}
}
