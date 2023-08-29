class typecasting{
	public static void main(String args[])
	{
		byte b=7;
		short s=13;
		s=(short)(b+s);
		System.out.println(s);
		b=20;
		int i=25;
		i=(int)(b+i);
		System.out.println(i);
		b=34;
		long l=28;
		l=(long)(i+b);
		System.out.println(l);
		s=31;
		i=91;
		i=(int)(i+s);
		System.out.println(i);
		s=61;
		l=451;
		l=(long)(s+l);
		System.out.println(l);
		l=321;
		i=21;
		i=(int)(l+i);
		System.out.println(i);
		
		
	}
}