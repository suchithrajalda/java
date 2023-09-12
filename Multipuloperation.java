public class Multipuloperation {
 public static void main(String[] args) {
     int n=113,rem=0,temp=0,p=n,remain=0,digit=1,count=0,sum=0,s=n,add=0,d=n,mul1=1,i,count1=0,fact=1,k;
     for(;n>0;n/=10)
     {
     	rem=n%10;
        temp=temp*10+rem;
        mul1=mul1*rem;
     }
     System.out.println(temp);
     if(temp==p)
     {
     	System.out.println("palindrome");
        for(;s>0;s/=10)
        {
        
        	remain=s%10;
            sum=sum+(int)(Math.pow(remain,3));
        }
        System.out.println(sum);
        if(d==sum)
            {
            	System.out.println("armstrong");
            }
        else
        {
        	System.out.println("not");
        }
          
     }
     else
     {
     	System.out.println("not palindrome");
        System.out.println(mul1);
        for(i=2;i<=mul1;i++)
        {
        	if(mul1%i==0)
            {
            	count1++;
            }
     }
     	if(count1==1)
        {
           System.out.println("prime  "+mul1);
           for(k=1;k<=mul1;k++)
           {
           		fact=fact*k;
                System.out.println("factorial is  "+fact);
           }
         }
		else
        {
           System.out.println("not prime "+mul1);
           	if(mul1%2==0)
           	{
           		System.out.println("even "+mul1/2);
           	}
           	else
           	{
           		System.out.println("odd"+mul1*2);
           	}
         }
            
     }
     

  }
}
