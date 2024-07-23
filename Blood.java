class Blood
{
	public static String group( String group)
	{
		System.out.println("Blood group is "+group);
		return group;
	}
	public static String personName( String personName)
	{
		System.out.println("Person name is "+personName);
		return personName;
	}
	public static double cost( double cost)
	{
		System.out.println("Cost of blood is "+cost);
		return cost;
	}
	public static boolean hospitalTested (boolean hospitalTested )
	{
		System.out.println("Tested by hospital "+hospitalTested);
		return hospitalTested;
	}
	public static String sickness (String sickness )
	{
		System.out.println("Whether he/she is sick...? "+sickness);
		return sickness;
	}
	public static boolean donate (boolean donate )
	{
		if (donate)
		{
			System.out.println("Donate blood");
		}
		else 
		{
			System.out.println("Do not donate the blood");
		}
		return donate;
	}
	}
	
	

		