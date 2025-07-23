


class Board {
    
public int[][] Place_Board = {
    {0, 0, 0, 0, 0, 0, 0}, // row 0 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 1 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 2 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 3 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 4 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 5 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 6 coloumn 6     
};

//column is VERTICAL
//row is Horizontal
// So Place_Board[row][column]



    boolean Place_Ships(int input_row, int input_column) {
        System.out.println("PLACE YOUR SHIP!");

    if (input_row < 0 || input_row >= Place_Board.length || 
        input_column < 0 || input_column >= Place_Board[0].length) {
        System.out.println("Invalid coordinates. Try again.");
        return false;
    }
    
    if (Place_Board[input_row][input_column] == 0) {
        Place_Board[input_row][input_column] = 1;
        System.out.println("SHIP successfully placed");
        return true;
    } else {
        System.out.println("There is already a ship in this location");
        return false;
    }

    }

    //checking if player place input hit or miss a ship
    boolean CheckTurn_Player(int input_row, int input_column){
        boolean CheckifHit = false;

    if (input_row < 0 || input_row >= Place_Board.length || 
        input_column < 0 || input_column >= Place_Board[0].length) {
        System.out.println("Invalid coordinates. Try again.");
        //true because its not HIT
        return true;
    }

    if (Place_Board[input_row][input_column] == 1){
            System.out.println("HIT");
            Place_Board[input_row][input_column] = 2;
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
                 if (Place_Board[i][y] == 1){
                    ShipRemaining++;  
                } 
            }
        }
        //returns true if all ships remaining are true 
        return ShipRemaining == 0;
    }

    //Priting the board and the location of the sunk ships
    void PrintBoard(int Placingstage){
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
                    case 1:
                    //the ships are hidden when its not in the Placing stage
                        if(Placingstage == 1){
                            System.out.print("| O ");
                        }else {
                            System.out.print("|   ");
                        }
                        break;
                    case 2: 
                        System.out.print("| X ");
                        break;
                    default:
                        System.err.print("|   ");
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
    