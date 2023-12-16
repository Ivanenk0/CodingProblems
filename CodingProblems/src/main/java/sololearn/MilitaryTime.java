package sololearn;

import java.util.Arrays;

/**
 * <p>
 *     <b>Military Time</b><br>
 *     You want to convert 12 hour clock to a 24 hour clock.
 * </p>
 * <p>
 *     <b>Task</b><br>
 *     Determine if the time you are given is AM or PM, then convert that value to the wy it would appear on a 24 hour clock.
 * </p>
 * <p>
 *     <b>Input Format</b><br>
 *     A string that includes the time, then a space and then indicator for AM or PM.
 * </p>
 * <p>
 *     <b>Output Format</b><br>
 *     A string that includes the time in a 24 hour format (XX:XX).
 * </p>
 */
public class MilitaryTime {

    public String convertTime(String inputTime) {
        String[] timeFragments = inputTime.replace(" ", ":").split(":");

        if (timeFragments[2].equals("AM")) {
            if (timeFragments[0].equals("12")) {
                return "0:" +timeFragments[1];
            }
            return timeFragments[0] + ":" + timeFragments[1];
        }
        else {
            if (timeFragments[0].equals("12")) {
                return timeFragments[0] + ":" + timeFragments[1];
            }
            return 12 + Integer.parseInt(timeFragments[0]) + ":" + timeFragments[1];
        }
    }
}
