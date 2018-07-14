package Algorithms;

public class MergeSort {

	public static void main(String[] args) {
		int []arr= {4,2,1,3,6,5};
		sort(arr, 0, 5);
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
		
	}

	static void sort(int arr[],int left,int right) 
	{
		int mid;
		if(left<right) 
		{
			mid=(left+right)/2;
			sort(arr,left,mid);
			
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	static void merge(int arr[],int left,int mid,int right)
	{
		int leftArr[]=new int[mid-left+1];
		int rightArr[]=new int[right-mid];
		
		for(int i=0;i<leftArr.length;i++) 
		{
			leftArr[i]=arr[left+i];
		}
		for(int j=0;j<rightArr.length;j++) 
		{
			rightArr[j]=arr[mid+1+j];
		}
		int i=0;int j=0;
		int k=left;
		while(i<leftArr.length && j<rightArr.length) 
		{
			if(leftArr[i]<rightArr[j]) 
			{
				arr[k]=leftArr[i];
				i++;
			}
			else 
			{
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<leftArr.length) 
		{
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<rightArr.length) 
		{
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	} 
}
