class TrainRunner
{
	public static void main (String[] args)
	{
		System.out.println("Running a main method");
		Train.book("Hubli","Banglore");
		Train.book("Hubli","Banglore",5);
		Train.book("Hubli","Banglore",5,250.00);
		Train.cancel(25);
		Train.cancel("Hubli","Banglore");
		
		
	}
}