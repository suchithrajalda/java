package javaproject1;

import java.util.Scanner;

public class Palindromeprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int n=s.nextInt();
		int rem=0,count=0,i,temp=0,p=n;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
			for(;n!=0;n=n/10)
			{
				rem=n%10;
				temp=temp*10+rem;
			}
			if(p==temp)
			{
				System.out.println("palindrome prime");
			}
			else
			{
				System.out.println("not a palindrome prime");
			}
		}
		else
		{
			System.out.println("not prime");
		}
	
	}

}
