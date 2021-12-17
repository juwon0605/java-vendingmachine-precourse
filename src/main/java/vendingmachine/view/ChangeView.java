package vendingmachine.view;

import java.util.ArrayList;
import java.util.List;

import vendingmachine.constant.Message;
import vendingmachine.model.Change;
import vendingmachine.model.Coin;

public class ChangeView {

	public void print(Change change) {
		StringBuilder changeState = new StringBuilder(Message.OUTPUT_CHANGE + "\n");

		for (Coin coin : Coin.values()) {

			if (change.getCoinCount(coin.name()) > 0) {
				List<String> changeInfo = new ArrayList<>();
				changeInfo.add(coin.getAmount() + Message.WON);
				changeInfo.add(change.getCoinCount(coin.name()) + Message.EA);
				changeState.append(String.join(Message.LINE, changeInfo) + "\n");
			}

		}
		System.out.println(changeState);
	}
}
