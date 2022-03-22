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

        while (true){
            getPlayerGuesses(keyboard, word, Guesses);
            if (printWordState(word, Guesses) ){
                System.out.println("You win");
                break;
            }

            System.out.println("Please enter your guess");
            if (keyboard.nextLine().equals(word)){
                System.out.println("You win");
                break;
            }
            else {
                System.out.println("please try again");
            }
        }
        //System.out.println("You win");


    }

    private static void getPlayerGuesses(Scanner keyboard, String word, List<Character> Guesses) {
        int numberGuess = 6;
        while (numberGuess > 0){
          printWordState(word, Guesses);

          System.out.println("Enter your letter!:");
          String letterGuess = keyboard.nextLine();
          Guesses.add(letterGuess.charAt(0));
          numberGuess--;
      }
    }


    private static boolean printWordState(String word, List<Character> Guesses) {
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Guesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                correctCount++;
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println();

        return (word.length() == correctCount);





    }
}
