package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.constant.Message;
import vendingmachine.model.HoldingSum;

public class HoldingSumView {

	public HoldingSum getInput() {
		System.out.println(Message.INPUT_HOLDING_SUM);
		try {
			String input = Console.readLine();
			return new HoldingSum(input);
		} catch (IllegalArgumentException e) {
			System.out.println(Message.ERROR + e.getMessage() + "\n");
			return getInput();
		}
	}

	public void print(HoldingSum holdingSum) {
		System.out.println(Message.OUTPUT_HOLDING_SUM);
	}
}
