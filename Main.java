
import java.util.Scanner;



public class Main {

    public static void main(String[] args){

        Board Board_ship = new Board();
        Scanner Getinput = new Scanner(System.in);

        boolean GameOver = false;
        int input = 0;

        while(!GameOver){
            System.out.print("Enter a number: ");
            input = Getinput.nextInt();
            Board_ship.checkboard(input);
        }

    }
}

