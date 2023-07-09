package Ass4;

import java.util.Arrays;

public class DSA6 {

	public static void main(String[] args) {
		
		int n[]= {-4,-1,0,3,10};
		for(int i=0;i<n.length;i++)
		{
			n[i]=n[i]*n[i];
		}
		Arrays.sort(n);
		
		for(int i:n)
		{
			System.out.print(i+" ");
		}
	}
}
