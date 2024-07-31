class BoardRunner {
    public static void main(String[] args) {
        Board board1 = new Board("Plywood", "4x8 ft", 50.0);
        System.out.println("Type of board: " + board1.type);
        System.out.println("Size of board: " + board1.size);
        System.out.println("Price of board: $" + board1.price);

        Board board2 = new Board("MDF", "3x6 ft", 30.0);
        System.out.println("Type of board: " + board2.type);
        System.out.println("Size of board: " + board2.size);
        System.out.println("Price of board: $" + board2.price);

        Board board3 = new Board("Particle Board", "4x4 ft", 25.0);
        System.out.println("Type of board: " + board3.type);
        System.out.println("Size of board: " + board3.size);
        System.out.println("Price of board: $" + board3.price);

        Board board4 = new Board("OSB", "4x8 ft", 40.0);
        System.out.println("Type of board: " + board4.type);
        System.out.println("Size of board: " + board4.size);
        System.out.println("Price of board: $" + board4.price);

        Board board5 = new Board("Hardwood Plywood", "4x8 ft", 70.0);
        System.out.println("Type of board: " + board5.type);
        System.out.println("Size of board: " + board5.size);
        System.out.println("Price of board: $" + board5.price);

        Board board6 = new Board("Veneer Core Plywood", "5x5 ft", 90.0);
        System.out.println("Type of board: " + board6.type);
        System.out.println("Size of board: " + board6.size);
        System.out.println("Price of board: $" + board6.price);

        Board board7 = new Board("Bamboo Board", "4x8 ft", 55.0);
        System.out.println("Type of board: " + board7.type);
        System.out.println("Size of board: " + board7.size);
        System.out.println("Price of board: $" + board7.price);

        Board board8 = new Board("Cork Board", "2x3 ft", 20.0);
        System.out.println("Type of board: " + board8.type);
        System.out.println("Size of board: " + board8.size);
        System.out.println("Price of board: $" + board8.price);

        Board board9 = new Board("Plastic Board", "4x8 ft", 45.0);
        System.out.println("Type of board: " + board9.type);
        System.out.println("Size of board: " + board9.size);
        System.out.println("Price of board: $" + board9.price);

        Board board10 = new Board("Medium Density Fiberboard", "4x6 ft", 35.0);
        System.out.println("Type of board: " + board10.type);
        System.out.println("Size of board: " + board10.size);
        System.out.println("Price of board: $" + board10.price);

        Board board11 = new Board("Cedar Board", "4x8 ft", 60.0);
        System.out.println("Type of board: " + board11.type);
        System.out.println("Size of board: " + board11.size);
        System.out.println("Price of board: $" + board11.price);
    }
}