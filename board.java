
class Board {
    
int[][] Place_Board = {
    {0, 1, 1, 1, 0, 0, 0}, // row 0 coloumn 6
    {1, 0, 0, 0, 0, 0, 0}, // row 1 coloumn 6
    {1, 0, 0, 1, 0, 0, 0}, // row 2 coloumn 6
    {0, 1, 0, 0, 0, 0, 0}, // row 3 coloumn 6
    {0, 1, 0, 1, 1, 1, 0}, // row 4 coloumn 6
    {0, 1, 0, 0, 0, 0, 0}, // row 5 coloumn 6
    {0, 1, 0, 0, 0, 0, 0}, // row 6 coloumn 6     
};


//PLAYER 1 is 1
//PLAYER 2 is 2
//HITTED SHIPS FOR PLAYER 1 is 3
//HITTED SHIPS FOR PLAYER 2 is 4


//column is VERTICAL
//row is Horizontal
// So Place_Board[row][column]

    //checking if player place input hit or miss a ship
    boolean CheckTurn_Player1(int input_row, int input_column){
        boolean CheckifHit = false;

        if (Place_Board[input_row][input_column] != 0){
            System.out.println("HIT");
            //4 is when player 1 hiited a ship from player 2
            Place_Board[input_row][input_column] = 4;
            CheckifHit = true;
        } else{
            System.out.println("MISS");
            CheckifHit = false;
        }        
        return CheckifHit;
    }

    boolean CheckTurn_Player2(int input_row, int input_column){
        boolean CheckifHit = false;

        if (Place_Board[input_row][input_column] != 0){
            System.out.println("HIT");
            //3 is when player 1 hiited a ship from player 2
            Place_Board[input_row][input_column] = 3;
            CheckifHit = true;
        } else{
            System.out.println("MISS");
            CheckifHit = false;
        }        
        return CheckifHit;
    }
    
    boolean CheckBoard(){
        //checking if there is a ship on the board
        int ShipRemaining = 0;
        for (int i = 0; i < Place_Board.length; i++){
            for (int y = 0; y < Place_Board[i].length; y++){
                 if (Place_Board[i][y] == 1 || Place_Board[i][y] == 2){
                    ShipRemaining++;  
                } 
            }
        }
        //returns true if all ships remaining are true 
        return ShipRemaining == 0;
    }

    //Priting the board and the location of the sunk ships
    void PrintBoard(){
        System.out.println();

         for (int row = 0; row < Place_Board.length; row++) {
            // Print the horizontal line
            for (int coloumn = 0; coloumn < Place_Board[row].length; coloumn++) {
                System.out.print("+---");
            }
            System.out.println("+");

            // Print the vertical lines
            for (int column = 0; column < Place_Board[row].length; column++) {
        
                switch (Place_Board[row][column]) {
                    case 3:
                        System.out.print("| X ");
                        break;
                    case 4:
                        System.out.print("| Y ");
                        break;
                    default:
                        System.out.print("|   ");
                        break;
                }
            }
            System.out.println("|");
        }

        // Print the bottom border
        for (int j = 0; j < Place_Board[0].length; j++) {
            System.out.print("+---");
        }
        System.out.println("+");

        System.out.println();
    }

}//classBoard
    