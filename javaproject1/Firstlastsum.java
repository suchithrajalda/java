package javaproject1;

public class Firstlastsum {

	public static void main(String[] args) {
		int n=1234,last=0,first=0,sum=0;
			last=n%10;
		    System.out.println(last);
		    while(n!=0)
		    {
		    	first=n%10;
		    	n=n/10;	
			}
		    System.out.println(first);
		    sum=first+last;
		    System.out.println(sum);
		    
		    

	}

}
