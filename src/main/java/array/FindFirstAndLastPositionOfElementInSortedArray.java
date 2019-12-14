package array;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int firstPos = binarySearch(nums, target, true);
        if(firstPos==nums.length || nums[firstPos]!=target){
            return res;
        }
        res[0] = firstPos;
        res[1] = binarySearch(nums, target, false) - 1;
        return res;
    }

    public static int binarySearch(int[] nums, int target, boolean left) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target || (left && nums[mid] == target)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
