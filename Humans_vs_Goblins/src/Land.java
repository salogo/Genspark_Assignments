import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Land {
    public Humans player;
    public Goblins goblins;
    public int humanLastPosition;
    public int goblinLastPosition;

    public Land(){
        player = new Humans();
        goblins = new Goblins();
        humanLastPosition = 1;
        goblinLastPosition = 9;
    }

    public static void main(String[] args) {
        Land land = new Land();

        char [][] gameBoard =  {{'H','|',' ', '|', ' '},
                                {'-','+','-', '+', '-'},
                                {' ','|',' ', '|', ' '},
                                {'-','+','-', '+', '-'},
                                {' ','|',' ', '|', 'G'}};

        printGameBoard(gameBoard);

        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter placement  ");
            System.out.println("top row = 1, 2, 3 ");
            System.out.println("mid row = 4, 5, 6");
            System.out.println("bot row = 7, 8, 9 ");
            System.out.println("left row =1, 4, 7");
            System.out.println("mid col = 2, 5, 8 ");
            System.out.println("right col = 3, 6, 9 ");

            int humanPosition = scan.nextInt();

            land.placePiece(gameBoard, humanPosition, land.player);
            // use random input for Goblins
            int goblinsPosition = ThreadLocalRandom.current().nextInt( 9) +1;

            land.placePiece(gameBoard, goblinsPosition, land.goblins );

            printGameBoard(gameBoard);

        }

    }

    public static void printGameBoard(char[][] gameBoard){
        for( char[] row: gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void placePiece(char[][] gameBoard, int position, Object user){

       int lastPosition = 0;
        char symbol = 'f';
        if( user instanceof Humans h){// h = Human  object made from {Object user}
            if (position == goblinLastPosition ){
                checkWinner();
            }
            lastPosition = humanLastPosition;
            symbol = user.toString().charAt(0); //the method toString return "H" FROM human class
        } else if (user instanceof Goblins ){
            if (position == humanLastPosition ){
                checkWinner();
            }
            lastPosition = goblinLastPosition;
            symbol = 'G';//user.toString().charAt(0);
        }
        // cleaning the last position
        switch (lastPosition){
            case 1:
                gameBoard[0][0] = ' ';
                break;
            case 2:
                gameBoard[0][2] = ' ';
                break;
            case 3:
                gameBoard[0][4] = ' ';
                break;
            case 4:
                gameBoard[2][0] = ' ';
                break;
            case 5:
                gameBoard[2][2] = ' ';
                break;
            case 6:
                gameBoard[2][4] = ' ';
                break;
            case 7:
                gameBoard[4][0] = ' ';
                break;
            case 8:
                gameBoard[4][2] = ' ';
                break;
            case 9:
                gameBoard[4][4] = ' ';
                break;
            default:
                break;
        }

        if ( user instanceof Humans){
            humanLastPosition = position;
        } else {
            goblinLastPosition = position;
        }

        switch (position){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }


    }

    public void checkWinner(){

        while (player.getHealth() > 0 && goblins.getHealth() > 0){
            if (ThreadLocalRandom.current().nextInt(0 ,2) == 1 ){
                player.attack(goblins);
            }
            else {
                goblins.attack(player);
            }
        }

        if (player.getHealth() > 0 ){
            System.out.println("Goblin has died");
        }
        else {
            System.out.println("Human has died");
        }
        System.exit(0);
    }

}
