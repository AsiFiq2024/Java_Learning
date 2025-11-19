import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AddMusic {
    public static void main(String[] args) {
        String filepath = "src\\mysound.wav";
        File file = new File(filepath);
        boolean play = true;

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            System.out.println("Program ran successfully.");

            String response = "";

            while (!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.loop(5);
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid input.");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException e){
            System.out.println("Something went wrong.");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported Audio file.");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource.");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}
