package com.greatlearning.services;

public class BubbleSortImpl {

	public int[] bubbleSort(int[] arr) {
		int size = arr.length;
		int temp = 0;
		if (size > 1) {
			for (int i = 0; i < size; i++) {
				for (int j = 1; j < (size - i); j++) {
					if (arr[j] > arr[j - 1]) {
						temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}

				}
			}
		}
		return arr;
	}

}
