class Grade
{
	public static void main(String args[])
	{
		int hardness=50;
		double carbon=0.7;
		int tensile=5600;
		if(hardness>50 && carbon<0.7 && tensile>5600)
		{
			System.out.println("Grade 10");
		}
		else if(hardness>50 && carbon<0.7 && tensile!=5600)
		{
			System.out.println("Grade 9");
		}
		else if(hardness!=50 && carbon<0.7 && tensile>5600)
		{
			System.out.println("Grade 8");
		}
		else if(hardness>50 && carbon!=0.7 && tensile>5600)
		{
			System.out.println("Grade 7");
		}
		else if(hardness>50 && carbon!=0.7 && tensile!=5600)
		{
			System.out.println("Grade 6");
		}
		else
		{
			System.out.println("Grade 5");
		}
	}
}