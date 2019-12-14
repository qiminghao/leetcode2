import array.ThreeSum;
import util.CommonUtil;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        int[] nums1 = {1, 1, 1, 2, 2, 3, 4};
//        System.out.printf("%.1f", MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
//        int[] res = FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums1, 1);
//        System.out.println("" + res[0] + res[1]);
//        int[][] matrix = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
//        printMatrix(matrix);
//        RotateImage.rotate(matrix);
//        printMatrix(matrix);
//        int[][] matrix1 = new int[0][0];
//        System.out.println(SpiralMatrix.spiralOrder(matrix1));
//        printMatrix(SpiralMatrixII.generateMatrix(3));
//        printMatrix(matrix1);
//        System.out.println(JumpGame.canJump(new int[]{2, 5, 0, 0}));
//        System.out.println(AddStrings.addStrings("9937820", "64321"));
//        System.out.println(MultiplyStrings.multiply("123000", "456000"));
//        List<List<Integer>> a = largeGroupPositions("abbxxxxzzy");
//        for (List<Integer> row : a) {
//            for (Integer val : row) {
//                System.out.print(val + "  ");
//            }
//            System.out.println();
//        }
//        System.out.println(pivotIndex(new int[]{1}));
//        System.out.println(numMagicSquaresInside(new int[][]{{1, 8, 6}, {10, 5, 0}, {4, 2, 9}}));

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(), m = in.nextInt();
//        int len = (int) Math.pow(2, n);
//        int[] A = new int[len];
//        for (int i = 0; i < len; i++) {
//            A[i] = in.nextInt();
//        }
//        for (int i = 0; i < m; i++) {
//            int a = in.nextInt(), b = in.nextInt();
//
//        }

//        solution();

//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list1.add("1");
//        list2.add(1);
//        System.out.println(list1.get(0).getClass());
//        System.out.println(list2.get(0).getClass());
//        System.out.println(list1.getClass() == list2.getClass());

//        System.out.println(permute(new int[] {89,72,71,44,50,72,26,79,33,27,84}));
//        System.out.println(numSquarefulPerms(new int[] {89,72,71,44,50,72,26,79,33,27,84}));

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        ListNode p = head;
//        while (p != null) {
//            System.out.print(p.val + " ");
//            p = p.next;
//        }
//        System.out.println();
//        p = reverseBetween(head, 4, 5);
//
//        while (p != null) {
//            System.out.print(p.val + " ");
//            p = p.next;
//        }
//        System.out.println();
//
//        System.out.println(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
//
//        System.out.println(countSubstrings("abc"));

//        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 1));
//        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
//        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 3));
//        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 4));
//        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 5));
//        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 6));
//        System.out.println();
//        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 1));
//        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 2));
//        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 3));
//        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
//        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 5));
//        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 6));
//        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 7));
//        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 8));
//        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 9));

//        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));

//        System.out.println(frequencySort("Aabb"));

//        System.out.println(firstUniqChar("loveleetcode"));

//        System.out.println(CommonUtil.intArrayToString(intersection(CommonUtil.newIntArray(4, 9, 5), CommonUtil.newIntArray(9, 4, 9, 8, 4))));

        System.out.println(isPossible(CommonUtil.newIntArray(1, 2, 3, 3, 4, 5)));
        System.out.println(isPossible(CommonUtil.newIntArray(1, 2, 3, 3, 4, 4, 5, 5)));
        System.out.println(isPossible(CommonUtil.newIntArray(1, 2, 3, 4, 4, 5)));

//        System.out.println(topKFrequent(CommonUtil.newArray("i", "love", "leetcode", "i", "love", "coding"), 2));
//        System.out.println(topKFrequent(CommonUtil.newArray("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"), 4));

//        System.out.println(longestPalindromeSubseq("bbbab"));
//        System.out.println(longestPalindromeSubseq("cbbd"));

//        System.out.println(longestCommonSubsequence("abcde", "ace"));
//        System.out.println(longestCommonSubsequence("abc", "abc"));
//        System.out.println(longestCommonSubsequence("abc", "def"));

//        System.out.println(longestPalindrome("babad"));
//        System.out.println(longestPalindrome("cbbd"));

//        System.out.println(minDistance("sea", "eat"));

//        System.out.println(minimumDeleteSum("sea", "eat"));
//        System.out.println(minimumDeleteSum("delete", "leet"));

//        System.out.println(CommonUtil.intArrayToString(wiggleSort(CommonUtil.newIntArray(1, 5, 1, 1, 6, 4))));
//        System.out.println(CommonUtil.intArrayToString(wiggleSort(CommonUtil.newIntArray(1, 3, 2, 2, 3, 1))));
//        System.out.println(CommonUtil.intArrayToString(wiggleSort(CommonUtil.newIntArray(4, 5, 6, 5))));

//        Twitter twitter = new Twitter();
//        twitter.postTweet(1, 5);
//        twitter.postTweet(2, 6);
//        twitter.follow(1, 2);
//        System.out.println(twitter.getNewsFeed(1));
//        System.out.println(twitter.getNewsFeed(2));
//        twitter.follow(2, 1);
//        System.out.println(twitter.getNewsFeed(1));
//        System.out.println(twitter.getNewsFeed(2));
//        twitter.unfollow(2, 1);
//        System.out.println(twitter.getNewsFeed(1));
//        System.out.println(twitter.getNewsFeed(2));

//        System.out.println(CommonUtil.intArrayToString(rearrangeBarcodes(CommonUtil.newIntArray(1, 1, 1, 2, 2, 2))));
//        System.out.println(CommonUtil.intArrayToString(rearrangeBarcodes(CommonUtil.newIntArray(1, 1, 1, 1, 2, 2, 3, 3))));
//        System.out.println(CommonUtil.intArrayToString(rearrangeBarcodes(CommonUtil.newIntArray(7, 7, 7, 8, 5, 7, 5, 5, 5, 8))));

//        System.out.println(groupAnagrams(CommonUtil.newArray("eat", "tea", "tan", "ate", "nat", "bat")));

//        System.out.println(isAnagram("anagram", "nagaram"));
//        System.out.println(isAnagram("rat", "car"));
//        System.out.println(isAnagram("", ""));

//        System.out.println(checkInclusion("ab", "eidbaooo"));
//        System.out.println(checkInclusion("ab", "eidboaoo"));

//        System.out.println(kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
//        System.out.println(kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));

//        System.out.println(isValidSudoku(new char[][]{
//                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        }));
//        System.out.println(isValidSudoku(new char[][]{
//                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
//                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
//                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
//                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
//                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
//                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
//                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
//        }));

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        splitListToParts(head, 5);
//        splitListToParts(null, 3);

//        System.out.println(numRescueBoats(CommonUtil.newIntArray(1, 2), 3));
//        System.out.println(numRescueBoats(CommonUtil.newIntArray(3, 2, 2, 1), 3));
//        System.out.println(numRescueBoats(CommonUtil.newIntArray(3, 5, 3, 4), 5));

//        System.out.println(CommonUtil.intArrayToString(intersect(CommonUtil.newIntArray(1, 2, 2, 1), CommonUtil.newIntArray(2, 2))));
//        System.out.println(CommonUtil.intArrayToString(intersect(CommonUtil.newIntArray(4, 9, 5), CommonUtil.newIntArray(9, 4, 9, 8, 4))));

//        System.out.println(commonChars(CommonUtil.newArray("bella", "label", "roller")));
//        System.out.println(commonChars(CommonUtil.newArray("cool", "lock", "cook")));

//        MyCalendar cal1 = new MyCalendar();
//        System.out.println(cal1.book(10, 20)); // returns true
//        System.out.println(cal1.book(15, 25)); // returns false
//        System.out.println(cal1.book(20, 30)); // returns true
//        System.out.println();
//        MyCalendar cal2 = new MyCalendar();
//        int[][] temp = new int[][]{{47, 50}, {33, 41}, {39, 45}, {33, 42}, {25, 32}, {26, 35}, {19, 25}, {3, 8}, {8, 13}, {18, 27}};
//        for (int[] pair : temp) {
//            System.out.println(cal2.book(pair[0], pair[1]));
//        }

//        System.out.println(CommonUtil.intArrayToString(maxDepthAfterSplit("(()())")));
//        System.out.println(CommonUtil.intArrayToString(maxDepthAfterSplit("()(())()")));
//        System.out.println(CommonUtil.intArrayToString(maxDepthAfterSplit("(((((((((())))))))))")));

//        System.out.println(searchMatrix(new int[][] {
//                {1,   3,  5,  7},
//                {10, 11, 16, 20},
//                {23, 30, 34, 50}
//        }, 3));
//        System.out.println(searchMatrix(new int[][] {
//                {1,   3,  5,  7},
//                {10, 11, 16, 20},
//                {23, 30, 34, 50}
//        }, 13));
//        System.out.println(searchMatrix(new int[][] {
//                {1,   3}
//        }, 3));

//        System.out.println(bagOfTokensScore(IntStream.of(100).toArray(), 50));
//        System.out.println(bagOfTokensScore(IntStream.of(100, 200).toArray(), 150));
//        System.out.println(bagOfTokensScore(IntStream.of(100, 200, 300, 400).toArray(), 200));

//        System.out.println(canJump(IntStream.of(2, 3, 1, 1, 4).toArray()));
//        System.out.println(canJump(IntStream.of(1, 2, 3).toArray()));

//        System.out.println(jump(IntStream.of(2, 3, 1, 1, 4).toArray()));
//        System.out.println(jump(IntStream.of(7,0,9,6,9,6,1,7,9,0,1,2,9,0,3).toArray()));
//        System.out.println(jump(IntStream.of(5, 2, 1, 1, 1, 3, 4).toArray()));
//        System.out.println(jump(IntStream.of(2, 1).toArray()));
//        System.out.println(jump(IntStream.of(0).toArray()));
//        System.out.println(jump(IntStream.of(1).toArray()));
//        System.out.println(jump(IntStream.of(1, 2, 3).toArray()));

        System.out.println(maximalRectangle(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        }));

//        System.out.println(wiggleMaxLength(IntStream.of(1, 7, 4, 9, 2, 5).toArray()));
//        System.out.println(wiggleMaxLength(IntStream.of(1, 17, 5, 10, 13, 15, 10, 5, 16, 8).toArray()));
//        System.out.println(wiggleMaxLength(IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).toArray()));

//        System.out.println(nthUglyNumber(10));
//        System.out.println(integerReplacement(3));
//        System.out.println(integerReplacement(8));
//        System.out.println(integerReplacement(7));
//        System.out.println(integerReplacement(65535));

//        System.out.println(isUgly(6));
//        System.out.println(isUgly(8));
//        System.out.println(isUgly(14));

//        System.out.println(isHappy(19));

//        System.out.println(nthUglyNumber(3, 2, 3, 5));
//        System.out.println(nthUglyNumber(4, 2, 3, 4));
//        System.out.println(nthUglyNumber(5, 2, 11, 13));
//        System.out.println(nthUglyNumber(1000000000, 2, 217983653, 336916467));

//        Solution obj = new Solution();
//        System.out.println(obj.nthUglyNumber(1000000000, 2, 217983653, 336916467));

        System.out.println(maximalSquare(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        }));

//        System.out.println(minEatingSpeed(IntStream.of(3, 6, 7, 11).toArray(), 8));
//        System.out.println(minEatingSpeed(IntStream.of(30, 11, 23, 4, 20).toArray(), 5));
//        System.out.println(minEatingSpeed(IntStream.of(30, 11, 23, 4, 20).toArray(), 6));

//        System.out.println(shipWithinDays(IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).toArray(), 5));
//        System.out.println(shipWithinDays(IntStream.of(3, 2, 2, 4, 1, 4).toArray(), 3));
//        System.out.println(shipWithinDays(IntStream.of(1, 2, 3, 1, 1).toArray(), 4));

//        System.out.println(CommonUtil.intArrayToString(numSmallerByFrequency(new String[]{"cbd"}, new String[]{"zaaaz"})));
//        System.out.println(CommonUtil.intArrayToString(numSmallerByFrequency(new String[]{"bbb", "cc"}, new String[]{"a", "aa", "aaa", "aaaa"})));
//        System.out.println(CommonUtil.intArrayToString(numSmallerByFrequency(new String[]{"bba", "abaaaaaa", "aaaaaa", "bbabbabaab", "aba", "aa", "baab", "bbbbbb", "aab", "bbabbaabb"}, new String[]{"aaabbb", "aab", "babbab", "babbbb", "b", "bbbbbbbbab", "a", "bbbbbbbbbb", "baaabbaab", "aa"})));
//        System.out.println(search(IntStream.of(4, 5, 6, 7, 0, 1, 2).toArray(), 0));
//        System.out.println(search(IntStream.of(4, 5, 6, 7, 0, 1, 2).toArray(), 3));

