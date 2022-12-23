package com.example.recursion;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] data = new int[] {0,2,1,5,3,9,5,6,7};
		 mergeSort(data, 0, data.length-1);
		 for (int i =0; i<data.length; i++) {
			 System.out.println(data[i]);
		 }
	}

	public static void mergeSort(int data[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(data, start, mid);
			mergeSort(data, mid + 1, end);
			merge(data, start, mid, end);

		}
	}

	public static void merge(int data[], int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int i = start, j = mid + 1, k = 0;
		while (i <= mid && j <= end) {
			if (data[i] <= data[j]) {
				temp[k] = data[i];
				i++;
				k++;
			} else {
				temp[k] = data[j];
				k++;
				j++;
			}
		}

		while (i <= mid) {
			temp[k] = data[i];
			k++;
			i++;
		}
		while (j <= end) {
			temp[k] = data[j];
			k++;
			j++;
		}
		for (i = start; i <= end; i++) {
			data[i] = temp[i - start];
		}
	}

}
