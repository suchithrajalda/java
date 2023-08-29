class Charoperator
{
	public static void main(String args[])
	{
	int a=20,b=30;
	char operator='+';
	if(operator=='+')
	{
		System.out.println("addition is:"+(a+b));
	}
	operator='-';
	if(operator=='-')
	{
		System.out.println("substraction is:"+(a-b));
	}
	operator='*';
	if(operator=='*')
	{
		System.out.println("multiplication is :"+(a*b));
	}
	operator='/';
	if(operator=='/')
	{
		System.out.println("division is:"+((double)a/b));
	}
	}
}