//        System.out.println(findMin(IntStream.of(3,4,5,1,2).toArray()));
//        System.out.println(findMin(IntStream.of(4, 5, 6, 7, 0, 1, 2).toArray()));

//        System.out.println(numComponents(createLinkedList(new int[]{0, 1, 2, 3}), new int[]{0, 1, 3}));
//        System.out.println(numComponents(createLinkedList(new int[]{0, 1, 2, 3, 4}), new int[]{0, 3, 1, 4}));

        System.out.println(Arrays.toString(nextLargerNodes(createLinkedList(new int[]{2, 1, 5}))));
        System.out.println(Arrays.toString(nextLargerNodes(createLinkedList(new int[]{2, 7, 4, 3, 5}))));
        System.out.println(Arrays.toString(nextLargerNodes(createLinkedList(new int[]{1, 7, 5, 1, 9, 2, 5, 1}))));

//        System.out.println(partition(createLinkedList(new int[]{1, 4, 3, 2, 5, 2}),3));

//        System.out.println(addTwoNumbers(createLinkedList(new int[]{2, 4, 3}), createLinkedList(new int[]{5, 6, 4})));
//        System.out.println(addTwoNumbers(createLinkedList(new int[]{7, 2, 4, 3}), createLinkedList(new int[]{5, 6, 4})));
//        System.out.println(addTwoNumbers(createLinkedList(new int[]{5}), createLinkedList(new int[]{5})));
//        System.out.println(addTwoNumbers(createLinkedList(new int[]{}), createLinkedList(new int[]{})));

//        System.out.println(addBinary("11", "1"));
//        System.out.println(addBinary("1010", "1011"));

//        System.out.println(addToArrayForm(new int[]{1, 2, 0, 0}, 34));
//        System.out.println(addToArrayForm(new int[]{2, 7, 4}, 181));
//        System.out.println(addToArrayForm(new int[]{2, 1, 5}, 806));
//        System.out.println(addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1));

        System.out.println(getSum(1, 2));
        System.out.println(getSum(-2, 3));

//        System.out.println(multiply("2", "3"));
//        System.out.println(multiply("123", "456"));

//        System.out.println(printLinkedList(insertionSortList(createLinkedList(new int[]{4, 2, 1, 3}))));
//        System.out.println(printLinkedList(insertionSortList(createLinkedList(new int[]{-1, 5, 3, 4, 0}))));

//        System.out.println(canMakePaliQueries("abcda", new int[][]{{3, 3, 0}, {1, 2, 0}, {0, 3, 1}, {0, 3, 2}, {0, 4, 1}}));

//        System.out.println(Arrays.toString(sumEvenAfterQueries(new int[]{1, 2, 3, 4}, new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}})));

//        System.out.println(heightChecker(new int[]{1, 1, 4, 2, 1, 3}));

//        System.out.println(isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
//        System.out.println(isNStraightHand(new int[]{1,2,3,4,5}, 4));

//        System.out.println(fractionToDecimal(1, 2));
//        System.out.println(fractionToDecimal(2, 1));
//        System.out.println(fractionToDecimal(2, 3));

//        System.out.println(findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}));
//        System.out.println(findLength(new int[]{0,1,1,1,1}, new int[]{1,0,1,0,1}));

        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));

//        SnapshotArray snapshotArr = new SnapshotArray(3); // set the length to be 3
//        snapshotArr.set(0,5);  // Set array[0] = 5
//        System.out.println(snapshotArr.snap());  // Take a snapshot, return snap_id = 0
//        snapshotArr.set(0,6);
//        System.out.println(snapshotArr.get(0,0));  // Get the value of array[0] with snap_id = 0, return 5

//        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

//        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
//        System.out.println(subarraySum(new int[]{1, 1, 2}, 2));
//        System.out.println(subarraySum(new int[]{-1, -1, 1}, 0));

//        System.out.println(wordPattern("abba", "dog cat cat dog"));
//        System.out.println(wordPattern("abba", "dog cat cat fish"));
//        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
//        System.out.println(wordPattern("abba", "dog dog dog dog"));

//        System.out.println(isIsomorphic("egg", "add"));
//        System.out.println(isIsomorphic("foo", "bar"));
//        System.out.println(isIsomorphic("paper", "title"));

//        System.out.println(customSortString("cba", "abcdefg"));

//        System.out.println(findDuplicate(new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"}));

//        System.out.println(gcdOfStrings("ABCABC", "ABC"));
//        System.out.println(gcdOfStrings("ABABAB", "AB"));
//        System.out.println(gcdOfStrings("LEET", "CODE"));

//        System.out.println(canConstruct("a", "b"));
//        System.out.println(canConstruct("aa", "ab"));
//        System.out.println(canConstruct("aa", "aab"));

        System.out.println(smallestSubsequence("cdadabcc"));
        System.out.println(smallestSubsequence("abcd"));
        System.out.println(smallestSubsequence("ecbacba"));
        System.out.println(smallestSubsequence("leetcode"));

//        System.out.println(checkValidString("()"));
//        System.out.println(checkValidString("(*)"));
//        System.out.println(checkValidString("(*))"));

//        System.out.println(simplifyPath("/home/"));
//        System.out.println(simplifyPath("/../"));
//        System.out.println(simplifyPath("/home//foo/"));
//        System.out.println(simplifyPath("/a/./b/../../c/"));
//        System.out.println(simplifyPath("/a/../../b/../c//.//"));
//        System.out.println(simplifyPath("/a//b////c/d//././/.."));
//        System.out.println(simplifyPath("/"));
//        System.out.println(simplifyPath("/..."));

//        System.out.println(expressiveWords("heeellooo", new String[]{"hello", "hi", "helo"}));

//        System.out.println(reorganizeString("aab"));
//        System.out.println(reorganizeString("aaab"));

//        System.out.println(camelMatch(new String[]{"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"}, "FB"));
//        System.out.println(camelMatch(new String[]{"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"}, "FoBa"));
//        System.out.println(camelMatch(new String[]{"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"}, "FoBaT"));

//        System.out.println(reverseWords("Let's take LeetCode contest"));

//        System.out.println(removeComments(new String[]{"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"}));
//        System.out.println(removeComments(new String[]{"a/*comment", "line", "more_comment*/b"}));
//        System.out.println(removeComments(new String[]{"//"}));

//        System.out.println(numberToWords(123));
//        System.out.println(numberToWords(12345));
//        System.out.println(numberToWords(1234567));
//        System.out.println(numberToWords(1234567891));
//        System.out.println(numberToWords(0));
//        System.out.println(numberToWords(1000000));

//        System.out.println(minMoves(new int[]{1, 2, 3}));

//        System.out.println(minMoves2(new int[]{1, 2, 3}));
//        System.out.println(minMoves2(new int[]{1, 2, 5, 8}));
//        System.out.println(minMoves2(new int[]{1, 4, 7, 8}));

//        System.out.println(Arrays.toString(distributeCandies(7, 4)));
//        System.out.println(Arrays.toString(distributeCandies(10, 3)));
//        System.out.println(Arrays.toString(distributeCandies(12, 3)));

        System.out.println(countDigitOne(13));

//        System.out.println(primePalindrome(6));
//        System.out.println(primePalindrome(8));
//        System.out.println(primePalindrome(13));

//        System.out.println(isRobotBounded("GGLLGG"));
//        System.out.println(isRobotBounded("GG"));
//        System.out.println(isRobotBounded("GL"));
//        System.out.println(isRobotBounded("GLGLGGLGL"));

//        System.out.println(arrangeCoins(5));
//        System.out.println(arrangeCoins(8));

//        System.out.println(smallestGoodBase("13"));
//        System.out.println(smallestGoodBase("15"));
//        System.out.println(smallestGoodBase("4681"));
//        System.out.println(smallestGoodBase("1000000000000000000"));
//        System.out.println(smallestGoodBase("14919921443713777"));
//        System.out.println(smallestGoodBase("16035713712910627"));

//        System.out.println(isPowerOfThree(27));
//        System.out.println(isPowerOfThree(0));
//        System.out.println(isPowerOfThree(9));
//        System.out.println(isPowerOfThree(45));

//        System.out.println(reorderedPowerOf2(1));
//        System.out.println(reorderedPowerOf2(10));
//        System.out.println(reorderedPowerOf2(16));
//        System.out.println(reorderedPowerOf2(24));
//        System.out.println(reorderedPowerOf2(46));

//        System.out.println(nthSuperUglyNumber(12, new int[]{2, 7, 13, 19}));
//        System.out.println(nthSuperUglyNumber(100000, new int[]{7,19,29,37,41,47,53,59,61,79,83,89,101,103,109,127,131,137,139,157,167,179,181,199,211,229,233,239,241,251}));

//        System.out.println(leastInterval("AAABBB".toCharArray(), 2));
//        System.out.println(leastInterval("AAAABBBBCCD".toCharArray(), 2));
//        System.out.println(leastInterval("AAAABBBBCCD".toCharArray(), 3));

//        System.out.println(getPermutation(3, 8));
//        System.out.println(getPermutation(4, 9));

        System.out.println(printLinkedList(reverseKGroup(createLinkedList(new int[]{1, 2, 3, 4, 5}), 2)));
        System.out.println(printLinkedList(reverseKGroup(createLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8}), 3)));
        System.out.println(printLinkedList(reverseKGroup(createLinkedList(new int[]{1, 2, 3, 4, 5}), 3)));

//        System.out.println(Arrays.toString(singleNumber(new int[]{1, 2, 1, 3, 2, 5})));

        System.out.println(reverseParentheses("(abcd)"));
        System.out.println(reverseParentheses("(u(love)i)"));
        System.out.println(reverseParentheses("(u(love)i)"));
        System.out.println(reverseParentheses("(ed(et(oc))el)"));
        System.out.println(reverseParentheses("a(bcdefghijkl(mno)p)q"));

//        System.out.println(canPartition(new int[]{1, 5, 11, 5}));
//        System.out.println(canPartition(new int[]{1, 2, 3, 5}));

//        System.out.println(twoCitySchedCost(new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}}));

//        System.out.println(selfDividingNumbers(1,22));

//        System.out.println(checkPerfectNumber(28));

//        System.out.println(hammingDistance(3, 4));

//        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));

//        System.out.println(toGoatLatin("I speak Goat Latin"));
//        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));

//        System.out.println(countCharacters(new String[]{"cat","bt","hat","tree"}, "atach"));
//        System.out.println(countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));

//        System.out.println(fib(2));
//        System.out.println(fib(3));
//        System.out.println(fib(4));

//        System.out.println(tribonacci(4));
//        System.out.println(tribonacci(25));

//        System.out.println(findComplement(5));
//        System.out.println(findComplement(1));

//        System.out.println(Arrays.toString(numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz")));
//        System.out.println(Arrays.toString(numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa")));

//        System.out.println(numSpecialEquivGroups(new String[]{"a","b","c","a","c","c"}));
//        System.out.println(numSpecialEquivGroups(new String[]{"aa","bb","ab","ba"}));
//        System.out.println(numSpecialEquivGroups(new String[]{"abc","acb","bac","bca","cab","cba"}));
//        System.out.println(numSpecialEquivGroups(new String[]{"abcd","cdab","adcb","cbad"}));

//        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
//        System.out.println(Arrays.toString(shortestToChar("aaba", 'b')));

//        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
//        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
//        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd'));
//        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g'));
//        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j'));
//        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'k'));

//        System.out.println(mySqrt(1));
//        System.out.println(mySqrt(4));
//        System.out.println(mySqrt(8));
//        System.out.println(mySqrt(18));
//        System.out.println(mySqrt(2147395599));

//        System.out.println(judgeSquareSum(2147483646));

