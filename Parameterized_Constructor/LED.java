class LED {
    String type;
    String size; // Size in inches, e.g., "32 inch"
    double price; // Price in dollars

    LED(String ledType, String ledSize, double ledPrice) {
        System.out.println("*****LED ITEM*****");
        type = ledType;
        size = ledSize;
        price = ledPrice;
    }
}
