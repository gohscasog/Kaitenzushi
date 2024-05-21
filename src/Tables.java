package src;

import java.util.ArrayList;

public class Tables
{
    private class Table
    {
        Table(){}
        Table(Customer customer)
        {
            this.customer = customer;
            this.occupied = true;
        }

        Customer customer = null;
        Boolean occupied = false;
    }

    Tables(int size)
    {
        tables = new ArrayList<Table>(size);

        for(int i = 0; i < size; i++)
        {
            tables.add(new Table());
        }
    }

    void AddTable()
    {
        tables.add(new Table());
    }

    void AddTable(Customer customer)
    {
        tables.add(new Table(customer));
    }

    void DelTable(int index)
    {
        tables.remove(index);
    }

    void Checkin(int index, Customer customer)
    {
        tables.get(index).customer = customer;
        tables.get(index).occupied = true;
    }

    void Checkout(int index, Customer customer)
    {
        tables.get(index).customer = null;
        tables.get(index).occupied = false;
    }

    Boolean IsOccupied(int index)
    {
        return tables.get(index).occupied;
    }

    @Override public String toString()
    {
        String s = "TABLE\tSTATUS\n";
        
        for(int i = 0; i < tables.size(); i++)
        {
            s = s + String.format
            (
                "%s\t%s\n", 
                i + 1, 
                (tables.get(i).occupied) ? "Occupied" : "Available"
            );
        }

        return s;
    } 

    int GetSize()
    {
        return tables.size();
    }

    private ArrayList<Table> tables = null;
}
