class Primebackward
{
	public static void main(String args[])
	{
		int n=11,start=15,end=2,count=0;
		while(start>=end)
		{
			if(n%start==0)
			{
				count++;
			}
			start--;	
		}
		if(count==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
}