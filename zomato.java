class Zomato{
	public static void main (String args[])
	{
		String orderitem="chocochip cake";
		int actualprice=900;
		System.out.println("actual price:"+actualprice);
		System.out.println("flavour:chocolate");
		String quantity="2kg";
		System.out.println("quantity:"+quantity);
		String address="addagutta,kukatpally";
		String payment="online mode";
		double discount= (5.0/100)*900;
		System.out.println("discount:"+discount);
		double total=actualprice-discount;
		System.out.println("subtotal:"+total+"\nApply coupons:10% off up to rs150");
		double coupon = (10.0/100)*900;
		double price=(total-coupon);
		System.out.println("after applying  coupon price is:"+price);
		double gst=60;
		double finalamount=(price+gst);
		System.out.println("after adding gst the price is:"+finalamount);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("actualprice       total         price        finalamount");
		System.out.println(  actualprice+"               "+total+"         "+price+"           "+finalamount);
		System.out.println("---------------------------------------------------------------------------------");
		}
}