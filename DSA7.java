package Ass4;

import java.util.Arrays;

public class DSA7 {

	public static void main(String[] args) {
		
		int n[][]=new int [][] {{0,0,0},{0,0,0},{0,0,0}};
		int ops[][]=new int[][] {{2,2},{3,3}};
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n.length;j++)
			{
				if(i>=0&&i<ops[0][0] && j>=0&&j<ops[0][1])
				{
					n[i][j]+=1;
				}
				if(i>=0&&i<ops[1][0] && j>=0&&j<ops[1][1])
				{
					n[i][j]+=1;
				}
			}
		}
		int []n3=new int[n.length];
		
		for(int i=0;i<n.length;i++)
		{
			Arrays.sort(n[i]);
			n3[i]=n[i][n[i].length-1];
		}
		Arrays.sort(n3);
		int hi=n3[n3.length-1],count =0;
		for(int p[]:n)
		{
			for(int u:p)
			{
				if(hi==u)
					count++;
			}
		}
		System.out.println(hi+" is the max element with "+count+"times in matrix");
	}
}
