package vendingmachine.model;

import java.util.Arrays;
import java.util.List;

import vendingmachine.constant.Rule;

public class Product {

	private Name name;
	private Price price;
	private TheNumberOf theNumberOf;

	public Product(String input) {
		checkInput(input);
		String productInfoWithoutBracket = input.substring(1, input.length() - 1);
		List<String> infoList = Arrays.asList(productInfoWithoutBracket.split(Rule.DELIMITER_PRODUCT_INFO));
		name = new Name(infoList.get(0));
		price = new Price(infoList.get(1));
		theNumberOf = new TheNumberOf(infoList.get(2));
	}

	private void checkInput(String input) {

	}

	public Name getName() {
		return name;
	}

	public Price getPrice() {
		return price;
	}

	public void minusTheNumberOf() {
		theNumberOf.minus();
	}

	public boolean isEmpty() {
		return theNumberOf.isZero();
	}
}
