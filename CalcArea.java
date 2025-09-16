import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args){
        double width;
        double height;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        height = scanner.nextDouble();

        System.out.print("Enter width in cm: ");
        width = scanner.nextDouble();

        area = height * width;
        System.out.println("The area is: "+area+" cm²");

        scanner.close();
    }
}
