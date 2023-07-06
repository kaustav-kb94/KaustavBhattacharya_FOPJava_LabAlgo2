package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.BubbleSortImpl;
import com.greatlearning.services.DenominatorServiceImpl;

public class CurrencyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BubbleSortImpl bubbleSort = new BubbleSortImpl();
		DenominatorServiceImpl denoserv = new DenominatorServiceImpl();
		System.out.println("enter the size of currency denominations");
		int sizeCurr = sc.nextInt();
		int[] currencyArr = new int[sizeCurr];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < sizeCurr; i++) {
			currencyArr[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int payAmt = sc.nextInt();
		int[] sortedCurrVal = bubbleSort.bubbleSort(currencyArr);
		
		
		denoserv.checkAmountPayable(sortedCurrVal, payAmt);

		sc.close();

	}

}
