import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b,c;

        System.out.print("Enter the perpendicular: ");
        a = scanner.nextDouble();
        System.out.print("Enter the base: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse is: "+c);
        scanner.close();
    }
}
