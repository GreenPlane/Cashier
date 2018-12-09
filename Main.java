import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int items = scan.nextInt();

        System.out.println("Enter the amount paid by the customer:");
        double amountPaid = scan.nextDouble();

        double[] itemPrice = new double[items];
        double totalPrices = 0;
        System.out.println("Enter the prices for EACH item:");
        for (int i = 0; i < itemPrice.length; i++) {
            itemPrice[i] = scan.nextDouble();
            totalPrices += itemPrice[i];
        }

        double change = amountPaid - totalPrices;

        System.out.println("Change owed: " + change + "\n");

        int noDecimals = (int) (change * 100); 
        int coins = 0; 

        int dollars = noDecimals / 100;
        coins = (noDecimals - dollars * 100);
        int quarters = coins / 25;
        int dimes = (coins - (quarters * 25)) / 10;
        int nickels = (coins - (quarters * 25 + dimes * 10)) / 5;
        int pennies = (coins - (quarters * 25 + dimes * 10 + nickels * 5));
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
