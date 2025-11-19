import java.util.Scanner;

public class Banking_program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        System.out.println("_______________");
        System.out.println("BANKING PROGRAM");
        System.out.println("_______________");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("_______________");

        while (isRunning) {

            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("_______________");
                    System.out.println("SHOW BALANCE");
                    System.out.println("_______________");
                    ShowBalance(balance);
                }
                case 2 -> {
                    System.out.println("_______");
                    System.out.println("DEPOSIT");
                    System.out.println("_______");
                    double x = deposit();
                    balance += x;
                    System.out.printf("$%,.2f deposited. Balance after deposit is $%,.2f\n",x,balance);
                }
                case 3 -> {
                    System.out.println("________");
                    System.out.println("WITHDRAW");
                    System.out.println("________");
                    double x = withdraw();
                    balance -= x;
                    System.out.printf("$%,.2f withdrew. Balance after withdrawal is $%,.2f\n",x,balance);
                }
                case 4 -> {
                    System.out.println("EXITING THE PROGRAM....");
                    isRunning = false;
                }
                default -> System.out.println("Invalid prompt. Enter a option between (1-4): ");
            }
        }
    }

    static void ShowBalance(double balance){
        System.out.printf("Your current balance is: $%,.2f\n",balance);
    }

    static double deposit(){
        System.out.print("Enter amount to be deposit: ");
        double amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount can't be negative.");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw(){
        System.out.print("Enter amount to be withdraw: ");
        double amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount can't be negative.");
            return 0;
        }
        else{
            return amount;
        }
    }
}
