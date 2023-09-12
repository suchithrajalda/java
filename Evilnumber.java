class powernum
{
	public static void main(String args[])
	{
		n=132,sum=0,prod=1;
		for(;n!=0;n/=10)
		{
			rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
		}
		System.out.println(sum);
		System.out.println(prod);
	}
}



