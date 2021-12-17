package vendingmachine.service;

import vendingmachine.model.VendingMachine;
import vendingmachine.view.InsertingSumView;
import vendingmachine.view.NameView;

public class VendingMachineService {

	public VendingMachine sellProductUntilPossible(VendingMachine vendingMachine) {

		while (vendingMachine.isPossibleToSell()) {
			vendingMachine = sellProduct(vendingMachine);
		}

		return vendingMachine;
	}

	private VendingMachine sellProduct(VendingMachine vendingMachine) {
		InsertingSumView insertingSumView = new InsertingSumView();
		insertingSumView.print(vendingMachine.getInsertingSum());

		NameView nameView = new NameView();
		vendingMachine.sellProduct(nameView.getInput());

		return vendingMachine;
	}
}
