package javaproject1;

public class perfectnum {

	public static void main(String[] args) {
		int n=6,i,sum=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		
		}
		System.out.println(sum);
		if(sum/2==n)
		{
			System.out.println("perfect num");
		}
		else
		{
			System.out.println("not a perfect");
		}

	}

}
