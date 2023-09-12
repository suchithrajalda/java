package javaproject1;

public class Random {

	public static void main(String[] args) {
		int n=12345,count=0,rem=0;
		for(;n>0;n=n/10)
		{
			count++;
			rem=n%10;
		
			if(count==2 || count==5)
			{
				System.out.println(rem);
			}
		}

	}

}
