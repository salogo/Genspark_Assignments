import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Hangman_functional {
    public static int wrongCount = 0;
    public static List<Character> Guesses = new ArrayList<>();
    public static    int correctCount = 0;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/words.txt"));
        Scanner keyboard = new Scanner(System.in);

        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
        Random rand = new Random();
        // pick up random word from the list length
        String word = words.get(rand.nextInt(words.size()));

        System.out.println(word);

       // List<Character> Guesses = new ArrayList<>();

        printWordState(word, Guesses);

        System.out.println("Please enter your guess");

        getPlayerGuesses(keyboard,word, Guesses);

    }

    public static void displayDrawing(int count){
        System.out.println("---------");
        System.out.println("|       |");

        if (count >=1 ){
            System.out.println(" 0");
        }
        if (count >= 2 ){
            System.out.print("\\ ");

            if (count >=3){

                System.out.println("/");
            }
            else {
                System.out.println("");
            }
        }

        if (count >=4){
            System.out.println(" |");
        }

        if (count >= 5 ){
             System.out.print("/ ");
            if (count >= 6){
                 System.out.println("\\");
            }
            else {
                System.out.println("");
            }
        }

    }

    private static boolean getPlayerGuesses(Scanner keyboard, String word, List<Character> Guesses) {
        int numberGuess = 7;
        String letterGuess = "";
        while (numberGuess > 0){
            displayDrawing(wrongCount);
            printWordState(word, Guesses);

            System.out.println("Enter your letter!:");
            System.out.println(wrongCount);
            try {
                letterGuess = keyboard.nextLine();
                Guesses.add(letterGuess.charAt(0));
            } catch (Exception e){
                System.out.println( "NumberFormatException occurred");
                System.exit(0);
            }

            if (!word.contains(letterGuess)) {
                wrongCount++;
            }

            if (printWordState(word, Guesses) ){
                System.out.println("You win");
                break;
            }

            numberGuess--;

        }
        return word.contains(letterGuess);
    }

    //###################################################################################################
    private static boolean printWordState(String word, List<Character> Guesses) {
        // using a stream instead of a loop
        String [] wordArray = word.split("");
        Arrays.stream(wordArray).forEach(ch ->  checkLetter(ch, word));
        System.out.println();
        return (word.length() == correctCount);
    }

    private static void checkLetter(String letter, String word){

        if (   Guesses.contains(letter)   ){

            correctCount++;
        }
        else {
            System.out.print("-");
        }


    }

    //###################################################################################################

}





