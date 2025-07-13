class Player {
    String name;
    Scanner input;

    public Player(String name, Scanner scanner) {
        this.name = name;
        this.input = scanner;
    }

    public int getPlayerTurn() {
        System.out.print("Enter row (0-4): ");
        int row = input.nextInt();

        System.out.print("Enter column (0-4): ");
        int col = input.nextInt();

        System.out.println(name + " selected row " + row + " and column " + col);
        // You could return the coordinates or store them, depending on your design
    }
}