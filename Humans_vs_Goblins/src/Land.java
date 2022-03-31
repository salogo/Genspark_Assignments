import java.util.Random;
import java.util.Scanner;

public class Land {

    public static void main(String[] args) {

        char [][] gameBoard =  {{' ','|',' ', '|', ' '},
                                {'-','+','-', '+', '-'},
                                {' ','|',' ', '|', ' '},
                                {'-','+','-', '+', '-'},
                                {' ','|',' ', '|', ' '}};


        printGameBoard(gameBoard);

        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter placement 1-9: ");
            int playerPos = scan.nextInt();

            placePiece(gameBoard, playerPos, "human" );

            // use random input for Goblins
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) +1;
            placePiece(gameBoard, cpuPos, "goblin" );

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

    public static void placePiece( char[][] gameBoard, int pos, String user){
        char symbol = ' ';
        if( user.equals("human")){
            symbol = 'H';
        } else if (user.equals("goblin")){
            symbol = 'G';
        }
        switch (pos){
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

    public static String checkWinner(){
        return "";
    }

    //1-methode to implement Human health and strength increment or decrement = died or not
    //2-methode to implement Goblins health and strength increment or decrement = died or not



}
