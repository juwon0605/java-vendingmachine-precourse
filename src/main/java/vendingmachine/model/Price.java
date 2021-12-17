package vendingmachine.model;

public class Price implements Comparable {

	private int price;

	public Price(String input) {
		checkInput(input);
		price = Integer.valueOf(input);
	}

	private void checkInput(String input) {

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
