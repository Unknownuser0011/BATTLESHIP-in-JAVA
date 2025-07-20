
import java.util.Scanner; 

class Player {

    
    public int Player_Turn_Row(Scanner Getinput){
         System.out.print("Enter a number(ROW) from [0/6]: " );
         return Getinput.nextInt();
    }

    public int Player_Turn_Column(Scanner Getinput){
         System.out.print("Enter a number(COLUMN) from [0/6]: " );
         return Getinput.nextInt();
    }

}
