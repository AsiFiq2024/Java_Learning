import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;
        double c;
        System.out.print("Enter two int numbers and one double number: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextDouble();

        double c1,c2,c3,c4,c5;

        c1 = Math.pow(a,b);
        c2 = Math.sqrt(c);
        c3 = Math.round(c);
        c4 = Math.abs(a);
        c5 = Math.max(a,b);

        System.out.println("pow a,b: "+c1);
        System.out.println("sqrt of c: "+c2);
        System.out.println("round of c: "+c3);
        System.out.println("abs of a: "+c4);
        System.out.println("max of a,b: "+c5);

        scanner.close();
    }
}
