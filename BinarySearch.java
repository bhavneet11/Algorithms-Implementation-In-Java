package Algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(recursiveBinarySearch(arr, 0, 4, 6));

	}

	static int iterativeBinarySearch(int arr[], int data) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == data) {
				return mid;
			} else if (arr[mid] > data) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	public static int recursiveBinarySearch(int arr[], int l, int r, int data) {

		if(r>=l) 
		{
int mid = l + (r - l) / 2;
			
			if (arr[mid] == data)
				return mid;
			else if (arr[mid] < data)
				return recursiveBinarySearch(arr, mid + 1, r, data);
			else  
				return recursiveBinarySearch(arr, l, mid - 1, data);
		}
			return -1;
		
	}
}
