class Operation
{
	public static void main(String args[])
	{
	int a=30,b=20,c=10,temp;
	if (a>b)
	{
		temp =a;//30
		a=b;//20
		b=temp;//30 a=20,b=30
	}
	if(a>c)
	{
		temp=a;//a=20
		a=c;//c=10
		c=temp;//c=20,a=10,b=30,c=20
	}
	if(b>c)
	{
		temp=b;//30
		b=c;//c=30
		c=temp;//c=30,a=10,b=20,c=30
	
	}	
	System.out.println(a+"  "+b+" "+c);		
	}
}