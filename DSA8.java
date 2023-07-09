package Ass4;

public class DSA8 {
	
	public static void main(String[] args) {
		
		int n[]= {2,5,1,3,4,7};
		int n2=3;
		int temp=3;
		int n3[]=new int[n.length];
		for(int i=0,j=0;i<temp;i++,j+=2)
		{
			n3[j]=n[i];
			n3[j+1]=n[n2];
			n2++;
		}
		for(int o:n3)
		{
			System.out.print(o+" ");
		}
	}

}
