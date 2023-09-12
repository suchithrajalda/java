package javaproject1;

import java.util.Scanner;

public class Scannerpackage {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter int value");
		int p=s.nextInt();
		System.out.println("enter double value");
		double t=s.nextDouble();
		System.out.println("enter String1 for 1 word");
		String r1=s.next();
		s.nextLine();
		System.out.println("enter String2 for sentence ");
		String r2=s.nextLine();
		System.out.println("enter char using string");
		char c=s.nextLine().charAt(0);
		System.out.println("int val:"+p+"double val"+t+"String r1"+r1+"String r2"+r2+"charcter"+c);
		

	}

}
