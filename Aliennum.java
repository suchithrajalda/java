class technum
{
	public static void main(String args[])
	{
		int n=2025,count=0,rem=0;
		for(;n!=0;n/=10)
		{
			count++;
			rem=n%10;
		}
		System.out.println(count);
		
		
	}
}






