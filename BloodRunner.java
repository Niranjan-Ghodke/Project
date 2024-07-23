class BloodRunner
{
	public static void main (String[] args)
	{
		System.out.println("Running main method in BloodRunner");
		Blood.group("AB+");
		Blood.personName("Rahul");
		Blood.cost(100);
		Blood.hospitalTested(true);
		Blood.sickness("No");
		Blood.donate(true);
	}
}