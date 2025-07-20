
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Board Board_ship1 = new Board();
        Board Board_ship2 = new Board();
        Player Player1 = new Player();
        Player Player2 = new Player();
           
        try (Scanner Getinput = new Scanner(System.in)) {
            int input_row = 0;
            int input_column = 0;
            

            int shipCount = 0;
            int maxShips = 5;
            
        //player 1 turn 
        while (shipCount < maxShips) {
            System.out.println("Place your ship Player 1");
            input_row = Player1.Player_Turn_Row(Getinput);
            input_column = Player1.Player_Turn_Column(Getinput);
    
            if (Board_ship1.Place_Ships(input_row, input_column)) {
            shipCount++;
            Board_ship1.PrintBoard(1);
            System.out.println("Ships placed: " + shipCount + "/" + maxShips);
            }
        }
            //Reset
             shipCount = 0;
             maxShips = 5;
        //player 2 turn 
        while (shipCount < maxShips) {
            System.out.println("Place your ship Player 2");
            input_row = Player2.Player_Turn_Row(Getinput);
            input_column = Player2.Player_Turn_Column(Getinput);
    
            if (Board_ship2.Place_Ships(input_row, input_column)) {
            shipCount++;
            Board_ship2.PrintBoard(1);
            System.out.println("Ships placed: " + shipCount + "/" + maxShips);
            }
        }

            boolean GameOver = false;
            //Game Start
            System.err.println("\nGAME START\n");
            while(!GameOver){
                input_row = 0;
                input_column = 0;
                
                boolean Player1_turn_over = false;
                boolean Player2_turn_over = false;
                //player 1 turn 
                while(!Player1_turn_over){
                    System.out.println("++=PLAYER 1 TURN=++");
                    input_row = Player1.Player_Turn_Row(Getinput);
                    input_column = Player1.Player_Turn_Column(Getinput);
                    
                    if (Board_ship2.CheckTurn_Player(input_row, input_column) == true){
                        Board_ship2.PrintBoard(0);
                        Player1_turn_over = false;
                    } else {
                        Board_ship1.PrintBoard(0);
                        Player1_turn_over = true;
                    }
                }
                //Player 2 turn 
                while(!Player2_turn_over){
                    System.out.println("++=PLAYER 2 TURN=++");
                    input_row = Player2.Player_Turn_Row(Getinput);
                    input_column = Player2.Player_Turn_Column(Getinput);
                    
                    if (Board_ship1.CheckTurn_Player(input_row, input_column) == true){
                        Board_ship1.PrintBoard(0);
                        Player2_turn_over = false;
                    } else {
                        Board_ship2.PrintBoard(0);
                        Player2_turn_over = true;
                    }
                }
                
                // checking 
                if (Board_ship1.CheckBoard() == true) {
                System.out.println("PLAYER 2 WON");
                GameOver = true;
                } else if (Board_ship2.CheckBoard() == true) {
                System.out.println("PLAYER 1 WON");
                GameOver = true;
                }


            }//whileloop

        }//try catch

    }//main class

}//class


