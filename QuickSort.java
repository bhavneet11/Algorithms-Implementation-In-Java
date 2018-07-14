package Algorithms;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {2,4,1,3,7,5,6};
		sort(arr,0,6);
		for(int i=0;i<arr.length;i++) 
		{
		System.out.println(arr[i]);	
		}
	}
	static void sort(int arr[],int start,int end) 
	{
		
		if(start<end) 
		{
			int pi=partition(arr,start,end);
			sort(arr,start,pi-1);
			sort(arr,pi+1,end);
		}
	}
	
	static int partition(int arr[],int start,int end) 
	{
		int pivot=arr[end];
		int j=start;
		int i=start-1;
		while(j<end) 
		{
			if(arr[j]<pivot) 
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;			}
				j++;
		}
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		return i+1;
		
	}
}
