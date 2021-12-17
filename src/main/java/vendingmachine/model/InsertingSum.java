package vendingmachine.model;

import vendingmachine.util.NumberChecker;

public class InsertingSum {

	private int insertingSum;

	public InsertingSum(String input) {
		checkInput(input);
		insertingSum = Integer.valueOf(input);
	}

	private void checkInput(String input) {
		NumberChecker numberChecker = new NumberChecker();
		numberChecker.isPositiveInteger(input);
		numberChecker.isDivisibleNumber(input, Coin.getMinAmount());
	}

	public int get() {
		return insertingSum;
	}

	public boolean isLessThan(Price price) {

		if (insertingSum < price.get()) {
			return true;
		}

		return false;
	}

	public void subtractPrice(Price price) {
		insertingSum -= price.get();
	}
}
