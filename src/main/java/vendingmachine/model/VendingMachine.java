package vendingmachine.model;

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

	}

	public Change getChange() {
		return new Change();
	}
}
