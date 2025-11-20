import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class alarmRun implements Runnable{

    private final LocalTime alarmTime;
    private final String filepath;

    alarmRun(LocalTime alarmTime,String filepath){
        this.alarmTime = alarmTime;
        this.filepath = filepath;
    }

    @Override
    public void run(){
        //LocalTime now = LocalTime.now();

        while (LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);
                int hours = LocalTime.now().getHour();
                int mins = LocalTime.now().getMinute();
                int secs = LocalTime.now().getSecond();
                System.out.printf("\r%02d:%02d:%02d",hours,mins,secs);
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted.");
            }
        }
        System.out.println("\n*ALARM NOISES*");
        playSound(filepath);
    }
    private void playSound(String filepath){
        File file = new File(filepath);
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audio = AudioSystem.getAudioInputStream(file)){
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            String play = "";
            while (!(play.equals("Q"))){
                clip.start();
                System.out.print("Enter Q to stop: ");
                play = scanner.next().toUpperCase();
            }
            clip.stop();
            clip.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException e){
            System.out.println("Something went wrong.");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio.");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Unsupported file.");
        }
    }
}
