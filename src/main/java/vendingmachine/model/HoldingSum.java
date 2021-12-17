package vendingmachine.model;

import java.util.HashMap;
import java.util.Map;

import camp.nextstep.edu.missionutils.Randoms;
import vendingmachine.util.NumberChecker;

public class HoldingSum {

	private Map<String, Integer> holdingSum;

	public HoldingSum(String input) {
		checkInput(input);
		holdingSum = generateCoinRandomly(input);
	}

	private void checkInput(String input) {
		NumberChecker numberChecker = new NumberChecker();
		numberChecker.isPositiveInteger(input);
		numberChecker.isDivisibleNumber(input, Coin.getMinAmount());

	}

	private Map<String, Integer> generateCoinRandomly(String input) {
		Map<String, Integer> coinMap = new HashMap<>();
		int restMoney = Integer.valueOf(input);

		while (restMoney != 0) {
			int randomCoinAmount = Randoms.pickNumberInList(Coin.getAmountList());

			if (restMoney >= randomCoinAmount) {
				restMoney -= randomCoinAmount;
				String coinName = Coin.getName(randomCoinAmount);
				coinMap.put(coinName, coinMap.getOrDefault(coinName, 0) + 1);
			}

		}
		return coinMap;
	}

	public int getCoinCount(String coinName) {
		return holdingSum.getOrDefault(coinName, 0);
	}

	public void subtractChange(Change change) {

		for (Map.Entry<String, Integer> changeEntry : change.getEntrySet()) {
			String coinName = changeEntry.getKey();
			Integer coinCount = changeEntry.getValue();
			holdingSum.put(coinName, holdingSum.get(coinName) - coinCount);
		}

	}
}
