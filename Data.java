class Data
{
	public static void medInfo(String name, String manfDate, float price,int quantity)
	{
		System.out.println("=====MEDICINE INFORMATION=====");
		System.out.println("Name of medicine : "+name);
		System.out.println("Date of manufacture : "+manfDate);
		System.out.println("Price of medicine : "+price+"rs");
		System.out.println("Quantity : "+quantity);
	}
	public static void juiceInfo(String name, String brand, String flavour, float price,int quantity)
	{
		System.out.println("=====JUICE INFORMATION=====");
		System.out.println("Name of Juice : "+name);
		System.out.println("Brand of Juice : "+brand);
		System.out.println("Flavour of the Juice : "+flavour);
		System.out.println("Price of Juice : "+price);
		System.out.println("Quantity : "+quantity+" litre");
		
	}
}