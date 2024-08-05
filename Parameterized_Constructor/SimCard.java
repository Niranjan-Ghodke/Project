class SimCard {
    String provider;
    String dataPlan; 
    double price; 

    SimCard(String simProvider, String simDataPlan, double simPrice) {
        System.out.println("*****SIM CARD ITEM*****");
        provider = simProvider;
        dataPlan = simDataPlan;
        price = simPrice;
    }
}

