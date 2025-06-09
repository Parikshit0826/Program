package Sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 6, 7, 1, 3 };
		int si = 0;
		int ei = arr.length - 1;
		mergeSort(arr, si, ei);

		System.out.println(Arrays.toString(arr));
		
		
	}
	static void mergeSort(int[] arr, int si, int ei) {
		if (si < ei) {
			int mid = (si + ei) / 2;
			mergeSort(arr, si, mid);
			mergeSort(arr, mid + 1, ei);

			merge(arr, si, mid, ei);
		}
	
		
	}
	static void merge(int[] arr, int si, int mid, int ei) {
		int s1 = mid - si + 1;
		int s2 = ei - mid;

		int[] LTA = new int[s1];
		int[] RTA = new int[s2];

		for (int i = 0; i < s1; i++) {
			LTA[i] = arr[si + i];
		}
		for (int i = 0; i < s2; i++) {
			RTA[i] = arr[mid + 1 + i];
		}

		int i = 0, j = 0, k = si;

		while (i < s1 && j < s2) {
			if (LTA[i] < RTA[j]) {
				arr[k++] = LTA[i++];
			} else {
				arr[k++] = RTA[j++];
			}
		}

		while (i < s1) {
			arr[k++] = LTA[i];
			i++;
		}
		while (j < s2) {
			arr[k++] = RTA[j];
			j++;
		}
	}

}
