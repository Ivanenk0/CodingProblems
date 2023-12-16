package sololearn;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p>
 *     <b>Military Time</b>
 *     @see sololearn.MilitaryTime
 * </p>
 */
public class MilitaryTimeTest {

    private final MilitaryTime solution = new MilitaryTime();

    @Test
    public void convertTime_Testcase1(){
        String actualOutput = solution.convertTime("12:15 PM");
        String expectedOutput = "12:15";

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void convertTime_Testcase2(){
        String actualOutput = solution.convertTime("11:00 AM");
        String expectedOutput = "11:00";

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
