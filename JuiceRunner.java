class JuiceRunner
{
	public static void main(String[] args)
	{
	 if (args.length==5)
			{
				String name=args[0];
				String brand=args[1];
				String flavour=args[2];
				String price=args[3];
				String quantity=args[4];
				float convertedPrice=Float.parseFloat(price);
				int convertedQuantity=Integer.parseInt(quantity);
				Data.juiceInfo(name,brand,flavour,convertedPrice,convertedQuantity);
			}
		else 
			{
				System.out.println("Enter five arguments");
			}
	}
}