//        System.out.println(repeatedStringMatch("aa", "a"));
//        System.out.println(repeatedStringMatch("aa", "aa"));
//        System.out.println(repeatedStringMatch("aa", "aaa"));
//        System.out.println(repeatedStringMatch("aaa", "aa"));
//        System.out.println(repeatedStringMatch("ab", "babababa"));
//        System.out.println(repeatedStringMatch("aaaaaab", "ba"));

        System.out.println(largestTimeFromDigits(new int[]{1, 2, 3, 4}));
        System.out.println(largestTimeFromDigits(new int[]{5, 5, 5, 5}));
        System.out.println(largestTimeFromDigits(new int[]{0, 3, 0, 3}));

        Executors.newSingleThreadExecutor();


    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() || c == '(' || c =='[') {
                stack.push(c);
            } else if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }

    // 949. Largest Time for Given Digits
    public static String largestTimeFromDigits(int[] A) {
        Arrays.sort(A);
        reverse(A, 0, A.length - 1);
        do {
            if (isValidTime(A)) {
                return fourNumberToTime(A);
            }
        } while (prePermutation(A));
        return "";
    }

    public static boolean prePermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] <= nums[i + 1]) {
            i--;
        }
        if (i != -1) {
            int j = i + 1;
            while (j < nums.length && nums[j] < nums[i]) {
                j++;
            }
            j--;
            swap(nums, i, j);
            reverse(nums, i + 1, nums.length - 1);
            return true;
        }
        return false;
    }

    public static boolean isValidTime(int[] nums) {
        int h = nums[0] * 10 + nums[1];
        int m = nums[2] * 10 + nums[3];
        return h >= 0 && h < 24 && m >= 0 && m < 60;
    }

    public static String fourNumberToTime(int[] nums) {
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        sb.append(nums[1]);
        sb.append(":");
        sb.append(nums[2]);
        sb.append(nums[3]);
        return sb.toString();
    }

    // 680. Valid Palindrome II
    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)) return false;
        }
        return true;
    }

    // 1037. Valid Boomerang
    public static boolean isBoomerang(int[][] points) {
        return points[0][0] * (points[1][1] - points[2][1]) + points[1][0] * (points[2][1] - points[0][1]) + points[2][0] * (points[0][1] - points[1][1]) != 0;
    }

    // 686. Repeated String Match
    public static int repeatedStringMatch(String A, String B) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if(sb.toString().contains(B)) return count;
        if(sb.append(A).toString().contains(B)) return ++count;
        return -1;
    }

    // 633. Sum of Square Numbers
    public static boolean judgeSquareSum(int c) {
        for (long i = 0; i * i <= c; i++) {
            if (isPerfectSquare((int) (c - i * i))) {
                return true;
            }
            System.out.println(i);
        }
        return false;
    }

    // 367. Valid Perfect Square
    public static boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        while (l <= r) {
            int mid = (l + r) / 2;
            long temp = (long) mid * mid;
            if (temp == num) {
                return true;
            } else if (temp > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    // 69. Sqrt(x)
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        }
        int l = 2, r = x / 2;
        while (l <= r) {
            int mid = (l + r) / 2;
            if ((long) mid * mid > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    // 1047. Remove All Adjacent Duplicates In String
    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = S.length() - 1; i >= 0; i--) {
            if (stack.isEmpty() || stack.peek() != S.charAt(i)) {
                stack.push(S.charAt(i));
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    // 1122. Relative Sort Array
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int x : arr1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int index = 0;
        for (int x : arr2) {
            for (int i = map.get(x); i > 0; i--) {
                arr1[index++] = x;
            }
            map.remove(x);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            for (int i = 0; i < val; i++) {
                arr1[index++] = key;
            }
        }
        return arr1;
    }

    // 1030. Matrix Cells in Distance Order
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R * C][2];
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                res[index++] = new int[]{i, j};
            }
        }
        Arrays.sort(res, Comparator.comparingInt(o -> Math.abs(o[0] - r0) + Math.abs(o[1] - c0)));
        return res;
    }

    // 392. Is Subsequence
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == s.length();
    }

    // 744. Find Smallest Letter Greater Than Target
    public static char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (letters[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return letters[l % letters.length];
    }

    // 821. Shortest Distance to a Character
    public static int[] shortestToChar(String S, char C) {
        List<Integer> list = new ArrayList<>();
        int len = S.length();
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == C) {
                list.add(i);
            }
        }
        int[] res = new int[len];
        int cur = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i > list.get(cur) && cur < list.size() - 1) {
                cur++;
            }
            res[i] = Math.min(Math.abs(i - (cur == 0 ? -100000 : list.get(cur - 1))), Math.abs(i - list.get(cur)));
        }
        return res;
    }

    // 893. Groups of Special-Equivalent Strings
    public static int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String s : A) {
            set.add(countCharsFor893(s));
        }
        return set.size();
    }

    public static String countCharsFor893(String s) {
        Map<Character, Integer>[] map = new TreeMap[2];
        map[0] = new TreeMap<>();
        map[1] = new TreeMap<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            map[(i & 1)].put(s.charAt(i), map[(i & 1)].getOrDefault(s.charAt(i), 0) + 1);
        }
        return Arrays.toString(map);
    }

    // 806. Number of Lines To Write String
    public static int[] numberOfLines(int[] widths, String S) {
        final int MAX_WIDTH = 100;
        int len = S.length(), curWidth = 0, curLine = 1, i = 0;
        while (i < len) {
            int width = widths[S.charAt(i) - 'a'];
            if (curWidth + width <= MAX_WIDTH) {
                curWidth += width;
            } else {
                curWidth = width;
                curLine++;
            }
            i++;
        }
        return new int[]{curLine, curWidth};
    }

    // 476. Number Complement
    public static int findComplement(int num) {
        return num ^ ((Integer.highestOneBit(num) << 1) - 1);
    }

    // 1137. N-th Tribonacci Number
    public static int tribonacci(int n) {
        if (n < 2) {
            return n;
        }
        if (n < 3) {
            return 1;
        }
        int nMinusOne = 1, nMinusTwo = 1, nMinusThree = 0, i = 2, res = 0;
        while (i < n) {
            res = nMinusOne + nMinusTwo + nMinusThree;
            nMinusThree = nMinusTwo;
            nMinusTwo = nMinusOne;
            nMinusOne = res;
            i++;
        }
        return res;
    }

    // 509. Fibonacci Number
    public static int fib(int N) {
        if (N < 2) {
            return N;
        }
        int nMinusOne = 1, nMinusTwo = 0, i = 1, res = 0;
        while (i < N) {
            res = nMinusOne + nMinusTwo;
            nMinusTwo = nMinusOne;
            nMinusOne = res;
            i++;
        }
        return res;
    }

    // 1160. Find Words That Can Be Formed by Characters
    public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer>[] maps = new Map[words.length];
        for (int i = words.length - 1; i >= 0; i--) {
            maps[i] = countChars(words[i]);
        }
        Map<Character, Integer> map = countChars(chars);
        int res = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            Map<Character, Integer> m = maps[i];
            boolean flag = true;
            for (Map.Entry<Character, Integer> entry : m.entrySet()) {
                if (map.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res += words[i].length();
            }
        }
        return res;
    }

    public static Map<Character, Integer> countChars(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return map;
    }

    // 824. Goat Latin
    public static String toGoatLatin(String S) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'o', 'e', 'i', 'u', 'A', 'O', 'E', 'I', 'U'));
        String[] strs = S.split(" ");
        for (int i = 0; i < strs.length; i++) {
            StringBuilder sb = new StringBuilder(strs[i]);
            if (!set.contains(strs[i].charAt(0))) {
                sb.deleteCharAt(0);
                sb.append(strs[i].charAt(0));
            }
            sb.append("ma");
            for (int j = 0; j <= i; j++) {
                sb.append('a');
            }
            strs[i] = sb.toString();
        }
        return String.join(" ", strs);
    }

    // 344. Reverse String
    public static void reverseString(char[] s) {
        int x = s.length / 2;
        for (int i = 0; i < x; i++) {
            char c = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = c;
        }
    }

    // 929. Unique Email Addresses
    public static int numUniqueEmails(String[] emails) {
        Map<String, Set<String> > map = new HashMap<>();
        for (String email : emails) {
            int index = email.indexOf('@');
            String localName = email.substring(0, index);
            int i;
            if ((i =  localName.indexOf('+')) != -1) {
                localName = localName.substring(0, i);
            }
            localName = localName.replaceAll("\\.", "");
            String domainName = email.substring(index + 1);
            map.computeIfAbsent(domainName, k -> new HashSet<>()).add(localName);
        }
        int res = 0;
        for (Set set : map.values()) {
            res += set.size();
        }
        return res;
    }

    // 461. Hamming Distance
    public static int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    // 507. Perfect Number
    public static boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = num / 2; i >= 1; i--) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    // 728. Self Dividing Numbers
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            boolean flag = true;
            while (temp != 0) {
                int a = temp % 10;
                if (a == 0 || i % a != 0) {
                    flag = false;
                    break;
                }
                temp /= 10;
            }
            if (flag) {
                res.add(i);
            }
        }
        return res;
    }

    // 1029. Two City Scheduling
    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(o -> (o[0] - o[1])));
        int sum = 0, len = costs.length, half = len / 2;
        for (int i = 0; i < len; i++) {
            sum += costs[i][i / half];
        }
        return sum;
    }

    // 1078. Occurrences After Bigram
    public static String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> res = new ArrayList<>();
        for (int f = 0, s = 1; s < words.length - 1; f++, s++) {
            if (words[f].equals(first) && words[s].equals(second)) {
                res.add(words[s + 1]);
            }
        }
        return res.toArray(new String[0]);
    }

    // 416. Partition Equal Subset Sum
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        if ((sum & 1) == 1) {
            return false;
        }
        int[] dp = new int[sum / 2 + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = dp.length - 1; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[sum / 2] == sum / 2;
    }

    // 1190. Reverse Substrings Between Each Pair of Parentheses
    public static String reverseParentheses(String s) {
        int n = s.length();
        Stack<Integer> opened = new Stack<>();
        int[] pair = new int[n];
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '(')
                opened.push(i);
            if (s.charAt(i) == ')') {
                int j = opened.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0, d = 1; i < n; i += d) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = pair[i];
                d = -d;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    // 260. Single Number III
    public static int[] singleNumber(int[] nums) {
        int n = 0;
        for (int x : nums) {
            n ^= x;
        }
        int st = 1;
        while ((n & st) == 0) {
            st <<= 1;
        }
        int num1 = 0, num2 = 0;
        for (int x : nums) {
            if ((x & st) == 0) {
                num1 ^= x;
            } else {
                num2 ^= x;
            }
        }
        return new int[]{num1, num2};
    }

    // 25. Reverse Nodes in k-Group
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = new ListNode(0);
        node.next = head;
        head = node;
        return head;
    }

    // 60. Permutation Sequence
    public static String getPermutation(int n, int k) {
        char[] s = new char[n];
        for (int i = 0; i < n; i++) {
            s[i] = (char) (i + '1');
        }
        for (int i = 1; i < k; i++) {
            nextPermutation(s);
        }
        return String.valueOf(s);
    }

    public static void nextPermutation(char[] s) {
        int i = s.length - 2;
        while (i >= 0 && s[i] > s[i + 1]) {
            i--;
        }
        if (i != -1) {
            int j = i + 1;
            while (j < s.length && s[j] > s[i]) {
                j++;
            }
            j--;
            swap(s, i, j);
        }
        reverse(s, i + 1, s.length - 1);
    }

    public static void swap(char[] s, int i, int j) {
        char c = s[i];
        s[i] = s[j];
        s[j] = c;
    }

    // 621. Task Scheduler
    public static int leastInterval(char[] tasks, int n) {
        int max = -1;
        int[] count = new int[26];
        for (char c : tasks) {
            count[c - 'A']++;
            max = Math.max(count[c - 'A'], max);
        }
        int idles = (max - 1) * (n + 1);
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                idles -= count[i] == max ? max - 1 : count[i];
            }
        }
        return Math.max(idles, 0) + tasks.length;
    }

    // 313. Super Ugly Number
    public static int nthSuperUglyNumber(int n, int[] primes) {
        long[] arr = new long[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            long firstLarger = Integer.MAX_VALUE;
            for (int prime : primes) {
                int l = 0, r = i - 1;
                while (l <= r) {
                    int mid = (l + r) / 2;
                    if (arr[mid] * prime > arr[i - 1]) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
                firstLarger = Math.min(firstLarger, arr[l] * prime);
            }
            arr[i] = firstLarger;
        }
        return (int) arr[n - 1];
    }

    // 869. Reordered Power of 2
    public static boolean reorderedPowerOf2(int N) {
        long x = 1L;
        int[] countN = new int[10];
        while (N != 0) {
            countN[N % 10]++;
            N /= 10;
        }
        for (int i = 1; i <= 32; i++) {
            int[] temp = new int[10];
            long xCopy = x;
            while (xCopy != 0) {
                temp[(int) (xCopy % 10)]++;
                xCopy /= 10;
            }
            boolean flag = true;
            for (int j = 0; j < 10; j++) {
                if (countN[j] != temp[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
            x <<= 1;
        }
        return false;
    }

    // 342. Power of Four
    public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }

    // 326. Power of Three
    public static boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }

    // 483. Smallest Good Base
    public static String smallestGoodBase(String n) {
        long num = Long.valueOf(n);
        for (int i = (int) (Math.log(num) / Math.log(2) + 1); i > 2; i--) {
            long base = (long) (Math.pow(num, 1.0 / (i - 1)));
            long sum = 0;
            for (int j = 0; j < i; j++) {
                sum = sum * base + 1;
            }
            if (sum == num) {
                return String.valueOf(base);
            }
        }
        return String.valueOf(num - 1);
    }

    // 1093. Statistics from a Large Sample
    public static double[] sampleStats(int[] count) {
        int l = 0, r = 255, nl = 0, nr = 0, mn = 255, mx = -1, mid1 = 0, mid2 = 0, mode = 0;
        double avg = 0, mid = 0;
        while (l <= r) {
            while (count[l] == 0) l++;
            while (count[r] == 0) r--;
            if (nl < nr) {
                avg += count[l] * l;
                nl += count[l];
                if (count[l] > count[(int) mode]) mode = l;
                mn = Math.min(mn, l);
                mid1 = l;
                l++;
            } else {
                avg += count[r] * r;
                nr += count[r];
                if (count[r] > count[(int) mode]) mode = r;
                mx = Math.max(mx, r);
                mid2 = r;
                r--;
            }
        }
        avg /= (nl + nr);
        // Find median
        if (nl < nr) mid = mid2;
        else if (nl > nr) mid = mid1;
        else mid = (double) (mid1 + mid2) / 2;
        return new double[]{mn, mx, avg, mid, mode};
    }

    // 441. Arranging Coins
    public static int arrangeCoins(int n) {
        return (int) (Math.sqrt(2.0 * n + 0.25) - 0.5);
    }

    // 1041. Robot Bounded In Circle
    public static boolean isRobotBounded(String instructions) {
        int[] xDict = new int[]{1, 0, -1, 0};
        int[] yDict = new int[]{0, 1, 0, -1};
        int d = 1, x = 0, y = 0;
        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                x += xDict[d];
                y += yDict[d];
            } else if (c == 'L') {
                d = (d + 1) % 4;
            } else {
                d = (d - 1 + 4) % 4;
            }
        }
        return x == 0 && y == 0 || d != 1;
    }

    // 866. Prime Palindrome
    public static int primePalindrome(int N) {
        while (true) {
            if (isPalindrome(N) && isPrime(N))
                return N;
            N++;
            if (10_000_000 < N && N < 100_000_000)
                N = 100_000_000;
        }
    }

    public static boolean isPalindrome(int x) {
        int rx = 0, n = x;
        while (n != 0) {
            rx = 10 * rx + n % 10;
            n /= 10;
        }
        return rx == x;
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        int r = (int) Math.sqrt(x);
        for (int i = 2; i <= r; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 233. Number of Digit One
    public static int countDigitOne(int n) {
        if (n < 10) {
            return 1;
        }
        if (n < 20) {
            return n - 8;
        }
        if (n < 100) {
            return 11 + (n - 11) / 10;
        }
        return n / 10;
    }

    // 1103. Distribute Candies to People
    public static int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i = 0, cur = 1;
        while (candies > 0) {
            res[i % num_people] += Math.min(cur, candies);
            candies -= cur;
            cur++;
            i++;
        }
        return res;
    }

    // 462. Minimum Moves to Equal Array Elements II
    public static int minMoves2(int[] nums) {
        int n = nums.length;
        int res = 0;
        int medium = findKthElement(nums, n / 2, 0, n - 1);
        for (int x : nums) {
            res += Math.abs(x - medium);
        }
        return res;
    }

    public static int findKthElement(int[] nums, int K, int l, int r) {
        if (l == r) {
            return nums[l];
        }
        int pos = partition(nums, l, r);
        if (pos == K) {
            return nums[pos];
        } else if (pos > K) {
            return findKthElement(nums, K, l, pos - 1);
        } else {
            return findKthElement(nums, K, pos + 1, r);
        }
    }

    public static int partition(int[] nums, int l, int r) {
        int random = new Random().nextInt(r - l + 1) + l;
        swap(nums, random, l);
        int pivot = nums[l];
        while (l < r) {
            while (l < r && nums[r] >= pivot) {
                r--;
            }
            nums[l] = nums[r];
            while (l < r && nums[l] <= pivot) {
                l++;
            }
            nums[r] = nums[l];
        }
        nums[l] = pivot;
        return l;
    }

    // 453. Minimum Moves to Equal Array Elements
    public static int minMoves(int[] nums) {
        int sum = 0, min = nums[0];
        for (int x : nums) {
            sum += x;
            min = Math.min(min, x);
        }
        return sum - min * nums.length;
    }

    // 273. Integer to English Words
    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        Map<Integer, String> map = new HashMap<>() {{
            put(1, "");
            put(2, " Thousand");
            put(3, " Million");
            put(4, " Billion");
        }};
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        while (sb.length() % 3 != 0) {
            sb.insert(0, 0);
        }
        char[] s = sb.toString().toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length; i += 3) {
            String temp = threeDigitToWords(s[i] - '0', s[i + 1] - '0', s[i + 2] - '0');
            res.append(temp);
            if (!temp.equals("")) {
                res.append(map.get((s.length - i) / 3));
            }
        }
        return res.toString().trim();
    }

    public static String threeDigitToWords(int hundred, int ten, int unit) {
        Map<Integer, String> units = new HashMap<>() {{
            put(0, "");
            put(1, " One");
            put(2, " Two");
            put(3, " Three");
            put(4, " Four");
            put(5, " Five");
            put(6, " Six");
            put(7, " Seven");
            put(8, " Eight");
            put(9, " Nine");
            put(10, " Ten");
            put(11, " Eleven");
            put(12, " Twelve");
            put(13, " Thirteen");
            put(14, " Fourteen");
            put(15, " Fifteen");
            put(16, " Sixteen");
            put(17, " Seventeen");
            put(18, " Eighteen");
            put(19, " Nineteen");
        }};
        Map<Integer, String> tens = new HashMap<>() {{
            put(0, "");
            put(2, " Twenty");
            put(3, " Thirty");
            put(4, " Forty");
            put(5, " Fifty");
            put(6, " Sixty");
            put(7, " Seventy");
            put(8, " Eighty");
            put(9, " Ninety");
        }};
        final String HUNDRED = " Hundred";
        StringBuilder sb = new StringBuilder();
        if (hundred != 0) {
            sb.append(units.get(hundred) + HUNDRED);
        }
        if (ten <= 1) {
            sb.append(units.get(ten * 10 + unit));
        } else {
            sb.append(tens.get(ten));
            sb.append(units.get(unit));
        }
        return sb.toString();
    }

    public static List<String> removeComments(String[] source) {
        char[] s = String.join("\n", source).toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean inBlock = false;
        int i = 0, j = 1;
        while (j < s.length) {
            if (s[i] == '/' && s[j] == '*') {
                i += 2;
                j += 2;
                while (!(s[i] == '*' && s[j] == '/')) {
                    i++;
                    j++;
                }
                i += 2;
                j += 2;
                continue;
            }
            if (s[i] == '/' && s[j] == '/') {
                while (j < s.length && s[j] != '\n') {
                    i++;
                    j++;
                }
                i++;
                j++;
                continue;
            }
            sb.append(s[i]);
            i++;
            j++;
        }
        while (i < s.length) {
            sb.append(s[i++]);
        }
        return Arrays.stream(sb.toString().split("\n")).filter(o -> !o.equals("")).collect(Collectors.toList());
    }

    // 557. Reverse Words in a String III
    public static String reverseWords(String s) {
        char[] str = s.toCharArray();
        int start = 0, i = 0;
        while (i < str.length) {
            while (i < str.length && str[i] != ' ') {
                i++;
            }
            reverse(str, start, i - 1);
            i++;
            start = i;
        }
        return String.valueOf(str);
    }

    public static void reverse(char[] arr, int start, int end) {
        int n = (end - start + 1) / 2;
        for (int i = 0; i < n; i++) {
            char t = arr[start + i];
            arr[start + i] = arr[end - i];
            arr[end - i] = t;
        }
    }

    // 1023. Camelcase Matching
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        for (String query : queries) {
            res.add(match(pattern.toCharArray(), query.toCharArray()));
        }
        return res;
    }

    public static boolean match(char[] p, char[] q) {
        int i = 0, j = 0, lenP = p.length, lenQ = q.length;
        while (i < lenP && j < lenQ) {
            if (p[i] == q[j]) {
                i++;
                j++;
            } else if (Character.isUpperCase(q[j])) {
                return false;
            } else {
                j++;
            }
        }
        if (i >= lenP) {
            while (j < lenQ && Character.isLowerCase(q[j])) {
                j++;
            }
            return j == lenQ;
        } else {
            return false;
        }
    }

    // 767. Reorganize String
    public static String reorganizeString(String S) {
        char[] s = S.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Comparator.comparingInt(o -> -o.getValue()));
        if (list.get(0).getValue() > (s.length + 1) / 2) {
            return "";
        }
        char[] res = new char[s.length];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : list) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                res[index] = c;
                index += 2;
                if (index >= res.length) {
                    index = 1;
                }
            }
        }
        return String.valueOf(res);
    }

    // 809. Expressive Words
    public static int expressiveWords(String S, String[] words) {
        List<ExpressiveWordsNode> count = countWord(S.toCharArray());
        int size = count.size();
        int res = 0;
        for (String word : words) {
            List<ExpressiveWordsNode> cur = countWord(word.toCharArray());
            if (size != cur.size()) {
                continue;
            }
            boolean flag = true;
            for (int i = 0; i < size; i++) {
                ExpressiveWordsNode node1 = count.get(i);
                ExpressiveWordsNode node2 = cur.get(i);
                if (node1.c != node2.c) {
                    flag = false;
                    break;
                }
                if (!(node1.count >= 3 && node2.count <= node1.count) && !(node1.count < 3 && node2.count == node1.count)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res++;
            }
        }
        return res;
    }

    public static List<ExpressiveWordsNode> countWord(char[] s) {
        List<ExpressiveWordsNode> count = new ArrayList<>();
        int start = 0, i = 1, len = s.length;
        while (i < len) {
            while (i < len && s[i] == s[start]) {
                i++;
            }
            count.add(new ExpressiveWordsNode(s[start], i - start));
            start = i;
            i++;
        }
        if (start < len) {
            count.add(new ExpressiveWordsNode(s[start], len - start));
        }
        return count;
    }

    static class ExpressiveWordsNode {
        char c;
        int count;

        public ExpressiveWordsNode(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

    // 71. Simplify Path
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        Set<String> set = new HashSet<>(Arrays.asList("..", ".", ""));
        for (String s : path.split("/")) {
            if (s.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!set.contains(s)) {
                stack.push(s);
            }
        }
        return "/" + String.join("/", stack.toArray(new String[0]));
    }

    // 678. Valid Parenthesis String
    public static boolean checkValidString(String s) {
        int l = 0, h = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                l++;
                h++;
            } else if (c == ')') {
                l = Math.max(l - 1, 0);
                h--;
            } else {
                l = Math.max(l - 1, 0);
                h++;
            }
            if (h < 0) {
                return false;
            }
        }
        return l == 0;
    }

    // 1081. Smallest Subsequence of Distinct Characters
    public static String smallestSubsequence(String text) {
        int[] count = new int[26];
        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                sb.append((char) ('a' + i));
            }
        }
        return sb.toString();
    }

    // 383. Ransom Note
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    // 1071. Greatest Common Divisor of Strings
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        while (!str1.equals(str2)) {
            if (str1.length() >= str2.length()) {
                str1 = str1.substring(str2.length());
            } else {
                str2 = str2.substring(str1.length());
            }
        }
        return str1;

