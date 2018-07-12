package Algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args)
	{
		int arr[]= {2,1,3,7,4,4,1,5,9,3};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
			
		}

	}
	static void insertionSort(int arr[]) 
	{
		for(int i=1;i<arr.length;i++) 
		{
			int j=i-1;
			int key=arr[i];
			while(j>=0 && key<arr[j]) 
			{
				arr[j+1]=arr[j];//keep moving the greater elements to the right.
				j=j-1;
			}
			arr[j+1]=key;//key used as array values are updated.To store the original value of current element
			
		}
		
	}
}
