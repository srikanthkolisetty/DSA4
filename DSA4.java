package Ass4;

import java.util.Arrays;

public class DSA4 {

public static void main(String[] args) {
		
		int n[]= {1,4,2,8,5};
		Arrays.sort(n);
		int result=0;
		for(int i=0;i<n.length;i+=2)
		{
			result+=n[i];
		}
		System.out.println("maximum result is"+result);
	}
}