//        if (str1.equals(str2)) {
//            return str1;
//        }
//        if (str1.length() >= str2.length()) {
//            return gcdOfStrings(str1.substring(str2.length()), str2);
//        } else {
//            return gcdOfStrings(str2.substring(str1.length()), str1);
//        }
    }

    // 609. Find Duplicate File in System
    public static List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : paths) {
            String[] s = str.split(" ");
            for (int i = 1; i < s.length; i++) {
                int index = s[i].indexOf('(');
                String path = s[0] + "/" + s[i].substring(0, index);
                String content = s[i].substring(index + 1, s[i].length() - 1);
                List<String> value = map.getOrDefault(content, new ArrayList<>());
                value.add(path);
                map.put(content, value);
            }
        }
        return map.values().stream().filter(o -> o.size() > 1).collect(Collectors.toList());
    }

    // 791. Custom Sort String
    public static String customSortString(String S, String T) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : T.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            int times = 0;
            if (map.containsKey(c)) {
                times = map.get(c);
                map.remove(c);
            }
            for (int i = 0; i < times; i++) {
                sb.append(c);
            }
        }
        for (char c : map.keySet()) {
            int times = map.get(c);
            for (int i = 0; i < times; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // 1207. Unique Number of Occurrences
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return map.values().stream().collect(Collectors.toSet()).size() == map.values().size();
    }

    // 205. Isomorphic Strings
    public static boolean isIsomorphic(String s1, String s2) {
        int[] m = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i) + 256]) return false;
            m[s1.charAt(i)] = m[s2.charAt(i) + 256] = i + 1;
        }
        return true;
    }

    // 290. Word Pattern
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i = 0; i < words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }

    public static int reverseBits(int n) {
        return n;
    }

    // 1214. Two Sum BSTs
    public static boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        inOrder(root1, set1);
        inOrder(root2, set2);
        if (set1.size() <= set2.size()) {
            for (int x : set1) {
                if (set2.contains(target - x)) {
                    return true;
                }
            }
        } else {
            for (int x : set2) {
                if (set1.contains(target - x)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void inOrder(TreeNode root, Set<Integer> set) {
        if (root == null) {
            return;
        }
        inOrder(root.left, set);
        set.add(root.val);
        inOrder(root.right, set);
    }

    // 560. Subarray Sum Equals K
    public static int subarraySum(int[] nums, int k) {
        int res = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }

    // 653. Two Sum IV - Input is a BST
    public static boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return helper(root, k, set);
    }

    public static boolean helper(TreeNode root, int k, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return helper(root.left, k, set) || helper(root.right, k, set);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // 1. Two Sum
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    // 209. Minimum Size Subarray Sum
    public static int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int start = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                res = Math.min(res, i + 1 - start);
                sum -= nums[start++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    // 718. Maximum Length of Repeated Subarray
    public static int findLength(int[] A, int[] B) {
        int lenA = A.length, lenB = B.length;
        int[][] dp = new int[lenA + 1][lenB + 1];
        int res = 0;
        for (int i = 1; i <= lenA; i++) {
            for (int j = 1; j <= lenB; j++) {
                dp[i][j] = A[i - 1] == B[j - 1] ? dp[i - 1][j - 1] + 1 : 0;
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }

    // 166. Fraction to Recurring Decimal
    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        // "+" or "-"
        res.append(((numerator > 0) ^ (denominator > 0)) ? "-" : "");
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // integral part
        res.append(num / den);
        num %= den;
        if (num == 0) {
            return res.toString();
        }

        // fractional part
        res.append(".");
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        map.put(num, res.length());
        while (num != 0) {
            num *= 10;
            res.append(num / den);
            num %= den;
            if (map.containsKey(num)) {
                int index = map.get(num);
                res.insert(index, "(");
                res.append(")");
                break;
            } else {
                map.put(num, res.length());
            }
        }
        return res.toString();
    }

    // 846. Hand of Straights
    public static boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) {
            return false;
        } else if (W == 1) {
            return true;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int x : hand) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        while (!map.isEmpty()) {
            int pre = map.firstKey();
            if (map.get(pre) == 1) {
                map.remove(pre);
            } else {
                map.put(pre, map.get(pre) - 1);
            }
            for (int i = 1; i < W; i++) {
                Map.Entry<Integer, Integer> entry = map.higherEntry(pre);
                if (entry == null) {
                    return false;
                }
                int key = entry.getKey();
                int value = entry.getValue();
                if (key != pre + 1) {
                    return false;
                }
                if (value == 1) {
                    map.remove(key);
                } else {
                    map.put(key, value - 1);
                }
                pre = key;
            }
        }
        return true;
    }

    // 1051. Height Checker
    // use counting sort
    public static int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for (int x : heights) {
            freq[x]++;
        }
        int res = 0, curH = 0;
        for (int h : heights) {
            while (freq[curH] == 0) {
                curH++;
            }
            if (curH != h) {
                res++;
            }
            freq[curH]--;
        }
        return res;
    }

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = Arrays.stream(A).filter(x -> (x & 1) == 0).reduce(Integer::sum).orElse(0);
        List<Integer> res = new ArrayList<>();
        for (int[] query : queries) {
            int val = query[0];
            int index = query[1];
            int origin = A[index];
            int changed = A[index] + val;
            A[index] += val;
            if ((origin & 1) == 0 && (changed & 1) == 0) {
                sum += val;
            } else if ((origin & 1) == 0 && (changed & 1) == 1) {
                sum -= origin;
            } else if ((origin & 1) == 1 && (changed & 1) == 0) {
                sum += changed;
            }
            res.add(sum);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    // 1177. Can Make Palindrome from Substring
    public static List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int len = s.length();
        char[] str = s.toCharArray();
        int[][] count = new int[len][26];
        int[] firstCount = new int[26];
        firstCount[str[0] - 'a']++;
        count[0] = firstCount;
        for (int i = 1; i < len; i++) {
            int[] temp = Arrays.copyOf(count[i - 1], 26);
            temp[str[i] - 'a']++;
            count[i] = temp;
        }
        List<Boolean> res = new ArrayList<>();
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int k = query[2];
            int[] freq = new int[26];
            if (l == 0) {
                freq = count[r];
            } else {
                int[] lFreq = count[l - 1];
                int[] rFreq = count[r];
                for (int i = 0; i < 26; i++) {
                    freq[i] = rFreq[i] - lFreq[i];
                }
            }
            int oddCount = 0;
            for (int x : freq) {
                if ((x & 1) == 1) {
                    oddCount++;
                }
            }
            res.add(oddCount / 2 <= k);
        }
        return res;
    }

    // 147. Insertion Sort List
    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head.next, pre = head;
        while (cur != null) {
            ListNode pPre = null, pCur = head;
            while (pCur.val < cur.val && pCur != cur) {
                pPre = pCur;
                pCur = pCur.next;
            }
            if (pCur == cur) {
                pre = cur;
                cur = cur.next;
                continue;
            }
            ListNode temp = cur;
            pre.next = cur.next;
            cur = cur.next;
            if (pPre == null) {
                temp.next = head;
                head = temp;
            } else {
                pPre.next = temp;
                temp.next = pCur;
            }
        }
        return head;
    }

    public static String printLinkedList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) {
                sb.append(", ");
            }
            head = head.next;
        }
        sb.append(']');
        return sb.toString();
    }

    // 43. Multiply Strings
    public static String multiply(String num1, String num2) {
        // `num1[i] * num2[j]` will be placed at indices `[i + j`, `i + j + 1]`, i, j is the index of num1 and num2 from left to right
        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + res[p2];
                res[p2] = sum % 10;
                res[p1] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int x : res) {
            if (!(sb.length() == 0 && x == 0)) {
                sb.append(x);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    // 415. Add Strings
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        char[] s1 = num1.toCharArray();
        char[] s2 = num2.toCharArray();
        int i = s1.length - 1, j = s2.length - 1, C = 0;
        while (i >= 0 || j >= 0) {
            int a1 = i >= 0 ? s1[i] - '0' : 0;
            int a2 = j >= 0 ? s2[j] - '0' : 0;
            int sum = a1 + a2 + C;
            C = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }
        if (C != 0) {
            sb.append(C);
        }
        return sb.reverse().toString();
    }

    // 371. Sum of Two Integers
    public static int getSum(int a, int b) {
        return a + b;
    }

    // 989. Add to Array-Form of Integer
    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        int i = A.length - 1, C = 0;
        while (K != 0 || i >= 0) {
            int a1 = i >= 0 ? A[i] : 0;
            int a2 = K % 10;
            int sum = a1 + a2 + C;
            C = sum / 10;
            res.add(sum % 10);
            i--;
            K /= 10;
        }
        if (C != 0) {
            res.add(C);
        }
        Collections.reverse(res);
        return res;
    }

    // 67. Add Binary
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char[] s1 = a.toCharArray();
        char[] s2 = b.toCharArray();
        int i = s1.length - 1, j = s2.length - 1, C = 0;
        while (i >= 0 || j >= 0) {
            int a1 = i >= 0 ? s1[i] - '0' : 0;
            int a2 = j >= 0 ? s2[j] - '0' : 0;
            int sum = a1 + a2 + C;
            C = sum / 2;
            sb.append(sum % 2);
            i--;
            j--;
        }
        if (C != 0) {
            sb.append(C);
        }
        return sb.reverse().toString();
    }

    // 2. Add Two Numbers
    // 445. Add Two Numbers II
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        // 2. Add Two Numbers
//        ListNode cur1 = l1, cur2 = l2, res = new ListNode(-1), tail = res;
//        int C = 0;
//        while (cur1 != null || cur2 != null) {
//            int a1 = cur1 == null ? 0 : cur1.val;
//            int a2 = cur2 == null ? 0 : cur2.val;
//            int sum = a1 + a2 + C;
//            C = sum / 10;
//            sum %= 10;
//            tail.next = new ListNode(sum);
//            tail = tail.next;
//            cur1 = cur1 == null ? null : cur1.next;
//            cur2 = cur2 == null ? null : cur2.next;
//        }
//        if (res.next == null || C != 0) {
//            tail.next = new ListNode(C);
//        }
//        return res.next;

        // 445. Add Two Numbers II, cannot modify the input lists
        ListNode res = new ListNode(1);
        ListNode cur = l1;
        Stack<Integer> s1 = new Stack<>();
        while (cur != null) {
            s1.push(cur.val);
            cur = cur.next;
        }
        cur = l2;
        Stack<Integer> s2 = new Stack<>();
        while (cur != null) {
            s2.push(cur.val);
            cur = cur.next;
        }
        int C = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int a1 = s1.isEmpty() ? 0 : s1.pop();
            int a2 = s2.isEmpty() ? 0 : s2.pop();
            int sum = a1 + a2 + C;
            C = sum / 10;
            ListNode temp = res.next;
            res.next = new ListNode(sum % 10);
            res.next.next = temp;
        }
        if (C == 0) {
            res = res.next;
        }
        return res;
    }

    public static ListNode reverseListNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null, cur = head, next = head.next;
        while (next != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next.next;
        }
        cur.next = pre;
        return cur;
    }

    // 86. Partition List
    public static ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode(-1), head2 = new ListNode(-2);
        ListNode tail1 = head1, tail2 = head2;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x) {
                tail1.next = cur;
                tail1 = cur;
            } else {
                tail2.next = cur;
                tail2 = cur;
            }
            cur = cur.next;
        }
        tail1.next = head2.next;
        tail2.next = null;
        return head1.next;
    }

    // 1019. Next Greater Node In Linked List
    // 单调栈
    public static int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        int[] res = new int[stack.size()];
        int index = res.length - 1;
        TreeSet<Integer> set = new TreeSet<>();
        while (!stack.isEmpty()) {
            int num = stack.pop();
            Integer ceil = set.ceiling(num);
            res[index--] = ceil == null ? 0 : ceil;
            set.add(num);
        }
        return res;
    }

    // 817. Linked List Components
    public static int numComponents(ListNode head, int[] G) {
        Set<Integer> set = Arrays.stream(G).boxed().collect(Collectors.toSet());
        int res = 0;
        ListNode cur = head;
        while (cur != null) {
            while (cur != null && !set.contains(cur.val)) {
                cur = cur.next;
            }
            if (cur == null) {
                break;
            }
            while (cur != null && set.contains(cur.val)) {
                cur = cur.next;
            }
            res++;
        }
        return res;
    }

    public static ListNode createLinkedList(int[] nums) {
        ListNode head = new ListNode(-1), p = head;
        for (int x : nums) {
            p.next = new ListNode(x);
            p = p.next;
        }
        return head.next;
    }

    // 203. Remove Linked List Elements
    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode pre = head, cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = pre.next;
        }
        return head;
    }

    // 328. Odd Even Linked List
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // head1 is odd list, head2 is even list
        ListNode head1 = head, head2 = head.next, pre1 = head1, pre2 = head2, cur = head2.next;
        boolean isOdd = true;
        while (cur != null) {
            if (isOdd) {
                pre1.next = cur;
                pre1 = cur;
            } else {
                pre2.next = cur;
                pre2 = cur;
            }
            cur = cur.next;
            isOdd = !isOdd;
        }
        pre1.next = head2;
        pre2.next = null;
        return head1;
    }

    // 153. Find Minimum in Rotated Sorted Array
    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return nums[l];
            }
            int mid = (l + r) / 2;
            if (nums[l] <= nums[mid]) { // 左半边有序
                l = mid + 1;
            } else {    // 右半边有序
                r = mid;
            }
        }
        return nums[l];
    }

    // 33. Search in Rotated Sorted Array
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) { // 左半边有序
                if (nums[l] <= target && target < nums[mid]) { // target在[l, mid)之间
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {    // 右半边有序
                if (nums[mid] < target && target <= nums[r]) { // target在(mid, r]之间
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    // 1170. Compare Strings by Frequency of the Smallest Character
    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] res = new int[queries.length];
        int[] q = new int[queries.length];
        int[] w = new int[words.length];
        int index = 0;
        for (String s : queries) {
            q[index++] = func(s);
        }
        int[] countMap = new int[11];
        for (String s : words) {
            countMap[func(s)]++;
        }
        index = 0;
        for (int i = 0; i < 11 && index < w.length; i++) {
            for (int j = 0; j < countMap[i]; j++) {
                w[index++] = i;
            }
        }
        index = 0;
        for (int x : q) {
            int l = 0, r = w.length - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (w[mid] > x) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            res[index++] = w.length - l;
        }
        return res;
    }

    public static int func(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map.firstEntry().getValue();
    }

    // 1011. Capacity To Ship Packages Within D Days
    public static int shipWithinDays(int[] weights, int D) {
        int l = 0, r = 0;
        for (int x : weights) {
            l = Math.max(l, x);
            r += x;
        }
        while (l <= r) {
            int mid = (l + r) / 2;
            int d = 1, w = 0;
            for (int i = 0; i < weights.length; i++) {
                if (w + weights[i] > mid) {
                    w = weights[i];
                    d++;
                } else {
                    w += weights[i];
                }
            }
            if (d <= D) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    // 875. Koko Eating Bananas
    public static int minEatingSpeed(int[] piles, int H) {
        int max = Integer.MIN_VALUE;
        for (int x : piles) {
            max = Math.max(max, x);
        }
        int l = 1, r = max;
        while (l <= r) {
            int mid = (l + r) / 2;
            int totalTime = 0;
            for (int x : piles) {
                totalTime += Math.ceil(1.0 * x / mid);
            }
            if (totalTime > H) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    // 221. Maximal Square
    public static int maximalSquare(char[][] matrix) {
        return -1;
    }

    // 258. Add Digits
    public int addDigits(int n) {
        return n == 0 ? 0 : (n % 9 == 0 ? 9 : (n % 9));
    }

    // 202. Happy Number
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0, temp = n;
            while (temp != 0) {
                int a = temp % 10;
                sum += a * a;
                temp /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    // 263. Ugly Number
    public static boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return false;
            }
        }
        return true;
    }

    // 397. Integer Replacement
    public static int integerReplacement(int n) {
        int res = 0;
        while (n != 1) {
            if (n == 3) {
                res += 2;
                break;
            }
            if ((n & 1) == 0) {
                res++;
                n >>= 1;
            } else if ((n & 0b11) == 1) {
                res += 3;
                n >>= 2;
            } else if ((n & 0b11) == 2) {
                res += 1;
                n >>= 1;
            } else {
                res += 3;
                n = (n >> 2) + 1;
            }
        }
        return res;
    }

    // 908. Smallest Range I
    public static int smallestRangeI(int[] A, int K) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int x : A) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        return Math.max(0, max - min - 2 * K);
    }

    // 279. Perfect Squares
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; i + j * j <= n; j++) {
                dp[i + j * j] = Math.min(dp[i + j * j], dp[i] + 1);
            }
        }
        return dp[n];
    }

    // 204. Count Primes
    public static int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return count;
    }

    public static int findFirstLarger(int[] arr, int key, int l, int r) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= key) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    // 264. Ugly Number II
    public static int nthUglyNumber(int n) {
        // O(nlogn)
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            int index = findFirstLarger(arr, arr[i - 1] / 2, 0, i - 2);
            int num = arr[index] * 2;
            index = findFirstLarger(arr, arr[i - 1] / 3, 0, i - 2);
            num = Math.min(arr[index] * 3, num);
            index = findFirstLarger(arr, arr[i - 1] / 5, 0, i - 2);
            num = Math.min(arr[index] * 5, num);
            arr[i] = num;
        }
        return arr[n - 1];
