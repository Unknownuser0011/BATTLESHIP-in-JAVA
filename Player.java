
import java.util.Scanner; 


class Player {
    Board Board_ship = new Board();

    String Name;
    //oponent name 
    String OP_Name;
    public int Player_Turn_Row(Scanner Getinput) {
        System.out.print("Enter a number(ROW) from [0/6]: ");
        return Getinput.nextInt();
    }

    public int Player_Turn_Column(Scanner Getinput) {
        System.out.print("Enter a number(COLUMN) from [0/6]: ");
        return Getinput.nextInt();
    }

    void PLACING_PLAYER_SHIPS(int shipCount, int maxShips, Scanner Getinput) {
        while (shipCount < maxShips) {
            System.out.println("Place your ship Player " + Name);
            int input_row = Player_Turn_Row(Getinput);
            int input_column = Player_Turn_Column(Getinput);

            if (Board_ship.Place_Ships(input_row, input_column)) {
                shipCount++;
                Board_ship.PrintBoard(1);
                System.out.println("Ships placed: " + shipCount + "/" + maxShips);
            }
        }
    }


    void PLAYER_TURN(Scanner Getinput){
     
     boolean Player_turn_over = false;
     while(!Player_turn_over){
                    System.out.println("++=PLAYER " + OP_Name + " TURN=++");
                    int input_row = Player_Turn_Row(Getinput);
                    int input_column = Player_Turn_Column(Getinput);
                    
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
