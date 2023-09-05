class Perfectnum
{
	public static void main(String args[])
	{
		int i=1,n=8,sum=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not perfect");
		}
	}
}
