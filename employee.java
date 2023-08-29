class Employee{
	public static void main (String args[]){
		int emploid= 1234;
		String empname="Suchithra";
		String empaddress="addagutta,kukatpally";
		int daywissal=545;
		int emplworkdays=30;
		int absentday=5;
		int total_workingdays=emplworkdays-absentday;
		int salary=daywissal*emplworkdays;
		System.out.println("employee id:"+emploid);
		System.out.println("employee name:"+empname);
		System.out.println("employee address:"+empaddress);
		System.out.println("day wise salary:"+daywissal);
		System.out.println("employee working days"+emplworkdays);
		System.out.println("employee absent days:"+absentday);
		System.out.println("total workingdays:"+total_workingdays);
		System.out.println("total salary:"+salary);
		
		
	}
}