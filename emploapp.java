class Emploapp
{
	public static void main(String args[])
	{
		String empname="Suchithra";
		System.out.println(empname);
		char dept='a';
		int empid=345;
		int basicsalary=25000;
		double ta,da,hra,grosssalary,totalsalary,pf,tax,lpa;
		ta=(15/100)*basicsalary;
		da=(12/100)*basicsalary;
		hra=(19/100)*basicsalary;
		totalsalary=basicsalary+ta+da+hra;
		if(totalsalary>40000)
		{
			pf=(11/100)*basicsalary;
			tax=(5/100)*basicsalary;
		}
		else
		{
			pf=(7/100)*basicsalary;
			tax=(2.5/100)*basicsalary;
		}
		grosssalary=totalsalary-pf-tax;
		System.out.println("total salary:"+grosssalary);
		lpa=grosssalary*12;
		System.out.println("total lpa:"+lpa);
	}
}