package javaproject1;

import java.util.Scanner;

public class Twinprimes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=s.nextInt();
		System.out.println("enter b value:");
		int b=s.nextInt();
		int count=0,temp=0,i=1,j=1;
		for(;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}

		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		for(;j<=b;j++)
		{
			if(b%j==0)
			{
				temp++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		if(count==2 && temp==2 && ((a-b==2) || (b-a==2)))
		{
			System.out.println("twin prime");
		}
		else
		{
			System.out.println("not a twin prime");
		}
		

	}

}
