package com.greatlearning.services;

public class TransactionServiceImpl {

	public void findTransaction(int[] cs, int targval) {
		boolean flag = false;

		for (int i = 0; i < cs.length; i++) {
			if (cs[i] >= targval) {
				flag = true;
				System.out.println("Target achieved after " + (i + 1) + " transactions");
				break;
			}
		}
		if (!flag) {
			System.out.println("Given target is not achieved");
		}
	}

}
