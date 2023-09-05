class Primewhile
{
	public static void main(String args[])
	{
		int i=1,n=6,count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("composite number");
		}
	}
}