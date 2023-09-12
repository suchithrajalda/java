package javaproject1;

public class Lastdigit {

	public static void main(String[] args) {
		int n=1237,count=0,i;
		int s=n%10;
		for(i=1;i<=s;i++)
		{
			if(s%i==0)
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
			System.out.println("not a prime");
		}
		

	}

}
