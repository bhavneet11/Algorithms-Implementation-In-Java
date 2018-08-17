package Algorithms;

public class HeapSort {

	public static void main(String[] args) 
	{
		
		int[] arr={4,3,1,5,2};
		sort(arr);
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
	}
	public static void sort(int arr[]) 
	{
		int size=arr.length;
		for(int i=size/2-1;i>=0;i--) 
		{
			heapify(arr,size,i);
		}
		for(int i=size-1;i>=0;i--) 
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	public static void heapify(int[] arr,int size,int m) 
	{
		int largest=m;
		
		int l=2*m+1;
		int r=2*m+2;
		
		if(l<size && arr[l]>arr[largest]) 
		{
			largest=l;
		}
		if(r<size && arr[r]>arr[largest]) 
		{
			largest=r;
		}
		if(largest!=m) 
		{
			int swap=arr[m];
			arr[m]=arr[largest];
			arr[largest]=swap;
			
			heapify(arr,size,largest);
		}
	}
}
