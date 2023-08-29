class Switchvowel
{
	public static void main(String args[])
	{
		char c='s';
		switch(c)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':System.out.println("vowels");
							break;
			default:System.out.println("consonants");
				    break;
						
		}
	}
}