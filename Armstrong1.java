package javaproject1;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int p=s.nextInt();
		int temp=p;
		int rem=0,count=0,arm=0,d=p;
		for(;p!=0;p/=10)
		{
			count++;
			rem=p%10;
		}
		p=temp;
		System.out.println(count);
		for(;p!=0;p/=10)
		{
			rem=p%10;
			arm=arm+(int)(Math.pow(rem,count));
			
		}
		
		System.out.println(arm);
		if(temp==arm)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not a armstrong");
		}

	}

}
