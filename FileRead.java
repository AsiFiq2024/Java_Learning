import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Asif\\Desktop\\Test.txt"))){
            System.out.println("File exists.");
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
