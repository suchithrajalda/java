class Age{
	public static void main (String args[]){
		int dobage=2001;
		int currentyr=2023;
		int presentage=currentyr-dobage;
		System.out.println("present age :"+presentage);
		int year=365;
		int days=year*presentage;
		System.out.println("days :"+days);
		int day=24;
		int hourstill=day*days;
		System.out.println("hourstill :"+hourstill);
		int min=60;
		int minute=min*hourstill;
		System.out.println("minute :"+minute);
		int sec=60;
		int second=sec*minute;
		System.out.println("sec :"+second);
	}
}