package javaproject1;

public class continuebreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		for(x=1;x<11;x++)
		{
			if(x==7)
			{
				break;
			}
			System.out.println(x);
		}
		for(x=1;x<11;x++)
		{
			if(x==7)
			{
				continue;
			}
			System.out.println(x);
		}
		
	}

}
