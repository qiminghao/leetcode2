package util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommonUtil {

    public static <T> String arrayToString(T[] arr) {
        if (arr == null || arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        for (T t : arr) {
            sb.append("," + t.toString());
        }
        return "[" + sb.toString().substring(1) + "]";
    }

    public static String intArrayToString(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList()).toString();
    }

    public static int[] newIntArray(int... elements) {
        return elements;
    }

    public static <T> T[] newArray(T... elements) {
        return elements;
    }
}
