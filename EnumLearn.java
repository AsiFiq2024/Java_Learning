import java.util.Scanner;

public class EnumLearn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        //Day day = Day.SUNDAY;
        //System.out.println(day);
        // System.out.println(day.getDayNumber());

        try {
            Day day = Day.valueOf(response);
            switch (day){
                case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY -> System.out.println("Weekday");
                case SUNDAY -> System.out.println("Weekend");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid day.");
        }
    }
}
