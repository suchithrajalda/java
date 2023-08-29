class Roots{
	public static void main(String args[])
	{
	double a=3,b=5,c=2;
	double root1= (-b+(Math.sqrt(b*b-4*a*c)))/(2*a);
	double root2= (-b-(Math.sqrt(b*b-4*a*c)))/(2*a);
	System.out.println(root1);
	System.out.println(root2);
	}	
}