package vendingmachine.model;

import vendingmachine.util.NumberChecker;

public class TheNumberOf {

	private int theNumberOf;

	public TheNumberOf(String input) {
		checkInput(input);
		theNumberOf = Integer.valueOf(input);
	}

	private void checkInput(String input) {
		NumberChecker numberChecker = new NumberChecker();
		numberChecker.isPositiveInteger(input);
	}

	public void minus() {
		theNumberOf--;
	}

	public boolean isZero() {

		if (theNumberOf == 0) {
			return true;
		}

		return false;
	}
}
