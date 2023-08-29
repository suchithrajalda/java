class Insurance
{
	public static void main(String args[])
	{
	int age=26;
	double premium;
	String gender="male";
	String lives="city";
	String person="excellent";
	if(age>=25 && age<=35 && gender=="male" && lives=="city" && person=="excellent")
	{
		premium=4/1000.0*200000;
		System.out.println("perimum is:"+premium);	
	}
	else if(age>=25 && age<=35 && gender=="female" &&  lives=="city" &&   person=="excellent")
	{
		premium=3/1000.0*200000;
		System.out.println("perimum is:"+premium);	
	}
	else if(age>=25 && age<=35  &&  gender=="male"  &&  lives=="city"  &&  person=="poor")
	{
		premium=6/1000.0*200000;
		System.out.println("perimum is:"+premium);	
	}
	else
	{
		System.out.println("person is not insured");
	}
		
	}
}