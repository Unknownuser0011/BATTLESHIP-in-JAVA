
class Board {
    
int[][] Place_Board = {
    {0, 1, 1, 1, 0, 0}, // row 0 column 5
    {1, 0, 0, 0, 0, 0}, // row 1 coloumn 5
    {1, 0, 0, 1, 0, 0}  // row 2 coloumn 5
};

//column in VERTICAL
//row is Horizontal

//Place_Board[row][column]

    //checking if player place input hit or miss a ship
    void CheckTurn(int input_row, int input_column){
        if (Place_Board[input_row][input_column] != 0){
            System.out.println("HIT");
            Place_Board[input_row][input_column] = 0;
        } else {
            System.out.println("MISS");
        }
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

        if(ShipRemaining == 0){
            return true;
        }
        return false;
    }

}//classBoard
    