package javaproject1;

public class Mulsum {

	public static void main(String[] args) {
		int n=4321,rem,mul1=1,mul2=1,count=0,sum;
		for(;n>0;n/=10)
		{
			count++;
			rem=n%10;
			if(count==1 || count==4)
			{
				mul1=rem*mul1;
			}
			if(count==2 || count==3)
			{
				mul2=rem*mul2;
			}
			
		}
		System.out.println("mul1 "+mul1);
		System.out.println("mul2 "+mul2);
		sum=mul1+mul2;
		System.out.println("sum "+sum);

	}

}
