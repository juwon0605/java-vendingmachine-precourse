package vendingmachine.model;

import vendingmachine.constant.Rule;
import vendingmachine.util.NumberChecker;

public class Price implements Comparable {

	private int price;

	public Price(String input) {
		checkInput(input);
		price = Integer.valueOf(input);
	}

	private void checkInput(String input) {
		NumberChecker numberChecker = new NumberChecker();
		numberChecker.isPositiveInteger(input);
		numberChecker.isDivisibleNumber(input, Coin.getMinAmount());
		numberChecker.isLessThan(input, Rule.MIN_PRICE);
	}

	public int get() {
		return price;
	}

	@Override
	public int compareTo(Object o) {
		Price other = (Price)o;
		return price - other.get();
	}
}
