package javaproject1;

public class fibanacci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,n=8;
		System.out.println(n1+"\n"+n2);
		for(i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
