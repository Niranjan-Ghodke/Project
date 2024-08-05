class SimCardRunner {
    public static void main(String[] args) {
        SimCard sim1 = new SimCard("Provider A", "5GB Data", 30.0);
        System.out.println("Provider: " + sim1.provider);
        System.out.println("Data Plan: " + sim1.dataPlan);
        System.out.println("Price: " + sim1.price);

        SimCard sim2 = new SimCard("Provider B", "10GB Data", 40.0);
        System.out.println("Provider: " + sim2.provider);
        System.out.println("Data Plan: " + sim2.dataPlan);
        System.out.println("Price: " + sim2.price);

        SimCard sim3 = new SimCard("Provider C", "Unlimited Data", 50.0);
        System.out.println("Provider: " + sim3.provider);
        System.out.println("Data Plan: " + sim3.dataPlan);
        System.out.println("Price: " + sim3.price);

        SimCard sim4 = new SimCard("Provider D", "2GB Data", 20.0);
        System.out.println("Provider: " + sim4.provider);
        System.out.println("Data Plan: " + sim4.dataPlan);
        System.out.println("Price: " + sim4.price);

        SimCard sim5 = new SimCard("Provider E", "15GB Data", 45.0);
        System.out.println("Provider: " + sim5.provider);
        System.out.println("Data Plan: " + sim5.dataPlan);
        System.out.println("Price: " + sim5.price);

        SimCard sim6 = new SimCard("Provider F", "Unlimited Data + Calls", 60.0);
        System.out.println("Provider: " + sim6.provider);
        System.out.println("Data Plan: " + sim6.dataPlan);
        System.out.println("Price: " + sim6.price);

        SimCard sim7 = new SimCard("Provider G", "3GB Data", 25.0);
        System.out.println("Provider: " + sim7.provider);
        System.out.println("Data Plan: " + sim7.dataPlan);
        System.out.println("Price: " + sim7.price);

        SimCard sim8 = new SimCard("Provider H", "7GB Data", 35.0);
        System.out.println("Provider: " + sim8.provider);
        System.out.println("Data Plan: " + sim8.dataPlan);
        System.out.println("Price: " + sim8.price);

        SimCard sim9 = new SimCard("Provider I", "Unlimited Data", 55.0);
        System.out.println("Provider: " + sim9.provider);
        System.out.println("Data Plan: " + sim9.dataPlan);
        System.out.println("Price: " + sim9.price);

        SimCard sim10 = new SimCard("Provider J", "5GB Data + 500 Calls", 33.0);
        System.out.println("Provider: " + sim10.provider);
        System.out.println("Data Plan: " + sim10.dataPlan);
        System.out.println("Price: " + sim10.price);

        SimCard sim11 = new SimCard("Provider K", "Unlimited Data + 1000 Calls", 70.0);
        System.out.println("Provider: " + sim11.provider);
        System.out.println("Data Plan: " + sim11.dataPlan);
        System.out.println("Price: " + sim11.price);
    }
}