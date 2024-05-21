package src;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = null;
        Menu menu = new Menu(scanner);
        Tables tables = new Tables(7);

        int opt = -1;
        
        System.out.println("(c) LixoWarez Ltda.");
        System.out.println("POINTOFSALE v1.0\n");

        scanner = new Scanner(System.in);

        while(opt != 69)
        {
            System.out.println("#######################");
            System.out.println("##### SUSHISMUNDO #####");
            System.out.println("#######################\n");
            System.out.println("Select an option:\n");
            System.out.println("1. Get a table");
            System.out.println("2. Call an employee");
            System.out.print("> ");
            
            opt = scanner.nextInt();
            System.out.println();

            switch(opt)
            {
                case 1:
                    {
                        System.out.println(tables.toString());
                        int tbl = 0;
                        while(true)
                        {
                            System.out.println("Select a table:");
                            System.out.print("> ");
                            tbl = scanner.nextInt();
                            if(!tables.IsOccupied(tbl - 1) && tbl > 0 && tbl <= tables.GetSize())
                            {
                                System.out.println();
                                System.out.println("Table " + tbl + " selected\n");
                                System.out.println("Input your name:");
                                System.out.print("> ");
                                String name = scanner.next();
                                tables.Checkin(tbl - 1, new Customer(name));
                                System.out.println();
                                break;
                            }
                            System.out.println();
                            System.out.println("Invalid table\n");
                            PressEnterToContinue(scanner);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Please wait, an employee is on the way\n");
                    break;
                
                case 69:
                    System.out.println("Shutting down\n");
                    break;

                default:
                    System.out.println("Invalid command\n");
                    break;
            }

            PressEnterToContinue(scanner);
        }

        scanner.close();
    }

    static void PressEnterToContinue(Scanner scanner)
    {
        System.out.println("Press Enter key to continue...");
        
        try
        {
            System.in.read();
            scanner.nextLine();
        }  
        catch(Exception e){}
    }
}