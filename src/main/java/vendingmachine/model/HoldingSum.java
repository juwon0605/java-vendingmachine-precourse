package vendingmachine.model;

import java.util.HashMap;
import java.util.Map;

import camp.nextstep.edu.missionutils.Randoms;

public class HoldingSum {

	private Map<String, Integer> holdingSum;

	public HoldingSum(String input) {
		checkInput(input);
		holdingSum = generateCoinRandomly(input);
	}

	private void checkInput(String input) {

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
}
