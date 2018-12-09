import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of items:"); //User enter number of items purchased.
        int items = scan.nextInt();

        System.out.println("Enter the amount paid by the customer:"); //User enters how much money the customer gives to cashier.
        double amountPaid = scan.nextDouble();

        double[] itemPrice = new double[items]; //Creates and array based on user input.
        double totalPrices = 0;
        System.out.println("Enter the prices for EACH item:"); //User enters the price for each item.
        for (int i = 0; i < itemPrice.length; i++) {
            itemPrice[i] = scan.nextDouble();
            totalPrices += itemPrice[i]; //Sums the total amount purchased.
        }

        double change = amountPaid - totalPrices; //Calculates change.

        System.out.println("Change owed: " + change + "\n");  //Prints change.

        int noDecimals = (int) (change * 100); //Takes out the decimal value.  For example, if 47.66, will store 4766.
        int coins = 0;

        int dollars = noDecimals / 100; //Takes the change without decimals and divides by 100 (which excludes the last 2 digits).  For example, if 4766, will store 47.
        coins = (noDecimals - dollars * 100); //Isolates the last 2 digits of change.  For example, if 4766, will store 66.
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
