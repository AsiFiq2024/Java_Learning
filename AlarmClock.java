import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmtime = null;
        String filepath = "src\\mysound.wav";

        while (alarmtime == null){
            try{
                System.out.print("Enter an alarm time: ");
                String inputTime = scanner.nextLine();

                alarmtime = LocalTime.parse(inputTime,formatter);
                System.out.println("Alarm set for " + alarmtime);
            }
            catch (DateTimeParseException e){
                System.out.println("Invalid Format. Please use HH:MM:SS");
            }
        }

        alarmRun alarm = new alarmRun(alarmtime,filepath);
        Thread alarmThread = new Thread(alarm);
        alarmThread.start();
    }
}
