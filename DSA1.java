package Ass4;

public class DSA1 {

	public static void main(String[] args) {
		
		int[]  n1= {1,2,3,4,5},n2= {1,2,5,7,9},n3= {1,3,4,5,8};
		
		for(int i=0;i<n1.length;i++)
		{
			int count=1;
			for(int j:n2)
			{
				if(n1[i]==j)
				{
					count++;
					break;
				}
			}
			for(int k:n3)
			{
				if(n1[i]==k)
				{
					count++;
					break;
				}
			}
			System.out.print(count==3?n1[i]+" ":"");
		}
	}
}
