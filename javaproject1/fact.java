package javaproject1;

public class fact {

	public static void main(String[] args) {
		int n,i,sum=0,fact=1,n1;
		for(n=122;n>0;n=n/10)
		{
			int s=n%10;
			System.out.println(s);
			sum=sum+s;
			System.out.println(sum);
		}
		for(n1=1;n1<=sum;n1++)
		{
			fact=fact*n1;
		}
		System.out.println(fact);
			

	}

}
