class Profit
{
	public static void main(String args[])
	{
		int costprice=80;
		int sellingprice=70;
		if (sellingprice>costprice)
		{
		double profit=sellingprice-costprice;
		System.out.println("profit:"+profit);
		}
		else
		{
		double loss=costprice-sellingprice;
		System.out.println("loss:"+loss);
		}
	} 
}