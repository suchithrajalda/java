class Asciival
{
	public static void main(String args[])
	{
		char c ='1';
		System.out.println("Ascii values");
		if(c>=65 && c<=90)
		{
			System.out.println("uppercase letters");
		}
		else if(c>=97 && c<=122)
		{
			System.out.println("lowercase letters");
		}
		else if(c>=48 && c<=56)
		{
			System.out.println("digits");
		}
		else
		{
			System.out.println("special symbols");
		}
		
	}
}