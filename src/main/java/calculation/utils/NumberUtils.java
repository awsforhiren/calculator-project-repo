package main.java.calculation.utils;

import java.util.regex.Pattern;

public class NumberUtils {
    private static final String NUMBER_PATTERN = "[0-9]+[.]?[0-9]*";
    private static Pattern patternObj = Pattern.compile(NUMBER_PATTERN);

    public static boolean isValid(String inputValue) {
        return patternObj.matcher(inputValue).matches();
    }
}
