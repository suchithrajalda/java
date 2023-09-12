class Evilnumber
{
	public static void main(String args[])
	{
		int n=9,rem;
		int p=n*n;
		for(;p!=0;p/=10)
		{
			rem=p%10;
		}
		System.out.println(rem);

	}
}

