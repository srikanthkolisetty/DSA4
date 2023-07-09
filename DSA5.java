package Ass4;

public class DSA5 {

	public static void main(String[] args) {
		
		int n=11;
		int i=0;
		while(true)
		{	
			i++;
			if(n>=i)
			{
				n-=i;
			}
			else
			{
				System.out.println(i-1+"row is last row");
				break;
			}
		}
	}
}
