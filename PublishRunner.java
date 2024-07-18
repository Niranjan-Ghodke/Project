class PublishRunner
{
	public static void main(String [] args)
	{
		System.out.println("=========COUNTRY==========");
		int countryCode1=84;
		String countryName1=Publish.country(countryCode1);
		System.out.println("Country name is : " + countryName1);
		
		int countryCode2=25;
		String countryName2=Publish.country(countryCode2);
		System.out.println("Country name is : " + countryName2);
		
		int countryCode3=46;
		String countryName3=Publish.country(countryCode3);
		System.out.println("Country name is : " + countryName3);
		
		int countryCode4=55;
		String countryName4=Publish.country(countryCode4);
		System.out.println("Country name is : " + countryName4);
		
		int countryCode5=34;
		String countryName5=Publish.country(countryCode5);
		System.out.println("Country name is : " + countryName5);
		
		int countryCode6=0;
		String countryName6=Publish.country(countryCode6);
		System.out.println("Country name is : " + countryName6);
		
		
		System.out.println("=========ITEM==========");
		String itemName1="Biryani";
		String itemPrice1=Publish.price(itemName1);
		System.out.println("item name is : " + itemPrice1);
		
		String itemName2="Maggi";
		String itemPrice2=Publish.price(itemName2);
		System.out.println("item name is : " + itemPrice2);
		
		String itemName3="Chicken Biryani";
		String itemPrice3=Publish.price(itemName3);
		System.out.println("item name is : " + itemPrice3);
		
		String itemName4="Masal Dosa";
		String itemPrice4=Publish.price(itemName4);
		System.out.println("item name is : " + itemPrice4);
		
		String itemName5="Idli vada";
		String itemPrice5=Publish.price(itemName5);
		System.out.println("item name is : " + itemPrice5);
		
		String itemName6=" ";
		String itemPrice6=Publish.price(itemName6);
		System.out.println("item name is : " + itemPrice6);
		
		
		System.out.println("=========MOVIES==========");
		String nameProducer1="Rajkumar Hirani";
		String movieName1=Publish.nameProducer(nameProducer1);
		System.out.println("Movie name is : " +movieName1);
		
		String nameProducer2="Raja mauli";
		String movieName2=Publish.nameProducer(nameProducer2);
		System.out.println("Movie name is : " +movieName2);
		
		String nameProducer3="Geeta";
		String movieName3=Publish.nameProducer(nameProducer3);
		System.out.println("Movie name is : " +movieName3);
		
		String nameProducer4="Rohit Shetty";
		String movieName4=Publish.nameProducer(nameProducer4);
		System.out.println("Movie name is : " +movieName4);
		
		String nameProducer5="Prashant Neel";
		String movieName5=Publish.nameProducer(nameProducer5);
		System.out.println("Movie name is : " +movieName5);
		
		String nameProducer6=" ";
		String movieName6=Publish.nameProducer(nameProducer6);
		System.out.println("Movie name is : " +movieName6);
		
		
		
	}
}