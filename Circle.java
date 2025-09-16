import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius,2);
        double vol = (4/3.0) * Math.PI * Math.pow(radius,3);
        double circum = 2 * Math.PI * radius;

        System.out.printf("Area: %.2fcm²\n",area);
        System.out.printf("Volume: %.2fcm³\n",vol);
        System.out.printf("Circumference: %.2fcm\n",circum);

        scanner.close();
    }
}
