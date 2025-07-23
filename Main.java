
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        
        Player Player1 = new Player();
        Player Player2 = new Player();
        AI AI_Player = new AI();
        
        /*
         * System.out.println("========================================");
        System.out.println("WELCOME TO BATTLESHIP!");
        System.out.println("select mode\n 1. Player vs Player \n 2. Player vs AI \n 3. Exit");
        System.out.println("Enter your options: ");
         * 
         */
        

        try (Scanner Getinput = new Scanner(System.in)) {
           
            int shipCount = 0;
            int maxShips = 5;
            Player1.Name = "and";
            Player2.Name = "rew";

            //placing ships 
            Player1.PLACING_PLAYER_SHIPS(shipCount, maxShips, Getinput);
            Player2.PLACING_PLAYER_SHIPS(shipCount, maxShips, Getinput);
       
            Boolean GameOver = false;
            while(!GameOver){
                Player1.PLAYER_TURN(Getinput);
                Player2.PLAYER_TURN(Getinput);
                if (Player1.Checking_the_board() == true){
                    System.out.println("Player 1 lost ");
                } else if (Player2.Checking_the_board() == true){
                    System.out.println("Player 2 lost ");
                }

           }//while loop

        }//try catch

    }//main class

}//class


