package array;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalNum = nums1.length + nums2.length;
        int[] allNums = new int[totalNum];
        int pos = -1;
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                allNums[++pos] = nums1[i++];
            } else {
                allNums[++pos] = nums2[j++];
            }
        }
        while(i<nums1.length){
            allNums[++pos] = nums1[i++];
        }
        while(j<nums2.length) {
            allNums[++pos] = nums2[j++];
        }
        double res;
        if(totalNum % 2 == 0){
            res = (allNums[totalNum/2-1]+allNums[totalNum/2])/2.0;
        }else{
            res = allNums[totalNum/2];
        }
        return res;
    }
}
