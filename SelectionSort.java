package Algorithms;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int [] arr= {1,9,2,8,3,7,4,6,5};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}

	}
	static void selectionSort(int []arr) 
	{
		int i,j;
		int copy;
		int temp;
		for(i=0;i<arr.length-1;i++) 
		{
			 temp=i;
			for( j=i;j<arr.length;j++) 
			{
				if(arr[j]<arr[temp]) 
				{
					temp=j;
				}
			}	
			copy=arr[temp];
			arr[temp]=arr[i];//cant use j as the last increment will be more than the length of the array
			arr[i]=copy;
		}
		
	}
}
