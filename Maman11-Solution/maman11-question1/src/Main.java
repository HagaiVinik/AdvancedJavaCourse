import java.util.Scanner;

public class Main
{
    Cashier cashier;

    public static void startBill(Cashier cashier)
    {
        cashier.startBill();

        while(true)
        {
            System.out.println("---------------------");
            System.out.println("Bill menu:");
            System.out.println("---------------------");
            System.out.println("1. Add Item");
            System.out.println("2. Print bill");
            System.out.println("3. Pay bill");

            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option:");

            int option = scanner.nextInt();  // Read user input
            scanner.nextLine();
            if (option == 1)
            {
                System.out.println("Enter item name:");
                String name = scanner.nextLine();
                System.out.println("Enter item cost:");
                double cost = scanner.nextDouble();
                cashier.addToBill(new BuyItem(name, cost));
            }
            else if (option == 2)
            {
                cashier.printBill();
            }
            else if (option == 3)
            {
                System.out.println("Enter money amount:");
                double moneyAmount = scanner.nextDouble();
                cashier.getPayment(moneyAmount);
                return;
            }
        }
    }
    public static void main(String[] args)
    {
        Cashier cashier = new Cashier();

        while (true)
        {
            System.out.println("---------------------");
            System.out.println("Cashier menu:");
            System.out.println("---------------------");
            System.out.println("1. start new bill");
            System.out.println("2. print balance");

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option:");

            int option = myObj.nextInt();  // Read user input

            if (option == 1)
            {
                startBill(cashier);
            }
            else if (option == 2)
            {
                System.out.println("Balance is: " + Double.toString(cashier.getBalance()));
                return;
            }
        }

    }
}