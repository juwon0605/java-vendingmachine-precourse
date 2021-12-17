package vendingmachine.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vendingmachine.constant.Message;
import vendingmachine.constant.Rule;
import vendingmachine.util.SplitChecker;
import vendingmachine.util.StringChecker;

public class Products {

	private Map<Name, Product> products;

	public Products(String input) {
		checkInput(input);
		Map<Name, Product> productMap = new HashMap<>();
		List<String> productInfoList = Arrays.asList(input.split(Rule.DELIMITER_PRODUCTS));

		for (String productInfo : productInfoList) {
			Product product = new Product(productInfo);

			if (productMap.containsKey(product.getName())) {
				throw new IllegalArgumentException(Message.ERROR_DUPLICATION);
			}

			productMap.put(product.getName(), product);
		}
		products = productMap;
	}

	private void checkInput(String input) {
		StringChecker stringChecker = new StringChecker();
		stringChecker.isEmpty(input);
		stringChecker.containSpace(input);
		stringChecker.containTap(input);

		SplitChecker splitChecker = new SplitChecker();
		splitChecker.exceedMaxSplit(input, Rule.DELIMITER_PRODUCTS);
		splitChecker.hasZeroLength(input, Rule.DELIMITER_PRODUCTS);
	}

	public boolean isEmpty() {
		return products.isEmpty();
	}

	public Price getMinPrice() {
		return Collections.min(getPriceList());
	}

	private List<Price> getPriceList() {
		List<Price> priceList = new ArrayList<>();

		for (Map.Entry<Name, Product> productEntry : products.entrySet()) {
			priceList.add(productEntry.getValue().getPrice());
		}

		return priceList;
	}

	public Product giveProduct(Name name) {
		Product selectedProduct = getProduct(name);
		minusProduct(selectedProduct);
		return selectedProduct;
	}

	public Product getProduct(Name name) {
		Product selectedProduct = products.get(name);

		if (selectedProduct == null) {
			throw new IllegalArgumentException(Message.ERROR_NOT_EXIST_PRODUCT);
		}

		return selectedProduct;
	}

	private void minusProduct(Product product) {
		product.minusTheNumberOf();

		if (product.isEmpty()) {
			products.remove(product.getName());
		}

		products.put(product.getName(), product);
	}
}
