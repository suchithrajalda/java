class Compound{
	public static void main(String args[]){
	double p=21000,t=12,r=10;
	double compound=p*(Math.pow((1+r/100),t));
	System.out.println(compound);
	double ci=(compound-p);
	System.out.println("compound intrest:"+ci);
	
	}
} 