//        // O(n^2)
//        int[] arr = new int[n];
//        arr[0] = 1;
//        int index2 = 0, index3 = 0, index5 = 0;
//        int i = 1;
//        while (i < n) {
//            int num2 = arr[index2] * 2, num3 = arr[index3] * 3, num5 = arr[index5] * 5;
//            int min = Math.min(num2, Math.min(num3, num5));
//            if (min > arr[i - 1]) {
//                if (min == num2) {
//                    arr[i++] = num2;
//                    index2++;
//                } else if (min == num3) {
//                    arr[i++] = num3;
//                    index3++;
//                } else {
//                    arr[i++] = num5;
//                    index5++;
//                }
//            } else {
//                if (min == num2) {
//                    index2++;
//                } else if (min == num3) {
//                    index3++;
//                } else {
//                    index5++;
//                }
//            }
//        }
//        return arr[n - 1];
    }

    // 376. Wiggle Subsequence
    public static int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums.length;
        }

//        // dp, O(n^2) time, O(n) mem
//        int len = nums.length;
//        int[] up = new int[len];
//        int[] down = new int[len];
//        up[0] = down[0] = 1;
//        int res = 1;
//        for (int i = 1; i < len; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[i] > nums[j]) {
//                    up[i] = Math.max(up[i], down[j] + 1);
//                    res = Math.max(res, up[i]);
//                } else if (nums[i] < nums[j]){
//                    down[i] = Math.max(down[i], up[j] + 1);
//                    res = Math.max(res, down[i]);
//                }
//            }
//        }
//        return res;

