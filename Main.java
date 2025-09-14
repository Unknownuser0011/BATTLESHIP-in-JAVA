
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        
        Player Player1 = new Player();
        Player Player2 = new Player();
        AI AI_Player = new AI();
        
      
        //Scanner security or something 
        try (Scanner Getinput = new Scanner(System.in)) {
           
            //max ships and ship count 
            int Ship_Count = 0;
            int Max_ships = 5;
            
            Player1.Name = "and";
            Player2.Name = "rew";

            Player1.OP_Name = Player2.Name;
            Player2.OP_Name = Player1.Name;
            //placing ships 
            Player1.PLACING_PLAYER_SHIPS(Ship_Count, Max_ships, Getinput);
            Player2.PLACING_PLAYER_SHIPS(Ship_Count, Max_ships, Getinput);
       
            Boolean GameOver = false;

            //Game start PLayer vs Player 
            while(!GameOver){
                //Player 1 turn
                Player2.PLAYER_TURN(Getinput);
                //Player 2 turn 
                
                //checking board    
                if (Player1.Checking_the_board() == true){
                    System.out.println("Player " + Player1.Name + " lost ");
                    GameOver = true;
                } else if (Player2.Checking_the_board() == true){
                    System.out.println("Player " + Player2.Name + " lost ");
                    GameOver = true;
                }

           }//while loop

        }//try catch

    }//main class

}//class


