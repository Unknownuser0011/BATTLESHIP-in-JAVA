


class Board {
    
int[][] Place_Board = {
    {0, 0, 0, 0, 0, 0, 0}, // row 0 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 1 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 2 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 3 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 4 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 5 coloumn 6
    {0, 0, 0, 0, 0, 0, 0}, // row 6 coloumn 6     
};

//PLAYER 1 is 1
//PLAYER 2 is 2

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
        Place_Board[input_row][input_column] = 1;  // ← fixed the indexing bug
        System.out.println("SHIP successfully placed");
        Print_Place_Board();
        return true;
    } else {
        System.out.println("There is already a ship in this location");
        return false;
    }

    }

            

    //checking if player place input hit or miss a ship
    boolean CheckTurn_Player(int input_row, int input_column){
        boolean CheckifHit = false;

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

                if (Place_Board[row][column] == 2){
                    System.out.print("| X ");
                } else {
                    System.out.print("|   ");
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

    void Print_Place_Board(){
        System.out.println();

         for (int row = 0; row < Place_Board.length; row++) {
            // Print the horizontal line
            for (int coloumn = 0; coloumn < Place_Board[row].length; coloumn++) {
                System.out.print("+---");
            }
            System.out.println("+");

            // Print the vertical lines
            for (int column = 0; column < Place_Board[row].length; column++) {

                if (Place_Board[row][column] == 1){
                    System.out.print("| X ");
                } else {
                    System.out.print("|   ");
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
    