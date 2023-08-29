class Typecase
{
	public static void main(String args[])
	{
		char c='A';
		int s=(char)(c);
		System.out.println(s);
		if (s>=96 && s<=122)
		{
				int d=s-32;
				System.out.println((char)(d));
		}
		else
		{
			if(s>=65 && s<=90)
			{
					int d=s+32;
			                System.out.println((char)(d));
			}
			
		}
		
	}
}

