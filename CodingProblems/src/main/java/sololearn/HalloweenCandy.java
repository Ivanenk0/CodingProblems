package sololearn;

/**
 * <p>
 *     <b>Halloween Candy</b><br>
 *     You go trick or treating with a friend and all but three of the houses that you visit are giving out candy.
 *     One house that you visit is giving out toothbrushes and two houses are giving out dollar bills.
 * </p>
 * <p>
 *     <b>Task</b><br>
 *     Given the input of the total number of houses that you visited, what is the percentage chance that one random item pulled from your bag is a dollar bill?
 * </p>
 * <p>
 *     <b>Input Format</b><br>
 *     An integer (>=3) representing the total number of houses that you visited.
 * </p>
 * <p>
 *     <b>Output Format</b><br>
 *     A percentage value rounded up to the nearest whole number.
 * </p>
 */

public class HalloweenCandy {

    private static final int HOUSES_WITH_MONEY = 2;

    public Integer calculateChances(Integer numberOfHouses) {
        return HOUSES_WITH_MONEY / numberOfHouses * 100;
    }
}
