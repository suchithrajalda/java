class Leap
{
	public static void main(String args[])
	{
	 	int year=2017;
		if((year%400==0) || (year%4==0) && (year%100!=0))
		{
		System.out.println("leap year");
		}
		else
		{
		System.out.println("not a leap year");
		}
	}
}