import java.util.Scanner;

public class Dragon {
    public static int entreNumber;
    public static void main(String[] args) {

        System.out.println("hello");

        Scanner input = new Scanner(System.in);
        System.out.println("You are in land full of Dragons!!!");
        System.out.println("Chose between the two caves: Cave 1  or Cave 2 ?!");

       // condition while user did not enter a number the methode getNumber will never call boolean num will stay false
        boolean num = false;
       while (!num) {//
           //creating user input
          entreNumber = getNumber(input);
           num = methodeToTest(entreNumber);
       }

    }

    // Methods to get number from user and catch Exception if the user enters a nonvalid number or character
    public static int getNumber(Scanner input) {

        try {
            int guess = input.nextInt();
            return guess;//input.nextInt();
        }catch (Exception e){
           // e.printStackTrace();
            System.out.println( "NumberFormatException occurred");
         System.exit(0);
        }
        return 0;
    }

   // This method will be called for testing
    public static boolean methodeToTest(int entreNumber) {

        if (entreNumber == 1) {
            System.out.println("IT'S A DARK AND SPOOKY CAVE, A LARGE DRAGON JUMPS OUT IN FROND OF YOU! HE OPENS HIS JAWS AND GOBBLE YOU IN ONE BIE");
            return true;
        }
        else if (entreNumber == 2){
            System.out.println("YOU ARE IN THE FRIENDLY DRAGON CAVE, TAKE WHAT YOU NEED FROM MY COLLECTED TREASURES");
            return true;
        }
        else {
            System.out.println("Please enter Number 1 or 2");
            return false;
        }
    }
}
