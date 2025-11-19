import java.util.Scanner;
import java.util.Random;

public class Dice_roller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numDice,total = 0;

        System.out.print("Enter the number of dice to be rolled: ");
        numDice = scanner.nextInt();

        if(numDice < 0){
            System.out.println("Number of dice to be rolled has to greater than 0.");
        }
        else{
            for(int i = 0; i < numDice; i++){
                int roll = random.nextInt(1,7);
                total += roll;
                System.out.println("You rolled "+roll);
                printDie(roll);
            }
            System.out.println("Your total score: "+total);
        }

        scanner.close();
    }
    static void printDie(int roll){
        String dice1 = """
                 -----------
                |           |
                |     ●     |
                |           |
                 -----------
                """;
        String dice2 = """
                 -----------
                |  ●        |
                |           |
                |         ● |
                 -----------
                """;
        String dice3 = """
                 -----------
                |  ●        |
                |     ●     |
                |        ●  |
                 -----------
                """;
        String dice4 = """
                 -----------
                |  ●      ● |
                |           |
                |  ●      ● |
                 -----------
                """;
        String dice5 = """
                 -----------
                |  ●      ● |
                |      ●    |
                |  ●      ● |
                 -----------
                """;
        String dice6 = """
                 -----------
                |  ●      ● |
                |  ●      ● |
                |  ●      ● |
                 -----------
                """;
        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }
}
