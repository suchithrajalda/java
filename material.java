class Material{
	public static void main (String[] args){
		System.out.println("Construction Materials");
		double project_budget=2500000;
		System.out.println("project budget:"+project_budget);
		String materialname1="brick";
		System.out.println("material name1:"+materialname1);
		int quantity=3000;
		int one_brick=10;
		double brick_price=quantity*one_brick;
		System.out.println("brick price:"+brick_price);
		double discount=(10*brick_price)/100;
		System.out.println("dicount price:"+discount);
		double total_price=brick_price-discount;
		System.out.println("after discount final price is:"+total_price);
		
	}
}