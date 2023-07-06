package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.TransactionServiceImpl;

public class TransactionMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of transaction array");

		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("enter the values of array");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("enter the total no of targets that needs to be achieved");

		int noTarg = sc.nextInt();

		TransactionServiceImpl transServ = new TransactionServiceImpl();

		int[] cs = new int[arr.length];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			cs[i] = sum;
		}

		for (int j = 0; j < noTarg; j++) {
			System.out.println("enter the value of target");
			int targval = sc.nextInt();
			transServ.findTransaction(cs, targval);
		}

		sc.close();

	}

}
