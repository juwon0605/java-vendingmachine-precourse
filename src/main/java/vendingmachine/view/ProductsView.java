package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.constant.Message;
import vendingmachine.model.Products;

public class ProductsView {

	public Products getInput() {
		System.out.println(Message.INPUT_PRODUCTS);
		try {
			String input = Console.readLine();
			return new Products(input);
		} catch (IllegalArgumentException e) {
			System.out.println(Message.ERROR + e.getMessage() + "\n");
			return getInput();
		}
	}
}
