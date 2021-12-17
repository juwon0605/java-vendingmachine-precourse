package vendingmachine.model;

public class TheNumberOf {

	private int theNumberOf;

	public TheNumberOf(String input) {
		checkInput(input);
		theNumberOf = Integer.valueOf(input);
	}

	private void checkInput(String input) {

	}
}
