
class Board {
    
    int[] Place_Board = {0, 1, 1, 1, 0, 0};

    //checking if player place input hit or miss a ship
    void CheckTurn(int input){
        if (Place_Board[input] != 0){
            System.out.println("HIT");
            Place_Board[input] = 0;
        } else {
            System.out.println("MISS");
        }
    }

    boolean CheckBoard(){
        //checking if there is a ship on the board
        for (int i = 0; i <= 6; i++){
            if (Place_Board[i] == 1){
                return true;     
            } else {
                return false;
            }
        }
    }

}//classBoard
    