class Ageperson
{
	public static void main(String args[])
	{
		int age=81;
		if(age<18)
		{
			System.out.println("minor age is:"+age);
		}
		else
		{
			if(age>50)
			{
				System.out.println("senior citizen");
			}
			else
			{
				System.out.println("major");
			}
		}
	}
	
}