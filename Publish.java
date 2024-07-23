class Publish
{
	public static String country (int code)
	{
		System.out.println("The code of the country is "+code);
		if(code==25)
		{
			return "India";
		}
		if(code==34)
		{
			return "New York";
		}
		if (code==55)
		{
			return "England";
		}
		if(code==46)
		{
			return "South Africa";
		}
		if(code==84)
		{
			return "New Zealand";
		}
		return ("Not found");
	}
		public static double price (String item)
	{
		System.out.println("The name of the item is "+item);
		if(item=="Biryani")
		{
			return 250.00;
		}
		if(item=="Masala Dosa")
		{
			return 200.00;
		}
		if (item=="Idli vada")
		{
			return 180.00;
		}
		if(item=="Maggi")
		{
			return 150.00;
		}
		if(item=="Chicken Biryani")
		{
			return 300.00;
		}
		return 0;

	}
	public static String nameProducer(String movie)
	{
		System.out.println("Producer name is"+movie);
		if(movie=="Bahubali")
		{
			return " Raja mauli";
		}
		if(movie=="KGF")
		{
			return "Prashant Neel";
		}
		if (movie=="3 Idiots")
		{
			return "Rajkumer Hirani";
		}
		if(movie=="Singham")
		{
			return "Rohit Shetty";
		}
		if(movie=="ABCD")
		{
			return "Geeta";
		}
		return ("Not found");
	}
}

