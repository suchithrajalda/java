class Swapxor
{
	public static void main(String args[])
	{
		int a=17,b=19;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
		
	}
}