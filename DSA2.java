package Ass4;

public class DSA2 {

	public static void main(String[] args) {
		
		int [] nums1= {1,2,3},num2= {2,4,6};
		int nums3[][]=new int[nums1.length-1][2];
		int k=0;
		for(int i=0;i<nums1.length;i++)
		{
			int count=0;
			for(int j:num2)
			{
				if(nums1[i]==j)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				nums3[0][k]=nums1[i];
				k++;
			}
			
		}
		k=0;
		for(int i=0;i<num2.length;i++)
		{
			int count=0;
			for(int j:nums1)
			{
				if(num2[i]==j)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				nums3[1][k]=num2[i];
				k++;
			}
			
		}

		for(int o[]:nums3)
		{
			for(int p:o)
			{
				System.out.print(p+" ");
			}
		}
	}
}
