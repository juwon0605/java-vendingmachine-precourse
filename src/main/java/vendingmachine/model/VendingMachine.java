package vendingmachine.model;

import vendingmachine.constant.Message;

public class VendingMachine {

	private HoldingSum holdingSum;
	private Products products;
	private InsertingSum insertingSum;

	public HoldingSum getHoldingSum() {
		return holdingSum;
	}

	public void setHoldingSum(HoldingSum holdingSum) {
		this.holdingSum = holdingSum;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public InsertingSum getInsertingSum() {
		return insertingSum;
	}

	public void setInsertingSum(InsertingSum insertingSum) {
		this.insertingSum = insertingSum;
	}

	public boolean isPossibleToSell() {

		if (products.isEmpty()) {
			return false;
		}

		if (insertingSum.isLessThan(products.getMinPrice())) {
			return false;
		}

		return true;
	}

	public void sellProduct(Name name) {
		checkInsertingSum(name);
		Product soldProduct = products.giveProduct(name);
		insertingSum.subtractPrice(soldProduct.getPrice());
	}

	private void checkInsertingSum(Name name) {
		Product selectedProduct = products.getProduct(name);

		if (insertingSum.isLessThan(selectedProduct.getPrice())) {
			throw new IllegalArgumentException(Message.ERROR_LACK_OF_INSERTING_SUM);
		}

	}

	public Change getChange() {
		Change change = new Change(insertingSum, holdingSum);
		holdingSum.subtractChange(change);
		return change;
	}
}
