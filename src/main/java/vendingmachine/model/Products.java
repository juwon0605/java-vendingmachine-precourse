package vendingmachine.model;

import java.util.Arrays;
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
		//log
		System.out.println(products.size());
	}

	private void checkInput(String input) {
		//상품명 중복도 여기서 검사
	}
}
