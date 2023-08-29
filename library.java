class Library 
{
	public static void main(String args[])
	{
	int days=8;
	if(days>=1 && days<=5)
	{
		System.out.println("fine is 50 paise");
	}
	else if(days>=6 && days<=10)
	{
		System.out.println("fine is 1 rupees");
	}
	else if(days>10 && days<49)
	{
		System.out.println("fine is 5 rupees");
	}
	else
	{
		System.out.println("membership will be cancelled");
	}
	}
}