package vendingmachine.controller;

import vendingmachine.model.VendingMachine;
import vendingmachine.view.HoldingSumView;

public class VendingMachineController {

	private VendingMachine vendingMachine;

	public VendingMachineController(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	public void operate() {
		HoldingSumView holdingSumView = new HoldingSumView();
		vendingMachine.setHoldingSum(holdingSumView.getInput());

		holdingSumView.print(vendingMachine.getHoldingSum());

		ProductsView productsView = new ProductsView();
		vendingMachine.setProducts(productsView.getInput());

		InsertingSumView insertingSumView = new InsertingSumView();
		vendingMachine.setInsertingSum(insertingSumView.getInput());

		VendingMachineService vendingMachineService = new VendingMachineService();
		vendingMachine = vendingMachineService.sellProductUntilPossible(vendingMachine);

		insertingSumView.print(vendingMachine.getInsertingSum());
		ChangeView changeView = new ChangeView();
		changeView.print(vendingMachine.getChange());
	}
}
