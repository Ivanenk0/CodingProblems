package sololearn;

/**
 * <p>
 *     <b>Credit Card Validator</b><br>
 *     You need to verify if the given credit card number is valid.
 *     For that you need to use <a href="https://en.wikipedia.org/wiki/Luhn_algorithm">Luhn algorithm</a>.
 * </p>
 * <p>
 *     <b>Luhn Algorithm</b><br>
 *     <ol>
 *         <li>Reverse the number;</li>
 *         <li>Multiple every second digit by 2;</li>
 *         <li>Subtract 9 from all numbers higher than 9;</li>
 *         <li>Add all the digits together;</li>
 *         <li>Modulo 10 of that sum should be equal to 0.</li>
 *     </ol>
 * </p>
 * <p>
 *     <b>Task</b><br>
 *     Given a credit card number, validate that it is valid.
 *     Also, all valid cards must have exactly 16 digits.
 * </p>
 * <p>
 *     <b>Input Format</b><br>
 *     A string containing the credit card number you need to verify.
 * </p>
 * <p>
 *     <b>Output Format</b><br>
 *     A string "valid" in case the input is a valid credit card number or "not valid", if it's not.
 * </p>
 */
public class CreditCardValidator {

    private static final int VALID_CARD_NUMBER_LENGTH = 16;

    public String validateCreditCardNumber(String cardNumber) {
        int cardNumberLen = cardNumber.length();
        if (cardNumberLen != VALID_CARD_NUMBER_LENGTH) {
            return "not valid";
        }

        String[] cardNumberArr = cardNumber.split("");
        int[] cardDigits = new int[cardNumberLen];
        int sumOfDigits = 0;

        // 1. Reverse number
        for (int i = 0; i < cardNumberLen; i++) {
            cardDigits[i] = Integer.parseInt(cardNumberArr[cardNumberLen-i-1]);
        }
        // 2. Multiple every second digit by 2
        for (int i = 1; i < cardNumberLen; i+=2) {
            cardDigits[i] *= 2;
        }
        // 3. Subtract 9 from all numbers higher than 9
        for (int i = 0; i < cardNumberLen; i++) {
            if (cardDigits[i] > 9) {
                cardDigits[i] -= 9;
            }
        }
        // 4. Add all the digits together
        for (int i : cardDigits) {
            sumOfDigits+= i;
        }
        // 5. Modulo 10 of that sum should be equal to 0
        return sumOfDigits % 10 == 0?"valid":"not valid";
    }
}
