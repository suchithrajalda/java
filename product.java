class Product
{
	public static void main(String args[])
	{
		String productnam="book";
		int productcod=234;
		int price=65;
		int quantity=13;
		int total=price*quantity;
		System.out.println("total:"+total);
		if (total>2000)
		{
			double discount=(10.0/100)*total;
			System.out.println("after discount:"+(total-discount));
		}
		else
		{
			double discount=5.0/100*total;
			System.out.println("after discount:"+(total-discount));
		}
	}
}