package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.constant.Message;
import vendingmachine.model.InsertingSum;

public class InsertingSumView {

	public InsertingSum getInput() {
		System.out.println(Message.INPUT_INSERTING_SUM);
		try {
			String input = Console.readLine();
			System.out.println();
			return new InsertingSum(input);
		} catch (IllegalArgumentException e) {
			System.out.println(Message.ERROR + e.getMessage() + "\n");
			return getInput();
		}
	}

	public void print(InsertingSum insertingSum) {
		System.out.print(Message.OUTPUT_INSERTING_SUM);

	}
}
