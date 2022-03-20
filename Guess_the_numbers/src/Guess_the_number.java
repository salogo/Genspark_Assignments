import java.util.Scanner;
import java.util.Random;

public class  Guess_the_number {
    public static void  guessingNumberGame() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello! what is your name?");
        userName = userInput.nextLine();
        System.out.println(" Well, " + userName + " I m thinking of a number between 1 and 20 take a guess.");

        int min = 1;
        int max = 20;
        Random random = new Random();
        value = random.nextInt(max + min) + min;
        //System.out.println(value);

        int attempt = 6;
        int guessingNumber;
        int i;

        for (i = 0; i < attempt; i++) {
            guessingNumber = getGuessingNumber(userInput);

            if (verify( guessingNumber )) {
                System.out.println("Good job  " + userName + "You guessed my number in "+ i +" guess" );
                break;
            }



        }

        if (i == attempt) {
            System.out.println("you attempted 6 lost ");
        }

    }
    public static String userName ;
    public static int value;

    //method to verify if a user entered a correct number or no
    public static boolean verify(int guessingNumber) {
        if  (guessingNumber == value) {

            return true;
        }
        else if (guessingNumber > value) {
            System.out.println("Your guess is higher, try again");
        }
        else if (guessingNumber < value) {
            System.out.println("Your guess is low try again");
        }
        return false;
    }
   // catch Exception if a user enters a non-valid number
    public static int getGuessingNumber(Scanner userInput) {
        try {
            return userInput.nextInt();
        }catch (Exception e){
           // e.printStackTrace();
            System.out.println( "NumberFormatException occurred");
            System.exit(0);
        }
       return 0;
    }


    // Driver Code
    public static void main(String[] arg) {
        // Function Call
        guessingNumberGame();
    }


}

