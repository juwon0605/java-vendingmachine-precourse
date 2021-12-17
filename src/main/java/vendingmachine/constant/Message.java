package vendingmachine.constant;

public class Message {

	public static final String LINE = " - ";
	public static final String EMPTY = "";
	public static final String SPACE = " ";
	public static final String TAP = "	";

	public static final String WON = "원";
	public static final String EA = "개";

	public static final String INPUT_HOLDING_SUM = "자판기가 보유하고 있는 금액을 입력해 주세요.";
	public static final String INPUT_PRODUCTS = "상품명과 가격, 수량을 입력해 주세요.";
	public static final String INPUT_INSERTING_SUM = "투입 금액을 입력해 주세요.";
	public static final String INPUT_NAME = "구매할 상품명을 입력해 주세요.";

	public static final String OUTPUT_HOLDING_SUM = "자판기가 보유한 동전";
	public static final String OUTPUT_INSERTING_SUM = "투입 금액: ";
	public static final String OUTPUT_CHANGE = "잔돈";

	public static final String ERROR = "[ERROR]";
	public static final String ERROR_NOT_EXIST_PRODUCT = "없는 상품입니다.";
	public static final String ERROR_LACK_OF_INSERTING_SUM = "투입 금액이 부족합니다.";
	public static final String ERROR_DUPLICATION = "중복이 없어야 합니다.";
	public static final String ERROR_POSITIVE_INTEGER = "양의 정수를 입력해주세요.";
	public static final String ERROR_EXCEED_INTEGER = Integer.MAX_VALUE + "이하를 입력해 주세요.";
	public static final String ERROR_DIVISIBLE_NUMBER = "단위의 정수를 입력해 주세요.";
	public static final String ERROR_LESS_THAN_MIN = "이상을 입력해 주세요.";
	public static final String ERROR_LENGTH_ZERO = "1자 이상을 입력해주세요";
	public static final String ERROR_THE_NUMBER_OF = "개를 입력해주세요.";
	public static final String ERROR_INPUT_IS_EMPTY = "아무것도 입력되지 않았습니다.";
	public static final String ERROR_CONTAINS_SPACE = "공백이 포함될 수 없습니다.";
	public static final String ERROR_CONTAINS_TAP = "탭이 포함될 수 없습니다.";
	public static final String ERROR_NOT_BRACKET = "개별 상품은 " + Rule.BRACKET + "로 묶어야합니다.";

}