//        // dp, O(n) time, O(n) mem
//        int len = nums.length;
//        int[] up = new int[len];
//        int[] down = new int[len];
//        up[0] = down[0] = 1;
//        for (int i = 1; i < len; i++) {
//            if (nums[i] > nums[i - 1]) {
//                up[i] = down[i - 1] + 1;
//                down[i] = down[i - 1];
//            } else if (nums[i] < nums[i - 1]) {
//                down[i] = up[i - 1] + 1;
//                up[i] = up[i - 1];
//            } else {
//                up[i] = up[i - 1];
//                down[i] = down[i - 1];
//            }
//        }
//        return Math.max(up[len - 1], down[len - 1]);

        // dp, O(n) time, O(1) mem
        int len = nums.length, preUp = 1, preDown = 1, up = 0, down = 0;
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i - 1]) {
                up = preDown + 1;
                down = preDown;
            } else if (nums[i] < nums[i - 1]) {
                down = preUp + 1;
                up = preUp;
            } else {
                up = preUp;
                down = preDown;
            }
            preDown = down;
            preUp = up;
        }
        return Math.max(up, down);
    }

    // 85. Maximal Rectangle
    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        final int m = matrix.length, n = matrix[0].length;
        int[][] height = new int[m][n];
        int[][] left = new int[m][n];
        int[][] right = new int[m][n];
        for (int i = 0; i < m; i++) {

        }
        return 0;
    }

    // 45. Jump Game II
    public static int jump(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

    // 55. Jump Game
    public static boolean canJump(int[] nums) {
        int maxD = nums[0];
        for (int i = 1; i <= maxD; i++) {
            if (maxD >= nums.length - 1) {
                return true;
            }
            maxD = Math.max(maxD, i + nums[i]);
        }
        return maxD >= nums.length - 1;
    }

    // 948. Bag of Tokens
    public static int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int res = 0, point = 0, l = 0, r = tokens.length - 1;
        while (l <= r && (P >= tokens[l] || point > 0)) {
            while (l <= r && P >= tokens[l]) {
                P -= tokens[l++];
                point++;
            }
            res = Math.max(point, res);
            if (l <= r && point > 0) {
                P += tokens[r--];
                point--;
            }
        }
        return res;
    }

    // 74. Search a 2D Matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
