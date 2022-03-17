import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        System.out.println("hello");

        Scanner input = new Scanner(System.in);
        System.out.println("You are in land full of Dragons!!!");
        System.out.println("Chose between the two caves: Cave 1  or Cave 2 ?!");

        boolean num = false;
       while (!num) {//
           //int entreNumber = input.nextInt();
          entreNumber = getNumber(input);
           num = methodeToTest(entreNumber);
       }

    }
    public static int getNumber(Scanner input) {
        try {
            return input.nextInt();
        }catch (Exception e){
            e.printStackTrace();
           // System.out.println( "NumberFormatException occurred" + e);
        }
        return 0;
    }

    public static int entreNumber;


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
