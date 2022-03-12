import java.util.Scanner;
import java.util.Random;

public class  Guess_the_number {
    public static void  main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello what is your name?");
        String userName = userInput.nextLine();
        System.out.println(" Well, " + userName + " I m thinking of a number between 1 and 20 take a guess.");

        int min = 1;
        int max = 20;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        System.out.println(value);

       byte guessingNumber = userInput.nextByte();
       int attempt =0;
       boolean win = true;

            if (guessingNumber > value){
               attempt ++;
                System.out.println("high");;
           }
           else if (guessingNumber < value){
               attempt ++;
                System.out.println("your guess is low ;" + "your attempt is: " + attempt); ;
           }
        else if (guessingNumber == value && attempt <= 6 ){
            attempt++;
                System.out.println("win" + "your attempt is: " + attempt); ;
        }
        else if (guessingNumber == value && attempt >= 6) {
            attempt++;
                win = false;
                System.out.println("lost " + "your attempt is: " + attempt); ;
            }
        else if (attempt < 6 ){
                System.out.println("guess again");
                byte reguess = userInput.nextByte();
                 guessingNumber= reguess;

            }
        else {
                System.out.println("your attempt is " + String.valueOf(attempt));
            }


    }
}
