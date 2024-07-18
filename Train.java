class Train
{
	public static void book(String source,String destination)
	{
		System.out.println("Source: "+source + "Destination : "+destination);
	
	}
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("Source: "+source + ", Destination : "+destination+ ", Quantity :" +quantity );
	
	}
	public static void book(String source,String destination,int quantity,double price)
	{
		System.out.println("Source: "+source + ", Destination : "+destination+ ", Quantity :" +quantity+ ", Price :"+price );
	
	}
	public static void cancel(int ticketNo)
	{
		System.out.println("Ticket Number "+ticketNo);
	
	}
	public static void cancel(String source,String destination)
	{
		System.out.println("Cancel Train from");
		System.out.println("Source: "+source + " Destination : "+destination);
		
	
	}
}