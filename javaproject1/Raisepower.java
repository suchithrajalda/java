package javaproject1;

import java.util.Scanner;

public class Raisepower {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter p1 value");
		int p1=s.nextInt();
		System.out.println("enter p2 value");
		int p2=s.nextInt();
		int i,res=1,j,temp=1;
		for(i=1;i<=p2;i++)
		{
			res=res*p2;
		}
		System.out.println(res);
		for(j=1;j<=p1;j++)
		{
			temp=temp*p1;
		}
		System.out.println(temp);
		

	}

}
