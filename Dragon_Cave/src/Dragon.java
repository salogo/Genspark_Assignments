import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        System.out.println("hello");

        //1- Drago cave :
        //2-one is friendly and share their collected treasures
        //3-The other is greedy and hungry
        // 4- you are in land full of dragons
        //5-you see two caves and have to chose
        //6- if you enter number one (1) the cave is dark and spooky
        //-7- a large dragon jumps out in frond of you ! he opens his jaws and gobble you
        //8- process finished with exit  code zero
        Scanner input = new Scanner(System.in);
        System.out.println("You are in land full of Dragons!!!");
        System.out.println("Chose between the two caves: Cave 1  or Cave 2 ?!");
        Byte entreNumber = input.nextByte();



        if (entreNumber == 1) {
            System.out.println("IT'S A DARK AND SPOOKY CAVE, A LARGE DRAGON JUMPS OUT IN FROND OF YOU! HE OPENS HIS JAWS AND GOBBLE YOU IN ONE BIE");
        }
        else if (entreNumber == 2){
            System.out.println("YOU ARE IN THE FRIENDLY DRAGON CAVE, TAKE WHAT YOU NEED FROM MY COLLECTED TREASURES");
        }
        else if (entreNumber == 0){
            System.out.println("");
        }
        else {
            System.out.println("Please enter Number 1 or 2");
        }


    }
}
