class Descending
{
	public static void main(String args[])
	{
	int a=20,b=30,c=10,temp;
	if (a<b)
	{
		temp=a;
		a=b;
		b=temp;
	}
	if (a<c)
	{
		temp=a;
		a=c;
		c=temp;
	}
	if (b<c)
	{
		temp=b;
		b=c;
		c=temp;
	}
	System.out.println(a+"   "+b+"   "+c);
	}
}