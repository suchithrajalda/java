class Assignment
{
	public static void main(String args[])
	{
		int a=10;
		int b=(a++);
		System.out.println(a);
		a=++a;
		System.out.println(a);
		int s=10,p=12;
		int d=s++;
		System.out.println(s);
		int q=++p;
		System.out.println(q);
		System.out.println(d+"  "+q+"  "+s+"   "+p);

	}
}