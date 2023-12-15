package sololearn;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardValidatorTest {

    private final CreditCardValidator solution  = new CreditCardValidator();

    @Test
    public void validateCreditCardNumber_Testcase1() {
        String actualOutput = solution.validateCreditCardNumber("4100465547344404");
        String expectedOutput = "valid";

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void validateCreditCardNumber_Testcase2() {
        String actualOutput = solution.validateCreditCardNumber("8626430272322848");
        String expectedOutput = "not valid";

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
