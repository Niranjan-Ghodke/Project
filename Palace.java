class Palace
{
	public static void main(String[] palace)
	{
		if (palace.length==4)
		{
			String name=palace[0];
			String location=palace[1];
			String builtBy=palace[2];
			String year=palace[3];
			for(String i :palace)
			{
				System.out.println(i);
			}
		}
		else
			{
				System.out.println("Enter four reference name");
				
			}
		}
	}
