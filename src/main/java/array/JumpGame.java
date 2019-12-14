package array;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int pos = 0;
        while (pos < nums.length) {
            if (pos == nums.length - 1) return true;
            pos += nums[pos];
            if (pos < nums.length - 1 && nums[pos] == 0) return false;
        }
        return true;
    }
}
