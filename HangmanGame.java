import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch (IOException e){
            System.out.println("Something went wrong.");
        }

        Random random = new Random();
        int index = random.nextInt(0,words.size());


        String word = words.get(index);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        int l = 1;

        System.out.println(getHangmanArt(wrongGuesses));

        while((wrongGuesses != 6) && (l <= word.length())){
            for(int i = 0; i < word.length(); i++){
                System.out.print(wordState.get(i) + " ");
            }
            System.out.println();
            System.out.println();
            System.out.print("Guess a letter: ");
            char letter = scanner.next().toLowerCase().charAt(0);
            if(word.indexOf(letter) >= 0){
                System.out.println("Correct guess!");
                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == letter){
                        wordState.set(i,letter);
                        l++;
                    }
                }
            }
            else{
                wrongGuesses++;
                System.out.println("Wrong guess!");
            }
            System.out.println(getHangmanArt(wrongGuesses));
        }

        if(l > word.length()){
            System.out.println("Bravo! You won.");
            System.out.println("The word was: "+word);
        }
        else{
            System.out.println("Uh oh! You lost.");
            System.out.println("The word was: "+word);
        }

        scanner.close();
    }
    static String getHangmanArt(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                    ---
                      |
                    
                    
                    """;
            case 1 -> """
                    ---
                      |  
                      o
                    
                    """;
            case 2 -> """
                    ---
                      |  
                      o
                     /
                    
                    """;
            case 3 -> """
                    ---
                      |  
                      o
                     /|
                    
                    """;
            case 4 -> """
                    ---
                      |  
                      o
                     /|\\
                    
                    """;
            case 5 -> """
                    ---
                      |  
                      o
                     /|\\
                     /
                    """;
            case 6 -> """
                    ---
                      |  
                      o
                     /|\\
                     / \\
                    """;
            default -> "";
        };
    }
}
