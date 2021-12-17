package vendingmachine.model;

public class TheNumberOf {

	private int theNumberOf;

	public TheNumberOf(String input) {
		checkInput(input);
		theNumberOf = Integer.valueOf(input);
	}

	private void checkInput(String input) {

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
