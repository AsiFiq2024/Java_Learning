import java.util.Random;
import java.util.Scanner;

public class Number_guessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess,attemtps,randomnumber;

        randomnumber = random.nextInt(1,11);
        System.out.println("Random number: "+randomnumber);

        System.out.print("Enter your guess (1-10): ");
        guess = scanner.nextInt();
        attemtps = 1;

        while(guess != randomnumber && attemtps != 3){
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attemtps++;
        }

        if(guess == randomnumber && attemtps <= 3){
            System.out.println("Bravo! You won.");
        }
        else{
            System.out.println("Uh oh! You lose.");
        }

        scanner.close();
    }
}
