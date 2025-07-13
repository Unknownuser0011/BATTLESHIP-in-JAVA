class Board {
    private char[][] board;

    public Board() {
        board = new char[5][5];
        // Initialize board with water '~'
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                board[i][j] = '~';
    }

    public void showBoard() {
        System.out.println("_______________________");
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print("|" + board[x][y] + "|");
            }
            System.out.println();
        }
        System.out.println("_______________________");
    }
}