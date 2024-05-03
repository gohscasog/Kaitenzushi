package src;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = null;
        Menu menu = new Menu(scanner);

        menu.PrintMenu();
    }
}