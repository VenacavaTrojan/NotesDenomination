package com.anup.array2;

public class MergeSortImplementation {
	public static void main(String[] args) {
		int[] arr = { 8,2,9,6,5,3,7,4};
		System.out.println("Original Array");
		display(arr);
		int low=0, high;
		high = arr.length - 1;
		mergeSort(arr, low, high);
		System.out.println("After Merge Sort");
		display(arr);
	}
	
	private static void mergeSort(int[] arr, int low, int high) {
		if(low<high) {
			//find mid point
			int mid = (low+high)/2;
			//sort and 1st & 2nd halves
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			//merge the sorted halves
			merge(arr,low,mid,high);
		}
		
	}
	
	private static void merge(int[]arr,int low, int mid, int high) {
		int i, j, k;
		i = low;
		j = mid + 1;
		k = low;
		int[] tempArr = new int[high + 1];
		while (i <= mid && j <= high) {
			if (arr[i] < arr[j])
				tempArr[k++] = arr[i++];
			else
				tempArr[k++] = arr[j++];
		}
		for (; i <= mid; i++)
			tempArr[k++] = arr[i];
		for (; j <= high; j++)
			tempArr[k++] = arr[j];
		for (i = low; i <= high; i++)
			arr[i] = tempArr[i];
		
	}
	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
}