class primeforward
{
	public static void main(String args[])
	{
		int n=15,start=2,end=15,count=0;
		while(start<end)//2<15//3<15//4<15....14<15
		{
			if(end%start==0)//15%2==1==0//15%3=0 here count=1//15%4=3==0
			{
				count++;//it will count the every iteration	
			}
			start++;//increments the start value
		}
		if(count==0)//if the count value==0 then it prints prime 
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
}