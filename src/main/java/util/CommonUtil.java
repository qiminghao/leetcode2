package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    // 摩尔投票法模板方法 n/k众数
    // Majority Element
    public static List<Integer> mooreVoting(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int[] candidates = new int[k - 1];
        int[] votes = new int[k - 1];
        Arrays.fill(candidates, nums[0]);
        for (int num : nums) {
            boolean voted = false;
            for (int i = 0; i < k - 1; i++) {
                if (candidates[i] == num) {
                    votes[i]++;
                    voted = true;
                    break;
                }
            }
            if (voted) {
                continue;
            }
            boolean zero = false;
            for (int i = 0; i < k - 1; i++) {
                if (votes[i] == 0) {
                    candidates[i] = num;
                    votes[i]++;
                    zero = true;
                    break;
                }
            }
            if (zero) {
                continue;
            }
            for (int i = 0; i < k - 1; i++) {
                votes[i]--;
            }
        }
        Arrays.fill(votes, 0);
        for (int num : nums) {
            for (int i = 0; i < k - 1; i++) {
                if (candidates[i] == num) {
                    votes[i]++;
                    break;
                }
            }
        }
        for (int i = 0; i < k - 1; i++) {
            if (votes[i] > nums.length / k) {
                res.add(candidates[i]);
            }
        }
        return res;
    }
}
