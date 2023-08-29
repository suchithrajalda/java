class While5
{
	public static void main(String args[])
	{
		int n=1,sum=0,mul=1;
		while(n<=50)
		{
			if(n%2==0)
			{
				sum=sum+n;
			}
			else
			{
				mul=mul*n;
			}
			System.out.println(sum);
			System.out.println(mul);
			n++;
		}
	}
}