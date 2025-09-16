import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student?: ");
        boolean isStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("You haven't entered a name.");
        }
        else{
            System.out.println("Hello "+name+"! Nice to meet you.");
        }

        if (age >= 65) {
            System.out.println("You're a senior citizen.");
        }
        else if(age >= 18) {
            System.out.println("You're an adult.");
        }
        else if (age < 0) {
            System.out.println("You haven't been born yet.");
        }
        else if (age == 0) {
            System.out.println("You're a baby");
        } else{
            System.out.println("You're a child.");
        }

        if(isStudent){
            System.out.println("You're a student.");
        }
        else{
            System.out.println("You are not a student.");
        }

        scanner.close();
    }
}
