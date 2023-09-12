package javaproject1;

public class Replacing {

	public static void main(String[] args) {
		int n=4321,last,temp=0,p=n,s,a,d=n,c,count=0;
			last=n%10;
			n=n/1000;
			System.out.println("last  "+last);
			System.out.println("first  "+n);
			temp=last;
			last=n;
			n=temp;
			System.out.println("last  "+last+"    first  "+n);
			p=p/100;
			System.out.println(p);
			s=p%10;
			System.out.println("third digit is  "+s);
			a=d%100;
			c=a/10;
			System.out.println("second digit"+c);
			count=s;
			s=c;
			c=count;
			System.out.println("third digit   "+s+"  second digit"+c);
			System.out.println((n+""+s+""+c+""+last));
			

	}

}
