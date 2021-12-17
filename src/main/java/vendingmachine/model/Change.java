package vendingmachine.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Change {

	private Map<String, Integer> change;

	public Change(InsertingSum insertingSum, HoldingSum holdingSum) {
		change = generateCoinGreedyToHoldingSum(insertingSum, holdingSum);
	}

	private Map<String, Integer> generateCoinGreedyToHoldingSum(InsertingSum insertingSum, HoldingSum holdingSum) {
		Map<String, Integer> coinMap = new HashMap<>();
		int accumulatedAmount = 0;

		for (Coin coin : Coin.values()) {

			while (coinMap.getOrDefault(coin.name(), 0) < holdingSum.getCoinCount(coin.name()) &&
				accumulatedAmount + coin.getAmount() <= insertingSum.get()) {
				coinMap.put(coin.name(), coinMap.getOrDefault(coin.name(), 0) + 1);
				accumulatedAmount += coin.getAmount();
			}

		}
		return coinMap;
	}

	public Set<Map.Entry<String, Integer>> getEntrySet() {
		return change.entrySet();
	}

	public Integer getCoinCount(String coinName) {
		return change.getOrDefault(coinName, 0);
	}
}
