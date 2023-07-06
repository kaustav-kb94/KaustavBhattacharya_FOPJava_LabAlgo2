package com.greatlearning.services;

public class DenominatorServiceImpl {

	public void checkAmountPayable(int[] sortedCurrVal, int payAmt) {

		int counter[] = new int[sortedCurrVal.length];

		try {
			for (int i = 0; i < sortedCurrVal.length; i++) {
				if (payAmt > sortedCurrVal[i]) {
					counter[i] = payAmt / sortedCurrVal[i];
				} else {
					counter[i] = 0;
				}
				if (payAmt % sortedCurrVal[i] != 0) {
					payAmt = (payAmt % sortedCurrVal[i]);
				} else {
					// As there is no reminder, we can say the amount is fully utilized by the
					// notes. Hence Amount is set to zero.
					payAmt = 0;
					break;
				}
			}

			if (payAmt > 0) {
				System.out.println("Exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be ");
				for (int j = 0; j < sortedCurrVal.length; j++) {
					// We are only using the non-zero note count
					if (counter[j] != 0) {
						System.out.println(sortedCurrVal[j] + " : " + counter[j]);
					}
				}
			}

		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}

	}

}
