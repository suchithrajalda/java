package javaproject1;

public class Evenoddn {

	public static void main(String[] args) {
		int n=45678,rem;
		for(;n>0;n/=10)
		{
			rem=n%10;
			if(rem%2==0)
			{
				System.out.println(rem+"  even");
			}
			else
			{
				System.out.println(rem+"   odd");
			}
		}

	}

}
