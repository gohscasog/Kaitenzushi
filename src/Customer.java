package src;

import src.Item.FoodType;

public class Customer
{
    Customer(){}

    Customer(String name, String id, String phone)
    {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    Customer(String name, String id, String phone, FoodType[] allergenics)
    {
        this(name, id, phone);
        this.allergenics = allergenics;
    }

    String name = "";
    String id = "";
    String phone = "";
    FoodType[] allergenics = {};
}
