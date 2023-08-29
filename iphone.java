class Iphone
{
	public static void main (String args[])
	{
		System.out.println("APPLE iPhone 14 (Blue, 128GB");
		System.out.println("Extra Rs11901 off");
		int amount=79900;
		double extra=(amount*14)/100;
		System.out.println(extra);
		double extramou=amount-extra;
		System.out.println(extramou);
		int pack=99;
		double packingfee=pack+extramou;
		System.out.println(packingfee);
		System.out.println("Available offers");
		System.out.println("Bank offer 5% Cashback on flipkart Axis bank Card");
		double bankoffer=(packingfee*5)/100;
		double subtotal=packingfee-bankoffer;
		System.out.println("actual price:"+subtotal);
		int exchange=7000;
		double total=subtotal-exchange;
		System.out.println("actual price:"+total);
		int supercoin=2;
		double totalcoin=(supercoin*total)/100;
		System.out.println("total price:"+(total-totalcoin));
		
		
		

		
		
		
	}
}