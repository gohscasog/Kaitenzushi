package src;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ArrayList;

public class Order
{
    Order(int id, Customer customer, ArrayList<Item> items)
    {
        this.id = id;
        this.customer = customer;
        this.items = items;
    }

    void AddItem(ArrayList<Item> items)
    {
        items.forEach(i->this.items.add(i));
    }

    void AddItem(Item[] items)
    {
        for(int i = 0; i < items.length; i++)
        {
            this.items.add(items[i]);
        }
    }

    void AddItem(Item item)
    {
        items.add(item);
    }

    void RemoveItem(ArrayList<Item> items)
    {
        items.forEach(i->this.items.remove(i));
    }

    void RemoveItem(Item[] items)
    {
        for(int i = 0; i < items.length; i++)
        {
            this.items.remove(items[i]);
        }
    }

    void RemoveItem(Item item)
    {
        items.remove(item);
    }

    private void SetTotal()
    {
        if(total > 0.0)
        {
            return;
        }

        items.forEach(i->{total += i.price;});

        formattedTotal = NumberFormat.getCurrencyInstance
        (
            new Locale.Builder()
            .setLanguage("pt")
            .setRegion("BR").build()
        )
        .format(total);
    }

    double GetTotal()
    {
        SetTotal();

        return total;
    }

    String GetFormattedTotal()
    {
        SetTotal();

        return formattedTotal;
    }

    int id = 0;
    Customer customer = new Customer();
    ArrayList<Item> items = new ArrayList<Item>();
    private double total = 0.0;
    private String formattedTotal = "";
}
