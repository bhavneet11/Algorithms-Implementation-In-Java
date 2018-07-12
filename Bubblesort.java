package Algorithms;

public class Bubblesort {

	public static void main(String[] args) 
	{
		int []arr= {3,9,1,4,8,5,7,2,0};
		bubblesort(arr);
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}

	}
	 static int [] bubblesort(int arr[])
	{
		 int temp=0;
		 boolean swapped;
		 for(int i=0;i<arr.length-1;i++) 
		 {
			 swapped=false;
			 for(int j=0;j<arr.length-1-i;j++) 
			 {
				 if(arr[j]>arr[j+1]) 
				 {
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 swapped=true;
				 }
				 
			 }
			 if(swapped==false) 
			 {
				 break;
			 }
		 }
		return arr;
	} 
}
