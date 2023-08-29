class Student
{
	public static void main(String args[])
	{
		String name="Raju",grade;
		int rollname=332;
		char section='b';
		int fee=75000;
		int t=64,eng=81,hind=91,math=73,sci=81,soc=71;
		int maxmarks=600,scholorship,donation;
		double percentage=((t+eng+hind+math+sci+soc)/600.0)*100;
		System.out.println(percentage);
		if(percentage>80)
		{
			section='a';
			scholorship=10000;
			donation=0;
			grade="destinction";
		}
		else
		{
			section='c';
			scholorship=0;
			donation=15000;
			grade="fail";
		}
		int totalfee=fee-scholorship+donation;
		System.out.println("total fee:  "+totalfee);
		System.out.println("grade:"+grade);
	}
}