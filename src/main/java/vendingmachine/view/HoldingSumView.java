package vendingmachine.view;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.constant.Message;
import vendingmachine.model.Coin;
import vendingmachine.model.HoldingSum;

public class HoldingSumView {

	public HoldingSum getInput() {
		System.out.println(Message.INPUT_HOLDING_SUM);
		try {
			String input = Console.readLine();
			System.out.println();
			return new HoldingSum(input);
		} catch (IllegalArgumentException e) {
			System.out.println(Message.ERROR + e.getMessage() + "\n");
			return getInput();
		}
	}

	public void print(HoldingSum holdingSum) {
		StringBuilder holdingSumState = new StringBuilder(Message.OUTPUT_HOLDING_SUM + "\n");

		for (Coin coin : Coin.values()) {
			List<String> coinInfo = new ArrayList<>();
			coinInfo.add(coin.getAmount() + Message.WON);
			coinInfo.add(holdingSum.getCoinCount(coin.name()) + Message.EA);
			holdingSumState.append(String.join(Message.COLON, coinInfo) + "\n");
		}

		System.out.println(holdingSumState);
	}
}
