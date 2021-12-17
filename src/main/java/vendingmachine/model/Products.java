package vendingmachine.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vendingmachine.constant.Rule;

public class Products {

	private Map<Name, Product> products;

	public Products(String input) {
		checkInput(input);
		Map<Name, Product> productMap = new HashMap<>();
		List<String> productInfoList = Arrays.asList(input.split(Rule.DELIMITER_PRODUCTS));

		for (String productInfo : productInfoList) {
			Product product = new Product(productInfo);
			productMap.put(product.getName(), product);
		}

		products = productMap;
	}

	private void checkInput(String input) {
		//상품명 중복도 여기서 검사
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
}
