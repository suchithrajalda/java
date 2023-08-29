class Ascii
{
	public static void main(String args[])
	{
		char c='b';
		int b=(int)c;
		int p=b-32;
		int f=b+32;
		System.out.println((b>=97 && b<=122)?"ascii  "+(char)p:(b>=65 &&  b<=90)?"ascii   "+(char)f:"not");
	}
	
}a