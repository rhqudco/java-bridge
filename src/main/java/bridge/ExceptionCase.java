package bridge;

public class ExceptionCase {

    public static void validateBridgeSize(String validationValue) {
        try {
            validateNumberFormatException(validationValue);
            validateCheckRange(Integer.parseInt(validationValue));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void validateNumberFormatException(String validationValue) {
        try {
            Integer.parseInt(validationValue);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("[ERROR] 3에서 20 사이의 값만 입력 가능합니다.");
        }
    }

    private static void validateCheckRange(int validationValue) {
            try {
                if (validationValue < 3 || validationValue > 20) {
                    throw new IllegalArgumentException("[ERROR] 다리의 길이는 3에서 20이어야 합니다.");
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }

    }
}
