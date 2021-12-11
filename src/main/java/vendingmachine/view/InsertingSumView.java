package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.constant.Message;
import vendingmachine.model.InsertingSum;

public class InsertingSumView {

	public InsertingSum getInput() {
		System.out.println(Message.INPUT_MESSAGE_INSERTING_SUM);
		InsertingSum insertingSum = new InsertingSum();
		try {
			String input = Console.readLine();
			System.out.println();
			insertingSum.set(input);
		} catch (Exception e) {
			System.out.println(Message.ERROR + e.getMessage());
			return getInput();
		}
		return insertingSum;
	}

	public void print(InsertingSum insertingSum) {
		StringBuilder stringBuilder = new StringBuilder(Message.OUTPUT_MESSAGE_INSERTING_SUM);
		stringBuilder.append(insertingSum.get());
		stringBuilder.append(Message.WON);
		System.out.println(stringBuilder);
	}
}
