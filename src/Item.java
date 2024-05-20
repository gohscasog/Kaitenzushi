package src;

public class Item
{
    public static enum FoodType
    {
        Other,
        Dairy,
        Eggs,
        Seafood,
        Nuts,
        Wheat,
        Soy
    }

    Item(String name, FoodType type, double price)
    {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    
    Item
    (
        String name,
        FoodType type, 
        double price, 
        String description, 
        String[] ingredients
    )
    {
        this(name, type, price);
        this.description = description;
        this.ingredients = ingredients;
    }

    String name = "";
    FoodType type = FoodType.Other;
    double price = 0.0;
    String description = "";
    String[] ingredients = null;
}
