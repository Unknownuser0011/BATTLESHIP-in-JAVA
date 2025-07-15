
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Board Board_ship = new Board();
        Scanner Getinput = new Scanner(System.in);

        boolean GameOver = false;
        int input_row = 0;
        int input_column = 0;


        while(!GameOver){
            System.out.print("Enter a number(ROW) from [0/2]: " );
            input_row = Getinput.nextInt();
            
            System.out.print("Enter a number(COLUMN) from [0/5]: " );
            input_column = Getinput.nextInt();

            Board_ship.CheckTurn(input_row, input_column);
            Board_ship.PrintBoard();

            if (Board_ship.CheckBoard() == true){
                System.out.println("YOU WON!");
                GameOver = true;
            }
        }

        Getinput.close();
    }
}


