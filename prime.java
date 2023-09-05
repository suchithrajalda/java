class Prime
{
	public static void main(String args[])
	{
		int n=5,i,count=0;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not a prime");
		}
	}
}