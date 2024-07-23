class Person
{
	public static void main(String[] person)
	{
		if (person.length==4)
		{
			String name=person[0];
			String email=person[1];
			String age=person[2];
			String password=person[3];
			for(String i :person)
			{
				System.out.println(i);
			}
		}
		else
			{
				System.out.println("Enter four reference name" );
			}
		}
	}
			
