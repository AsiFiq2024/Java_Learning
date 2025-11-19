import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choice = {"Rock","Paper","Scissors"};
        int your_choice;
        int cpu_choice;
        int your_score = 0;
        int cpu_score = 0;
        int tie = 0;
        boolean play = true;

        System.out.println("*****************");
        System.out.println("RockPaperScissors");
        System.out.println("*****************");
        System.out.println();
        System.out.println("Rules: Enter 1 for Rock,2 for Paper,3 for Scissor");
        System.out.println();
        while (play){
            System.out.print("Enter your choice: ");
            your_choice = scanner.nextInt();
            cpu_choice = random.nextInt(1,4);
            System.out.println("You chose: "+choice[your_choice-1]);
            System.out.println("Cpu chose: "+choice[cpu_choice-1]);
            switch (your_choice){
                case 1 ->{
                    if(cpu_choice == 1){
                        System.out.println("It's a tie.");
                        tie++;
                    }
                    else if (cpu_choice == 2) {
                        System.out.println("Cpu win!");
                        cpu_score++;
                    }
                    else{
                        System.out.println("You win!");
                        your_score++;
                    }
                }
                case 2 ->{
                    if(cpu_choice == 2){
                        System.out.println("It's a tie.");
                        tie++;
                    }
                    else if (cpu_choice == 1) {
                        System.out.println("You win!");
                        your_score++;
                    }
                    else{
                        System.out.println("Cpu win!");
                        cpu_score++;
                    }
                }
                case 3 ->{
                    if(cpu_choice == 3){
                        System.out.println("It's a tie.");
                        tie++;
                    }
                    else if (cpu_choice == 2) {
                        System.out.println("You win!");
                        your_score++;
                    }
                    else{
                        System.out.println("Cpu win!");
                        cpu_score++;
                    }
                }
                default -> System.out.println("Invalid input. Please enter 1 for Rock,2 for Paper,3 for Scissor");
            }
            System.out.println();
            System.out.println("Enter 1 to play again, 2 to exit.");
            System.out.print("Your input: ");
            int inp = scanner.nextInt();
            if(inp == 1){
                System.out.println();
                System.out.println("Great. Let's play again!");
                System.out.println();
            }
            else if(inp == 2){
                System.out.println("*********************************************************");
                System.out.println("You won: "+your_score+" Cpu won: "+cpu_score+" Tied: "+tie);
                System.out.println("*********************************************************");
                System.out.println("Exiting the game....");
                play = false;
            }
            else{
                System.out.println("Invalid input. Enter 1 to play again, 2 to exit.");
            }
        }

        scanner.close();
    }
}
