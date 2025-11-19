import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("C:\\Users\\Asif\\Desktop\\Test.txt");){
            writer.write("My name is Asif Iqbal.");
        }
        catch (IOException e){
            System.out.println("Could not write file.");
        }
    }
}
