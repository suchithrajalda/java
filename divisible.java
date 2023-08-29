class Divisible
{
	public static void main(String args[])
	{
		int n=12;
		if(n%3==0)
		{
			if(n%5==0)
			{
				System.out.println("fizz buzz");
			}
			else
			{
				System.out.println("fizz");
			}
		}
		else
		{
			if(n%3==0)
			{
				System.out.println("fizz");
			}
			else if(n%5==0)
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println("n:"+n);
			}
		}

	}
}