import java.util.Scanner;

public class ShobCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine();

        System.out.print("What is the price of each?: ");
        double price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        int quantity = scanner.nextInt();

        System.out.println("\nYou have bought "+quantity+" "+item+"/s");
        System.out.println("Your total is $"+quantity*price);

        scanner.close();
    }
}
