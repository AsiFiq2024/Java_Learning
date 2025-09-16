import java.util.Scanner;

public class CompInterestCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principle,rate,amount;
        int timesComp,years;

        System.out.print("Enter the principal amount: ");
        principle = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the times compounded: ");
        timesComp = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow((1 + rate/timesComp),timesComp*years);

        System.out.printf("The calculated amount is $%,.2f\n",amount);

        scanner.close();
    }
}
