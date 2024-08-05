class Board {
    String type;
    String size; 
    double price;

    Board(String boardType, String boardSize, double boardPrice) {
        System.out.println("*****BOARD ITEM*****");
        type = boardType;
        size = boardSize;
        price = boardPrice;
    }
}

