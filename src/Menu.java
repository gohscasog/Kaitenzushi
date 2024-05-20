package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import src.Item.FoodType;

public class Menu
{
    Menu(Scanner scanner)
    {
        this.menu = new ArrayList<Item>();
        this.foodTypeFromInt = FoodType.values();

        File file = new File("src\\resources\\Menu.csv");

        try
        {
            scanner = new Scanner(file);
        } 
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        while(scanner.hasNextLine())
        {
            String[] item = scanner.nextLine().split(",");
            
            menu.add(new Item(
                item[2], 
                foodTypeFromInt[Integer.parseInt(item[1])], 
                Double.parseDouble(item[3])
            ));
        }

        scanner.close();
    }

    public void PrintMenu()
    {
        menu.forEach(x->System.out.println(x.name));
    }

    ArrayList<Item> menu = null;
    FoodType[] foodTypeFromInt = null;
}
