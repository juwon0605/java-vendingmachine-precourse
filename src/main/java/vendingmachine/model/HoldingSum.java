package vendingmachine.model;

public class HoldingSum {

	private int holdingSum;

	public HoldingSum(String input) {
		checkInput(input);
		holdingSum = Integer.valueOf(input);
	}

	private void checkInput(String input) {

	}
}
