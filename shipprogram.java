
import java.util.Scanner;




class player_turn {

    Scanner getinput = new Scanner(System.in);

    int row;
    int column;

    void getplayer_turn(){
        System.out.println("Enter turn for row: ");
        row = getinput.nextInt();

        System.out.println("Enter turn for row: ");
        column = getinput.nextInt();
    }
 }

class board{

    boolean[][] board = new boolean[5][5];

    int horizontal = 5;
    int vertical = 5;

    void show_board(){
        
        for (int x = 0; x < vertical; x++){
            for (int y = 0; y < horizontal; y++) {
            System.out.print("|" + board[x][y] + "|");
            }
            System.out.println();
        }
    }
}

public class shipprogram {

    public static void main(String[] args){

    int choice = 0;
    player_turn player1 = new player_turn();
    player_turn player2 = new player_turn();

    System.out.println("WELCOME TO BATTLESHIP!");
    
    boolean gameover = false;
    
    board mainbBoard = new board();
    mainbBoard.show_board();



    }//main
}//class