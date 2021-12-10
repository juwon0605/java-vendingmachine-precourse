package vendingmachine.constant;

import vendingmachine.model.Coin;

public class Message {

	public static final String SPACE = " ";
	public static final String TAP = "	";

	public static final String INPUT_MESSAGE_HOlDING_SUM = "자판기가 보유하고 있는 금액을 입력해 주세요.";
	public static final String INPUT_MESSAGE_PRODUCT = "상품명과 가격, 수량을 입력해 주세요.";

	public static final String OUTPUT_MESSAGE_HOLDING_SUM = "자판기가 보유한 동전";

	public static final String ERROR = "[ERROR]";
	public static final String ERROR_MESSAGE_POSITIVE_NUMBER = Coin.minAmount() + "원 이상의 정수를 입력해 주세요.";
	public static final String ERROR_MESSAGE_EXCEED_INTEGER = Integer.MAX_VALUE + "이하의 정수를 입력해 주세요.";
	public static final String ERROR_MESSAGE_DIVISIBLE_NUMBER = Coin.minAmount() + "원 단위의 정수를 입력해 주세요.";
	public static final String ERROR_MESSAGE_CONTAINS_SPACE = "공백이 포함될 수 없습니다.";
	public static final String ERROR_MESSAGE_CONTAINS_TAP = "탭이 포함될 수 없습니다.";
	public static final String ERROR_MESSAGE_LENGTH_ZERO = "1자 이상을 입력해주세요";

	public static String toString(int amount, int count) {
		return amount + "원 - " + count + "개";
	}
}
