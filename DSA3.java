package Ass4;

public class DSA3 {

	public static void main(String[] args) {
		
		int n[][]= new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("the transpose of the matrix");
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n.length;j++)
			{
				System.out.print(n[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}