//        // O(log(m * n))
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return false;
//        }
//        int m = matrix.length, n = matrix[0].length;
//        int l = 0, r = m * n - 1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            int midNum = matrix[mid / n][mid % n];
//            if (midNum == target) {
//                return true;
//            } else if (midNum > target) {
//                r = mid - 1;
//            } else {
//                l = mid + 1;
//            }
//        }
//        return false;
        // O(log(m) + log(n))
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (matrix[mid][0] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (r == -1) {
            return false;
        }
        if (matrix[r][0] == target) {
            return true;
        }
        int row = r;
        l = 0;
        r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    // 1111. Maximum Nesting Depth of Two Valid Parentheses Strings
    public static int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int l = 0, r = 0, index = 0;
        for (char c : seq.toCharArray()) {
            if (c == '(') {
                res[index++] = l;
                l = 1 - l;
            } else {
                res[index++] = r;
                r = 1 - r;
            }
        }
        return res;
    }

    // 406. Queue Reconstruction by Height
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] != o2[0] ? o2[0] - o1[0] : o1[1] - o2[1]);
        List<int[]> res = new LinkedList<>();
        for (int[] p : people) {
            res.add(p[1], p);
        }
        return res.stream().toArray(int[][]::new);
    }

    public static List<String> commonChars(String[] A) {
        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        for (String s : A) {
            int[] temp = new int[26];
            for (char c : s.toCharArray()) {
                temp[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                count[i] = Math.min(count[i], temp[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]; j++) {
                res.add(String.valueOf((char) ('a' + i)));
            }
        }
        return res;
    }

    // 350. Intersection of Two Arrays II
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : nums2) {
            if (map.containsKey(x)) {
                int count = map.get(x);
                if (count > 0) {
                    res.add(x);
                    count--;
                }
                map.put(x, count);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1, count = 0;
        while (i <= j) {
            if (people[j] + people[i] <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            count++;
        }
        return count;
    }

    // 725. Split Linked List in Parts
    public static ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        if (root == null) {
            return res;
        }
        int n = size(root);
        ListNode pre = null, cur = root;
        for (int index = 0, size = n / k, extra = n % k; index < k; index++, extra--) {
            res[index] = cur;
            for (int i = size + (extra > 0 ? 1 : 0); i > 0; i--) {
                pre = cur;
                cur = cur.next;
            }
            pre.next = null;
        }
        return res;
    }

    private static int size(ListNode root) {
        int count = 0;
        while (root != null) {
            root = root.next;
            count++;
        }
        return count;
    }

    // 37. Sudoku Solver
    public static void solveSudoku(char[][] board) {
        Set<Integer>[] cols = new Set[9];
        Set<Integer>[] rows = new Set[9];
        Set<Integer>[] blocks = new Set[9];

    }

    // 36. Valid Sudoku
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            BitSet bitSet = new BitSet(9);
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (bitSet.get(board[i][j] - '0')) {
                    return false;
                }
                bitSet.set(board[i][j] - '0');
            }
        }
        for (int i = 0; i < 9; i++) {
            BitSet bitSet = new BitSet(9);
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (bitSet.get(board[j][i] - '0')) {
                    return false;
                }
                bitSet.set(board[j][i] - '0');
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                BitSet bitSet = new BitSet(9);
                for (int k = 0; k < 9; k++) {
                    if (board[i + k / 3][j + k % 3] == '.') {
                        continue;
                    }
                    int temp = board[i + k / 3][j + k % 3] - '0';
                    if (bitSet.get(temp)) {
                        return false;
                    }
                    bitSet.set(temp);
                }
            }
        }
        return true;
    }

    // 973. K Closest Points to Origin
    public static int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((o1, o2) -> (o2[0] * o2[0] + o2[1] * o2[1]) - (o1[0] * o1[0] + o1[1] * o1[1]));
        for (int[] point : points) {
            maxHeap.add(point);
            if (maxHeap.size() > K) {
                maxHeap.poll();
            }
        }
        int[][] res = new int[maxHeap.size()][2];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            res[i++] = maxHeap.poll();
        }
        return res;
    }

    // 567. Permutation in String
    public static boolean checkInclusion(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int len1 = arr1.length, len2 = arr2.length;
        if (len1 > len2) {
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (char c : arr1) {
            count1[c - 'a']++;
        }
        int i = 0, j = len1 - 1;
        while (j < len2) {
            if (i == 0) {
                for (int k = i; k <= j; k++) {
                    count2[arr2[k] - 'a']++;
                }
            } else {
                count2[arr2[i - 1] - 'a']--;
                count2[arr2[j] - 'a']++;
            }
            boolean flag = true;
            for (int k = 0; k < 26; k++) {
                if (count1[k] != count2[k]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }

    // 242. Valid Anagram
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for (char c : s1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t1) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) {
                return false;
            }
        }
        return map.values().stream().reduce(Integer::sum).orElse(0) == 0;
    }

    // 49. Group Anagrams
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            char[] chars = s.toCharArray();
            for (char c : chars) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    // 1054. Distant Barcodes
    public static int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : barcodes) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer> list1 = new ArrayList<>(map.keySet());
        Collections.sort(list1, Comparator.comparingInt(map::get).reversed());
        int[] res = new int[barcodes.length];
        int index = 0;
        for (int key : list1) {
            int count = map.get(key);
            for (int i = 0; i < count; i++) {
                res[index] = key;
                index += 2;
                if (index >= barcodes.length) {
                    index = 1;
                }
            }
        }
        return res;
    }

    // 324. Wiggle Sort II
    public static int[] wiggleSort(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int x : nums) {
            if (maxHeap.isEmpty() || maxHeap.peek() >= x) {
                maxHeap.add(x);
                if (maxHeap.size() - minHeap.size() == 2) {
                    minHeap.add(maxHeap.poll());
                }
            } else {
                minHeap.add(x);
                if (minHeap.size() - maxHeap.size() == 1) {
                    maxHeap.add(minHeap.poll());
                }
            }
        }
        int index = 0;
        while (!maxHeap.isEmpty()) {
            nums[index] = maxHeap.poll();
            index += 2;
        }
        index = 2 * minHeap.size() - 1;
        while (!minHeap.isEmpty()) {
            nums[index] = minHeap.poll();
            index -= 2;
        }
        return nums;
    }

    // 712. Minimum ASCII Delete Sum for Two Strings
    public static int minimumDeleteSum(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int len1 = arr1.length, len2 = arr2.length;
        int sum1 = 0, sum2 = 0;
        for (char c : arr1) {
            sum1 += (int) c;
        }
        for (char c : arr2) {
            sum2 += (int) c;
        }
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + (int) arr1[i - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return sum1 + sum2 - 2 * dp[len1][len2];
    }

    // 583. Delete Operation for Two Strings
    public static int minDistance(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int len1 = arr1.length, len2 = arr2.length;
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                dp[i][j] = arr1[i - 1] == arr2[j - 1] ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return len1 + len2 - 2 * dp[len1][len2];
    }

    // 5. Longest Palindromic Substring
    // 马拉车算法，LPS（最长回文子串）
    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        for (char c : s.toCharArray()) {
            sb.append(c);
            sb.append('#');
        }
        char[] t = sb.toString().toCharArray();
        int len = t.length;
        int[] dp = new int[len];
        int C = 0, R = 0;
        int center = 0, radius = 0;
        for (int i = 1; i < len; i++) {
            int i_mirror = 2 * C - i;
            dp[i] = i < R ? Math.min(R - i, dp[i_mirror]) : 0;
            while (i + dp[i] + 1 < len && i - dp[i] - 1 >= 0 && t[i + dp[i] + 1] == t[i - dp[i] - 1]) {
                dp[i]++;
            }
            if (i + dp[i] > R) {
                C = i;
                R = i + dp[i];
            }
            if (dp[i] > radius) {
                center = i;
                radius = dp[i];
            }
        }
        return s.substring((center - radius) / 2, (center + radius) / 2);
    }

    // 1143. Longest Common Subsequence
    public static int longestCommonSubsequence(String text1, String text2) {
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        int len1 = arr1.length, len2 = arr2.length;
        int[][] dp = new int[len1 + 1][len2 + 2];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                dp[i][j] = arr1[i - 1] == arr2[j - 1] ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[len1][len2];
    }

    // 516. Longest Palindromic Subsequence
    public static int longestPalindromeSubseq(String s) {
        char[] arr1 = s.toCharArray();
        int len = arr1.length;
        char[] arr2 = new char[len];
        for (int i = len - 1; i >= 0; i--) {
            arr2[len - 1 - i] = arr1[i];
        }
        int[][] dp = new int[len + 1][len + 1];
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                dp[i][j] = arr1[i - 1] == arr2[j - 1] ? dp[i - 1][j - 1] + 1 : Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return dp[len][len];
    }

    // 692. Top K Frequent Words
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        PriorityQueue<String> minHeap = new PriorityQueue<String>(Comparator.comparingInt(map::get).thenComparing((o1, o2) -> -((String) o1).compareTo((String) o2)));
        for (String s : map.keySet()) {
            minHeap.add(s);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            res.add(minHeap.poll());
        }
        Collections.reverse(res);
        return res;
    }

    // 659. Split Array into Consecutive Subsequences
    public static boolean isPossible(int[] nums) {
        return true;
    }

    // 349. Intersection of Two Arrays
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        set1.retainAll(Arrays.stream(nums2).boxed().collect(Collectors.toSet()));
        int[] res = new int[set1.size()];
        int i = 0;
        for (int x : set1) {
            res[i++] = x;
        }
        return res;
    }

    // 387. First Unique Character in a String
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int len = arr.length;
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < len; i++) {
            if (map.get(arr[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    // 451. Sort Characters By Frequency
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        Character[] chars = new Character[len];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            chars[i] = c;
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Arrays.sort(chars, Comparator.comparingInt(map::get).reversed().thenComparingInt(c -> (char) c));
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }

    static class A {
        char c;
        int f;

        public A(char c, int f) {
            this.c = c;
            this.f = f;
        }
    }

    // 1046. Last Stone Weight
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(n -> -n));
        queue.addAll(Arrays.stream(stones).boxed().collect(Collectors.toList()));
        while (queue.size() > 1) {
            int y = queue.poll();
            int x = queue.poll();
            if (x != y) {
                queue.add(y - x);
            }
        }
        if (queue.size() == 1) {
            return queue.poll();
        }
        return 0;
    }

    public static int findKthLargest(int[] nums, int k) {
        return quickSort(nums, nums.length - k, 0, nums.length - 1);
    }

    public static int quickSort(int[] nums, int k, int l, int r) {
        if (l == r) {
            return nums[l];
        }
        int pivot = nums[l];
        int i = l;
        int j = r;
        while (i < j) {
            while (i < j && nums[j] >= pivot) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] <= pivot) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = pivot;

        if (i == k) {
            return nums[i];
        } else if (i > k) {
            return quickSort(nums, k, l, i - 1);
        } else {
            return quickSort(nums, k, i + 1, r);
        }
    }

    // 马拉车算法，统计回文子串的个数
    public static int countSubstrings(String s) {
        StringBuilder sb = new StringBuilder("#");
        int len = s.length();
        for (int i = 0; i < len; i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }
        char[] t = sb.toString().toCharArray();
        len = t.length;
        int[] dp = new int[len];
        int id = 0, mx = 0;
        for (int i = 1; i < len - 1; i++) {
            int i_mirror = 2 * id - i;
            dp[i] = i < mx ? Math.min(dp[i_mirror], mx - i) : 0;
            while (i + dp[i] + 1 < len && i - dp[i] - 1 >= 0 && t[i + dp[i] + 1] == t[i - dp[i] - 1]) {
                dp[i]++;
            }
            if (mx < dp[i] + i) {
                id = i;
                mx = dp[i] + i;
            }
        }
        int sum = 0;
        for (int x : dp) {
            sum += (x + 1) / 2;
        }
        return sum;
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, Comparator.comparingInt(map::get));
        for (int key : map.keySet()) {
            queue.add(key);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        List<Integer> list = queue.stream().collect(Collectors.toList());
        Collections.reverse(list);
        return list;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) {
            return head;
        }
        ListNode preTail = null, cur = head;
        int count = 1;
        while (count < m) {
            preTail = cur;
            cur = cur.next;
            count++;
        }
        ListNode curTail = cur, pre = null, next = cur.next;
        while (next != null && count < n) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = cur.next;
            count++;
        }
        cur.next = pre;
        if (preTail != null) {
            preTail.next = cur;
        } else {
            head = cur;
        }
        curTail.next = next;
        return head;
    }

    public int[] bonus(int n, int[][] leadership, int[][] operations) {
        List<Integer> res = new ArrayList<>();
        int[][] G = new int[n + 1][n + 1];
        int[] coins = new int[n + 1];
        int len1 = leadership.length;
        for (int i = 0; i < len1; i++) {
            G[leadership[i][0]][leadership[i][1]] = 1;
        }
        int len2 = operations.length;
        for (int i = 0; i < len2; i++) {
            if (operations[i][0] == 1) {
                coins[operations[i][1]] += operations[i][2];
            } else if (operations[i][0] == 2) {
                coins[operations[i][1]] += operations[i][2];
                for (int j = 1; j <= n; j++) {
                    if (G[i][j] == 1) {
                        coins[j] += operations[i][2];
                    }
                }
            } else {
                int idx = operations[i][1];
                int sum = coins[idx];

                for (int j = 1; j <= n; j++) {
                    if (G[i][j] == 1) {
                        sum += coins[j];
                    }
                }
                res.add(sum);
            }
        }
        int[] temp = new int[res.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = res.get(i);
        }
        return temp;
    }

    public static int numSquarefulPerms(int[] A) {
        int count = 0;
        Arrays.sort(A);
        if (isSquareful(A)) {
            count++;
        }
        while (nextPermutation(A) != null) {
            if (isSquareful(A)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isSquareful(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int sum = nums[i - 1] + nums[i];
            if (!isSquareNum(sum)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSquareNum(int n) {
        int l = 1, r = 40000;
        while (l <= r) {
            int mid = (l + r) / 2;
            int square = mid * mid;
            if (square == n) {
                return true;
            } else if (square < n) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        while (true) {
            List<Integer> list = nextPermutation(nums);
            if (list == null) {
                break;
            }
            res.add(list);
        }
        return res;
    }

    private static List<Integer> nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = i + 1;
            while (j < len && nums[j] > nums[i]) {
                j++;
            }
            swap(nums, i, --j);
            reverse(nums, i + 1, len - 1);
            return Arrays.stream(nums).boxed().collect(Collectors.toList());
        }
        return null;
    }

    private static void reverse(int[] nums, int st, int ed) {
        for (int i = st, j = ed; i < j; i++, j--) {
            swap(nums, i, j);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void solution() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
//        while (queue.isEmpty())
    }

    private static void printMatrix(int[][] matrix) {
        String a = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                a = a + matrix[i][j] + ",";
            }
            System.out.println(a.substring(0, a.length() - 1));
            a = "";
        }
    }

    //830. Positions of Large Groups
    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (S.length() < 3) return res;
        int start = 0, end = 0, p = 1;
        boolean flag = false;
        for (; p < S.length(); ) {
            for (; p < S.length() && S.charAt(p) == S.charAt(p - 1); p++) ;
            if (flag) {
                start = p++;
                flag = false;
            } else {
                end = p;
                if (end - start >= 3) {
                    List<Integer> group = new ArrayList<>();
                    group.add(start);
                    group.add(end - 1);
                    res.add(group);
                }
                flag = true;
            }
        }
        return res;
    }

    //724. Find Pivot Index
    public static int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int[] sumL = new int[nums.length];
        sumL[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumL[i] = sumL[i - 1] + nums[i];
        }
        if (sumL[sumL.length - 1] == sumL[0]) return 0;
        for (int i = 1; i < sumL.length; i++) {
            if (sumL[i - 1] == (sumL[sumL.length - 1] - sumL[i])) {
                return i;
            }
        }
        return -1;
    }

    //832. Flipping an Image
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                int temp = row[i];
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp ^ 1;
            }
        }
        return A;
    }

    //561. Array Partition I
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }

    //867. Transpose Matrix
    public static int[][] transpose(int[][] A) {
        int[][] res = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }

    //566. Reshape the Matrix
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int old_r = nums.length;
        int old_c = nums[0].length;
        int n = old_r * old_c;
        int[][] result = new int[r][c];
        for (int i = 0; i < n; i++) {
            result[i / c][i % c] = nums[i / old_c][i % old_c];
        }
        return result;
    }

    //888. Fair Candy Swap
    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] res = new int[2];
        int sumA = 0, sumB = 0;
        for (int i : A) sumA += i;
        for (int i : B) sumB += i;
        Set<Integer> setB = new HashSet<Integer>();
        for (int i : B) setB.add(i);
        for (int x : A) {
            int y = x + (sumB - sumA) / 2;
            if (setB.contains(y)) {
                res[0] = x;
                res[1] = y;
                return res;
            }
        }
        return res;
    }

    //485. Max Consecutive Ones
    public static int findMaxConsecutiveOnes(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0] == 1 ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] == 1 ? dp[i - 1] + 1 : 0;
        }
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > result) {
                result = dp[i];
            }
        }
        return result;
    }

    //283. Move Zeroes
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    //448. Find All Numbers Disappeared in an Array
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]) - 1;
            if (nums[temp] > 0) {
                nums[temp] = -nums[temp];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    //169. Majority Element
    public static int majorityElement(int[] nums) {
        int result = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (result == nums[i]) {
                count++;
            } else count--;
            if (count < 0) {
                result = nums[i];
                count = 0;
            }
        }
        return result;
    }

    //717. 1-bit and 2-bit Characters
    public static boolean isOneBitCharacter(int[] bits) {
        int len = bits.length, i = 0;
        while (i < len - 1) {
            if (bits[i] == 0) i++;
            else i += 2;
        }
        return i == len - 1;
    }

    //122. Best Time to Buy and Sell Stock II
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int res = 0, buyIndex = 0, sellIndex = 0, curPointer = 1;
        boolean flag = true;
        for (; curPointer < prices.length; ) {
            if (flag) {
                for (; curPointer < prices.length && prices[curPointer] <= prices[curPointer - 1]; curPointer++) ;
                buyIndex = curPointer - 1;
                flag = false;
            } else {
                for (; curPointer < prices.length && prices[curPointer] >= prices[curPointer - 1]; curPointer++) ;
                sellIndex = curPointer - 1;
                flag = true;
                res = res + prices[sellIndex] - prices[buyIndex];
            }
        }
        return res;
    }

    //217. Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums == null) return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (nums.length == set.size()) return false;
        else return true;
    }

    //167. Two Sum II - Input array is sorted
    public static int[] twoSumII(int[] numbers, int target) {
        int[] result = {0, 0};
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else break;
        }
        result[0] = i + 1;
        result[1] = j + 1;
        return result;
    }

    //697. Degree of an Array
    public static int findShortestSubArray(int[] nums) {
        int degree = 0;
        int len = nums.length;
        int num = 0;
        int minSize = len;
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        Map<Integer, Integer> left = new HashMap<Integer, Integer>();
        Map<Integer, Integer> right = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            if (frequency.containsKey(nums[i])) frequency.put(nums[i], frequency.get(nums[i]) + 1);
            else frequency.put(nums[i], 1);
            degree = Math.max(degree, frequency.get(nums[i]));
            if (!left.containsKey(nums[i])) left.put(nums[i], i);
            right.put(nums[i], i);
        }
        Iterator<Map.Entry<Integer, Integer>> iter = frequency.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = iter.next();
            if ((Integer) entry.getValue() == degree) {
                num = (Integer) entry.getKey();
                minSize = Math.min(minSize, right.get(num) - left.get(num) + 1);
            }
        }
        return minSize;
    }

    //661. Image Smoother
    public static int[][] imageSmoother(int[][] M) {
        int r = M.length;
        int c = M[0].length;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                int count = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k >= 0 && k < r && l >= 0 && l < c) {
                            sum += M[k][l];
                            count++;
                        }
                    }
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }

    //268. Missing Number
    public static int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for (int i : nums) {
            sum -= i;
        }
        return sum;
    }

    //628. Maximum Product of Three Numbers
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1]);
    }

    //121. Best Time to Buy and Sell Stock
    public static int maxProfit1(int[] prices) {
        int maxProfit = 0;
        int minBuy = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            }
            if (maxProfit < prices[i] - minBuy) {
                maxProfit = prices[i] - minBuy;
            }
        }
        return maxProfit;
    }

    //840. Magic Squares In Grid
    public static int numMagicSquaresInside(int[][] grid) {
        int res = 0;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                if (grid[i][j] != 5) continue;
                if (magic(grid[i - 1][j - 1], grid[i - 1][j], grid[i - 1][j + 1],
                        grid[i][j - 1], grid[i][j], grid[i][j + 1],
                        grid[i + 1][j - 1], grid[i + 1][j], grid[i + 1][j + 1]))
                    res++;
            }
        }
        return res;
    }

    public static boolean magic(int... vals) {
        int[] count = new int[16];
        for (int v : vals) count[v]++;
        for (int v = 1; v <= 9; ++v)
            if (count[v] != 1)
                return false;
        return (vals[0] + vals[1] + vals[2] == 15 &&
                vals[3] + vals[4] + vals[5] == 15 &&
                vals[6] + vals[7] + vals[8] == 15 &&
                vals[0] + vals[3] + vals[6] == 15 &&
                vals[1] + vals[4] + vals[7] == 15 &&
                vals[2] + vals[5] + vals[8] == 15 &&
                vals[0] + vals[4] + vals[8] == 15 &&
                vals[2] + vals[4] + vals[6] == 15);
    }

    //849. Maximize Distance to Closest Person
    public static int maxDistToClosest(int[] seats) {
        int res = 0, pre = 0, cur = 0;
        boolean flag = true;
        return 0;
    }
}

