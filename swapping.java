class Swapping
{
	public static void main(String args[])
	{
		int x=10,y=2;
		if(x%y==0)
		{
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println(x+""+y);
		}
	}
}