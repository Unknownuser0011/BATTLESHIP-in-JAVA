import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board gameBoard = new Board();
        Player player1 = new Player("Player One", scanner);
        Player player2 = new Player("Player Two", scanner);

        System.out.println("WELCOME TO BATTLESHIP!");
        gameBoard.showBoard();

        boolean gameover = false;

        System.out.println("Enter player one alias: ");
        player1.name.scanner.nextline();
        System.out.println("Enter player two alias: ");
        player2.name.scanner.nextline();


        while (!gameover){

            System.out.println("\n" + player1.name + "'s Turn:");
            player1.getPlayerTurn();

            System.out.println("\n" + player2.name + "'s Turn:");
            player2.getPlayerTurn();

        }



           
        

        scanner.close();
    }
}