import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/zakariasalogo/Desktop/words.txt"));
        Scanner keyboard = new Scanner(System.in);

        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            //System.out.println(scanner.nextLine());
            words.add(scanner.nextLine());
        }
        Random rand = new Random();
        // pick up random word from the list length
        String word = words.get(rand.nextInt(words.size()));

        System.out.println(word);
        List<Character> Guesses = new ArrayList<>();

        printWordState(word, Guesses);
        System.out.println("Enter your letter!:");

    }

    private static void printWordState(String word, List<Character> Guesses) {
        for (int i = 0; i < word.length(); i++){
            if (Guesses.contains(word.charAt(i))){
                System.out.println(word.charAt(i));
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println();





    }
}
