package javaproject1;

public class Reverse {

	public static void main(String[] args) {
		int n=256,rem,temp=0,sum=0,count=0,mul=1;
		while(n!=0)
		{
			rem=n%10;//6//5//2
			n=n/10;//25//2//0
			System.out.println(rem);//6//5//2
			count++;
			System.out.println("count of digits"+count);
			sum=sum+rem;
			System.out.println("sum of the n value"+sum);
			mul=mul*rem;
			System.out.println("multiplication of n"+mul);
			temp=temp*10+rem;
			System.out.println("to represent then value hprizonta"+temp);

			
			
		}
			

	}

}
