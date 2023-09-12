package javaproject1;

public class Armstrong {

	public static void main(String[] args) {
		int n=153,rem,sum=0,temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum+=(Math.pow(rem,3));
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("armstrong");
			
		}
		else
		{
			System.out.println("not a armstrong");
		}
	}

}
