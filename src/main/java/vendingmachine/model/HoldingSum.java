package vendingmachine.model;

import java.util.HashMap;
import java.util.Map;

import camp.nextstep.edu.missionutils.Randoms;
import vendingmachine.util.NumberChecker;
import vendingmachine.util.StringChecker;

public class HoldingSum {

	private Map<String, Integer> coinMap;

	public HoldingSum() {
	}

	public HoldingSum(String input) {
		checkInput(input);
		coinMap = generateCoinsRandomly(input);
	}

	public int getCoinCount(String coinName) {
		return coinMap.getOrDefault(coinName, 0);
	}

	private void checkInput(String input) {
		StringChecker stringChecker = new StringChecker();
		stringChecker.isEmpty(input);

		NumberChecker numberChecker = new NumberChecker();
		numberChecker.isPositiveInteger(input);
		numberChecker.isDivisibleNumber(input, Coin.minAmount());
	}

	private Map<String, Integer> generateCoinsRandomly(String input) {
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
}
