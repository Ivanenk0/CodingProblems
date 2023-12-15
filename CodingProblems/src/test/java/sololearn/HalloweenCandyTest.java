package sololearn;

import org.junit.Assert;

/**
 * <p>
 *     <b>Halloween Candy</b><br>
 *     @see sololearn.HalloweenCandy
 * </p>
 */
public class HalloweenCandyTest {

    private final HalloweenCandy solution = new HalloweenCandy();

    public void calculateChances_Testcase1(){
        int actualOutput = solution.calculateChances(4);
        int expectedOutput = 50;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    public void calculateChances_Testcase2(){
        int actualOutput = solution.calculateChances(10);
        int expectedOutput = 20;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