class Twitter {

    private Map<Integer, Set<Integer>> followee;
    private Map<Integer, Set<Pair>> tweet;

    private static int version = 0;
    private static final int MAX_RECENT_TWEET_NUM = 10;

    /**
     * Initialize your data structure here.
     */
    public Twitter() {
        followee = new HashMap<>();
        tweet = new HashMap<>();
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        Set<Pair> tweetIds = tweet.getOrDefault(userId, new HashSet<>());
        tweetIds.add(new Pair(tweetId, version++));
        tweet.put(userId, tweetIds);
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Pair> heap = new PriorityQueue<>();
        Set<Pair> userTweet = tweet.getOrDefault(userId, new HashSet<>());
        for (Pair pair : userTweet) {
            heap.add(pair);
            if (heap.size() > MAX_RECENT_TWEET_NUM) {
                heap.poll();
            }
        }
        Set<Integer> followees = followee.getOrDefault(userId, new HashSet<>());
        for (int followeeId : followees) {
            Set<Pair> tweetIds = tweet.getOrDefault(followeeId, new HashSet<>());
            for (Pair tweetId : tweetIds) {
                heap.add(tweetId);
                if (heap.size() > MAX_RECENT_TWEET_NUM) {
                    heap.poll();
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!heap.isEmpty()) {
            res.add(heap.poll().getTweetId());
        }
        Collections.reverse(res);
        return res;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        if (followeeId == followerId) {
            return;
        }
        Set<Integer> followees = followee.getOrDefault(followerId, new HashSet<>());
        followees.add(followeeId);
        followee.put(followerId, followees);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followees = followee.getOrDefault(followerId, new HashSet<>());
        followees.remove(followeeId);
        followee.put(followerId, followees);
    }

    static class Pair implements Comparable {
        private int tweetId;
        private int version;

        public Pair(int tweetId, int version) {
            this.tweetId = tweetId;
            this.version = version;
        }

        public int getTweetId() {
            return tweetId;
        }

        public void setTweetId(int tweetId) {
            this.tweetId = tweetId;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        @Override
        public int compareTo(Object o) {
            return this.version - ((Pair) o).version;
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */

class MyHashSet {

    private BitSet bitMap;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        bitMap = new BitSet(1000001);
    }

    public void add(int key) {
        bitMap.set(key);
    }

    public void remove(int key) {
        bitMap.clear(key);
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return bitMap.get(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */


// 729. My Calendar I
class MyCalendar {

    private TreeSet<Pair> booked;

    public MyCalendar() {
        booked = new TreeSet<>(Comparator.comparingInt(Pair::getStart).thenComparingInt(Pair::getEnd));
    }

    public boolean book(int start, int end) {
        Pair pair = new Pair(start, end);
        Pair floor = booked.floor(pair);
        Pair ceil = booked.ceiling(pair);
        if ((floor == null || pair.getStart() >= floor.getEnd()) && (ceil == null || pair.getEnd() <= ceil.getStart())) {
            booked.add(pair);
            return true;
        }
        return false;
    }

    static class Pair {
        private int start;
        private int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */

// 1201. Ugly Number III
class Solution {

    long ab, ac, bc, abc;

    public int nthUglyNumber(int n, int a, int b, int c) {
        ab = lcm(a, b);
        ac = lcm(a, c);
        bc = lcm(c, b);
        abc = lcm(ac, b);

        long l = 1, r = 2000000001;
        while (l <= r) {
            int mid = (int) ((l + r) / 2);
            int num = (int) uglyNumCount(mid, (long) a, (long) b, (long) c);
            if (num >= n) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int) l;
    }

    public long uglyNumCount(long n, long a, long b, long c) {
        return n / a + n / b + n / c - n / ab - n / ac - n / bc + n / abc;
    }

    public long lcm(long x, long y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        return x * y / gcd(x, y);
    }

    public long gcd(long x, long y) {
        if (x < y)
            return gcd(y, x);
        if (y == 0)
            return x;
        if ((x & 1) == 1) //x为奇数
        {
            if ((y & 1) == 1) //y为奇数
                return gcd(x - y, y);
            else         //y为偶数
                return gcd(x, y >> 1);
        } else         //x为偶数
        {
            if ((y & 1) == 1) //y为奇数
                return gcd(x >> 1, y);
            else         //y为偶数
                return 2 * gcd(x >> 1, y >> 1);

        }
    }
}

// 295. Find Median from Data Stream
class MedianFinder {

    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.add(num);
            if (maxHeap.size() - minHeap.size() == 2) {
                minHeap.add(maxHeap.poll());
            }
        } else {
            minHeap.add(num);
            if (minHeap.size() - maxHeap.size() == 1) {
                maxHeap.add(minHeap.poll());
            }
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

// 1146. Snapshot Array
class SnapshotArray {

    private Map<Integer, Map<Integer, Integer>> map;
    private int snapId;

    public SnapshotArray(int length) {
        map = new HashMap<>();
        snapId = 0;
    }

    public void set(int index, int val) {
        Map<Integer, Integer> cur = map.getOrDefault(snapId, new HashMap<>());
        cur.put(index, val);
        map.put(snapId, cur);
    }

    public int snap() {
        Map<Integer, Integer> pre = map.getOrDefault(snapId++, new HashMap<>());
        Map<Integer, Integer> cur = new HashMap<>();
        cur.putAll(pre);
        map.put(snapId, cur);
        return snapId - 1;
    }

    public int get(int index, int snap_id) {
        return map.getOrDefault(snap_id, new HashMap<>()).getOrDefault(index, 0);
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */

// 384. Shuffle an Array
// 费雪耶兹(Fisher–Yates)算法
class Solution384 {

    private int[] nums;
    private int length;

    public Solution384(int[] nums) {
        this.nums = nums;
        this.length = nums.length;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] res = Arrays.copyOf(nums, length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int rand = random.nextInt(length - i) + i;
            int temp = res[i];
            res[i] = res[rand];
            res[rand] = temp;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */

// 933. Number of Recent Calls
class RecentCounter {

    private PriorityQueue<Integer> heap;

    public RecentCounter() {
        heap = new PriorityQueue<>();
    }

    public int ping(int t) {
        heap.add(t);
        while (heap.peek() < t - 3000) {
            heap.poll();
        }
        return heap.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

// 622. Design Circular Queue
class MyCircularQueue {

    private int[] data;
    private int front;
    private int tail;
    private int capacity;
    private int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        front = 0;
        tail = 0;
        capacity = k;
        size = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        data[tail] = value;
        tail = (tail + 1) % capacity;
        size++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        return isEmpty() ? -1 : data[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        return isEmpty() ? -1 : data[(tail - 1 + capacity) % capacity];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

// 641. Design Circular Deque
class MyCircularDeque {

    private int[] data;
    private int capacity;
    private int size;
    private int front;
    private int tail;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        data = new int[k];
        capacity = k;
        size = 0;
        front = 0;
        tail = 0;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        data[front] = value;
        size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        data[tail] = value;
        tail = (tail + 1) % capacity;
        size++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tail = (tail - 1 + capacity) % capacity;
        size--;
        return true;
    }

    /** Get the front item from the queue. */
    public int getFront() {
        return isEmpty() ? -1 : data[front];
    }

    /** Get the last item from the queue. */
    public int getRear() {
        return isEmpty() ? -1 : data[(tail - 1 + capacity) % capacity];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */

