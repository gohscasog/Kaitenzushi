package src;

import src.Item.FoodType;

public class Customer
{
    Customer(String name)
    {
        this.name = name;
    }

    Customer(String name, String id, String phone)
    {
        this(name);
        this.id = id;
        this.phone = phone;
    }

    Customer(String name, String id, String phone, FoodType[] allergenics)
    {
        this(name, id, phone);
        this.allergenics = allergenics;
    }

    void AddOrder(){}
    void DelOrder(){}

    String name = "";
    String id = "";
    String phone = "";
    FoodType[] allergenics = null;
    Order[] orders = null;
}
