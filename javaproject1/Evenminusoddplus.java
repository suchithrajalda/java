package javaproject1;

public class Evenminusoddplus {

	public static void main(String[] args) {
		int n=7862,rem=0,sum1=0,sum2=0,rem1=0;
		for(;n!=0;n/=10)
		{
			rem=n%10;
			if(rem%2==0)
			{
				sum1=sum1*10+(rem-1);
			}
			else
			{
				sum1=sum1*10+(rem+1);
			}
		}
		System.out.println(sum1);
		for(;sum1!=0;sum1/=10)
		{
			rem1=sum1%10;
			sum2=sum2*10+rem1;
			
		}
		System.out.println(sum2);
		

	}

}
