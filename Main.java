
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    
        Player Player1 = new Player();
        Player Player2 = new Player();
        Player AI_Player = new Player();

        //Scanner security or something 
        try (Scanner Getinput = new Scanner(System.in)) {
           
            //max ships and ship count 
            int Ship_Count = 0;
            int Max_ships = 5;
            
            Boolean GameOver = false;

            int Game_Mode;
            
            System.out.println("==BATTLESHIP==");
            System.out.println("1. Player vs Player");
            System.out.println("2. Player vs Computer");
            System.out.println("3. Exit");

            Game_Mode = Getinput.nextInt();

            switch(Game_Mode){
            
                //PVP
                case 1:
                    //placing ships
                    
                    System.out.println("==Place your ship Player 1==\nEnter your coordinates [x][y]");
                    Player1.PLACING_PLAYER_SHIPS(Ship_Count, Max_ships, Getinput, false);
                    
                    System.out.println("==Place your ship Player 2==\nEnter your coordinates [x][y]");
                    Player2.PLACING_PLAYER_SHIPS(Ship_Count, Max_ships, Getinput, false);

                    while(!GameOver){
                   
                    //Player 1 turn
                    System.out.println("==Player 1 Turn!==\nEnter your coodinates[x][y]");
                    Player2.PLAYER_TURN(Getinput, false);  

                    //checking board    
                    if (Player1.Checking_the_board() == true){
                        System.out.println("Player 1 lost ");
                        GameOver = true;
                    } else if (Player2.Checking_the_board() == true){
                        System.out.println("Player 2 lost ");
                        GameOver = true;
                    }

                    //Player 2 turn 
                    System.out.println("==Player 2 Turn!==\nEnter your coodinates[x][y]");
                    Player1.PLAYER_TURN(Getinput, false);
                    
                    if (Player1.Checking_the_board() == true){
                        System.out.println("Player 1 lost ");
                        GameOver = true;
                    } else if (Player2.Checking_the_board() == true){
                        System.out.println("Player 2 lost ");
                        GameOver = true;
                    }

                }
                break;

                //Player vs AI
                case 2:
                    //placing ships
                    System.out.println("==Place your ship Player 1==\nEnter your coordinates [x][y]");
                    Player1.PLACING_PLAYER_SHIPS(Ship_Count, Max_ships, Getinput, false);

                    System.out.println("AI_Turn");
                    AI_Player.PLACING_PLAYER_SHIPS(Ship_Count, Max_ships, Getinput, true);

                    while(!GameOver){
                    //Player 1 turn
                    System.out.println("==Player 1 Turn!==\nEnter your coodinates[x][y]");
                    AI_Player.PLAYER_TURN(Getinput, false);  

                    if (Player1.Checking_the_board() == true){
                        System.out.println("Player lost");
                        GameOver = true;
                    } else if (AI_Player.Checking_the_board() == true){
                        System.out.println("AI lost ");
                        GameOver = true;
                    }
                    //Player 2 turn 
                    System.out.println("AI_Turn");
                    Player1.PLAYER_TURN(Getinput, true);

                    if (Player1.Checking_the_board() == true){
                        System.out.println("Player lost");
                        GameOver = true;
                    } else if (AI_Player.Checking_the_board() == true){
                        System.out.println("AI lost ");
                        GameOver = true;
                    }   
                    }
                break;
                case 3: 
                System.out.println("exiting...");
                break;

            }//switch
            
        }//try catch

    }//main class

}//class


