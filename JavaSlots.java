import java.util.Scanner;
import java.util.Random;

public class JavaSlots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("*************************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols \uD83C\uDF52 \uD83C\uDF49 \uD83C\uDF4B \uD83C\uDF53 \uD83C\uDF4D");
        System.out.println("*************************");

        String[] symbols = {"🍒", "🍉", "🍋", "🍓","🍍"};


        int cur_bal = 100;
        int bet;

        boolean play = true;

        while (play){
            System.out.printf("Current balance: $%,d\n",cur_bal);
            System.out.print("Place your bet: ");
            bet = scanner.nextInt();
            int[] ser = new int[3];
            System.out.println("Spinning...");
            System.out.println("**************");
            for(int i = 0; i < 3; i++){
                int serial = random.nextInt(0,5);
                ser[i] = serial;
                System.out.print(symbols[serial]);
                if(i < 2){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            System.out.println("**************");
            boolean result = true;
            for(int i = 0; i < 2; i++){
                if(ser[i] != ser[i+1]){
                    result = false;
                    break;
                }
            }
            if(result){
                System.out.println("Congrats! You won this round.");
                cur_bal += bet;
            }
            else{
                System.out.println("Sorry you lost this round.");
                cur_bal -= bet;
            }
            System.out.print("Do you want to play again? (Y/N): ");
            char opt = scanner.next().toUpperCase().charAt(0);
            if(cur_bal < 0){
                System.out.println("You spent all your balance. You can't play anymore");
                play = false;
                System.out.println("Exiting the game");
            }
            if(opt != 'Y' || opt != 'N'){
                System.out.print("Invalid input. Do you want to play again? (Y/N): ");
                opt = scanner.next().toUpperCase().charAt(0);
            }
            if(opt == 'N'){
                play = false;
                System.out.printf("You get: $%,d . Have a nice day!\n",cur_bal);
                System.out.println("Exting the game...");
            }
            else{
                System.out.println("Great! Let's try again.");
            }
        }

        scanner.close();
    }
}
