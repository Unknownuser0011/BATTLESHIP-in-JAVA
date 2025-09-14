
import java.util.Random;
import java.util.Scanner;

class Player {
    Board Board_ship = new Board();
    Random RNG = new Random();


    void PLACING_PLAYER_SHIPS(int shipCount, int maxShips, Scanner Getinput, Boolean AI_mode) {
        
        while (shipCount < maxShips) {

            int input_row = 0;
            int input_column = 0;

            if (AI_mode == false){
                input_row = Getinput.nextInt();
                input_column = Getinput.nextInt();
            } else {
                input_row = RNG.nextInt(7);
                input_column = RNG.nextInt(7);
            }
            
            if (Board_ship.Place_Ships(input_row, input_column)) {
                shipCount++;
                Board_ship.PrintBoard(1);
                System.out.println("Ships placed: " + shipCount + "/" + maxShips);
            }
        }
    }

    void PLAYER_TURN(Scanner Getinput, Boolean AI_mode){
     
    boolean Player_turn_over = false;
     
    while(!Player_turn_over){
        
        int input_row = 0;
        int input_column = 0;

                    if (AI_mode == false){
                        input_row = Getinput.nextInt();
                        input_column = Getinput.nextInt();
                    } else {
                        input_row = RNG.nextInt(7);
                        input_column = RNG.nextInt(7);
                    }

                    if (Board_ship.CheckTurn_Player(input_row, input_column) == true){
                        Board_ship.PrintBoard(0);
                        Player_turn_over = false;
                    } else {
                        Board_ship.PrintBoard(0);
                        Player_turn_over = true;
                    }
            }   
    }

    boolean Checking_the_board(){
        if (Board_ship.CheckBoard() == true){
            return true;
        }
        return false;
    } 

}
