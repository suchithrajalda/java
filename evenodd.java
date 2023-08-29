class Evenodd
{
	public static void main(String args[])
	{
		int n=10;
		if(n>0)
		{
			if(n%2==0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
		}
		else
		{
			if(n<0)
			{
				System.out.println("negative");
			}
			else
			{
				System.out.println("zero");
			}
		}
			
	}
}