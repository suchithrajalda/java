package javaproject1;

public class Leap {

	public static void main(String[] args) {
		int year=2017;
		if(year%400==0 && year%4==0 && year%100!=0)
		{
			System.out.println("leap year");
		    int n=year%100;
		    System.out.println(n);
		    if(n%2==0)
		    {
		    	System.out.println("even");
		    }
		    else
		    {
		    	System.out.println("odd");
		    }
		}
		else
		{
			System.out.println("not a leap year");
			int p=year%100;
			System.out.println(p);
			int a=year/100;
			System.out.println(a);
			int a1=p+a;
			System.out.println(a1);
		}

	}

}
