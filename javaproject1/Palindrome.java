package javaproject1;

public class Palindrome {

	public static void main(String[] args) {
		int n=121,rem,temp=0,p=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			temp=temp*10+rem;
			System.out.println(temp);
				
		}
		if(p==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
