
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Board Board_ship = new Board();
        Player Player1 = new Player();
        Player Player2 = new Player();

        try (Scanner Getinput = new Scanner(System.in)) {
            boolean GameOver = false;
            
            while(!GameOver){
                int input_row = 0;
                int input_column = 0;
                
                boolean Player1_turn_over = false;
                boolean Player2_turn_over = false;
                //player 1 turn 
                while(!Player1_turn_over){
                    System.out.println("++=PLAYER 1 TURN=++");
                    input_row = Player1.Player_Turn_Row(Getinput);
                    input_column = Player1.Player_Turn_Column(Getinput);
                    
                    if (Board_ship.CheckTurn_Player1(input_row, input_column) == true){
                        Board_ship.PrintBoard();
                        Player1_turn_over = false;
                    } else {
                        Board_ship.PrintBoard();
                        Player1_turn_over = true;
                    }
                }
                //Player 2 turn 
                while(!Player2_turn_over){
                    System.out.println("++=PLAYER 1 TURN=++");
                    input_row = Player2.Player_Turn_Row(Getinput);
                    input_column = Player2.Player_Turn_Column(Getinput);
                    
                    if (Board_ship.CheckTurn_Player2(input_row, input_column) == true){
                        Board_ship.PrintBoard();
                        Player2_turn_over = false;
                    } else {
                        Board_ship.PrintBoard();
                        Player2_turn_over = true;
                    }
                }
                
                
                if (Board_ship.CheckBoard() == true){
                    System.out.println("YOU WON!");
                    GameOver = true;
                }  

            }//whileloop

        }//try catch

    }//public class

}//main class


