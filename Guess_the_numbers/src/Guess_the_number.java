import java.util.Scanner;
import java.util.Random;

public class  Guess_the_number {
    public static void  guessingNumberGame() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello! what is your name?");
        String userName = userInput.nextLine();
        System.out.println(" Well, " + userName + " I m thinking of a number between 1 and 20 take a guess.");

        int min = 1;
        int max = 20;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        System.out.println(value);

        int attempt = 5;
        byte guessingNumber;
        int i;

        for (i = 0; i < attempt; i++) {
             guessingNumber = userInput.nextByte();

            if  (guessingNumber == value ) {
                System.out.println("Good job  " + userName + "You guessed my number in "+ i +" guess" );
                break;
            }
            else if (guessingNumber > value && i != attempt - 1) {
                System.out.println("Your guess is higher, try again");
            }
            else if (guessingNumber < value && i != attempt - 1) {
                System.out.println("Your guess is low try again");
            }


        }

        if (i == attempt) {
            System.out.println("you attempted 6 lost ");
        }

    }


    // Driver Code
    public static void
    main(String arg[]) {
        // Function Call
        guessingNumberGame();
    }


}
