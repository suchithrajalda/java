class technum
{
	public static void main(String args[])
	{
		int n=2025,count=0,rem=0,num=0,p=n,temp=0,sum=0,b=n;
		for(;n!=0;n/=10)
		{
			count++;
			rem=n%10;
		}
		num=p/100;
		temp=p%100;
		sum=num+temp;
		sum=sum*sum;
		System.out.println(sum);
		if(b==sum)
		{
			System.out.println("tech sum");
		}
		else
		{
			System.out.println("not");
		}
	}
}
//output
2025
technum






