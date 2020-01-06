import array.ThreeSum;
import com.sun.source.tree.Tree;
import util.Codec;
import util.CommonUtil;
import util.Pair;

import javax.management.j2ee.statistics.JCAStats;
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

        System.out.println(maximalRectangle(new char[][] {
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

//        System.out.println(maximalSquare(new char[][] {
//                {'1', '0', '1', '0', '0'},
//                {'1', '0', '1', '1', '1'},
//                {'1', '1', '1', '1', '1'},
//                {'1', '0', '0', '1', '0'}
//        }));

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

//        System.out.println(Arrays.toString(nextLargerNodes(createLinkedList(new int[] {2, 1, 5}))));
//        System.out.println(Arrays.toString(nextLargerNodes(createLinkedList(new int[] {2, 7, 4, 3, 5}))));
//        System.out.println(Arrays.toString(nextLargerNodes(createLinkedList(new int[] {1, 7, 5, 1, 9, 2, 5, 1}))));

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

        System.out.println(minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen(11, new int[] {1, 2, 3, 4, 5}));

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

//        System.out.println(printLinkedList(reverseKGroup(createLinkedList(new int[] {1, 2, 3, 4, 5}), 2)));
//        System.out.println(printLinkedList(reverseKGroup(createLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7, 8}), 3)));
//        System.out.println(printLinkedList(reverseKGroup(createLinkedList(new int[] {1, 2, 3, 4, 5}), 3)));

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

        System.out.println(largestTimeFromDigits(new int[] {1, 2, 3, 4}));
        System.out.println(largestTimeFromDigits(new int[] {5, 5, 5, 5}));
        System.out.println(largestTimeFromDigits(new int[] {0, 3, 0, 3}));

//        System.out.println(merge(new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
//        System.out.println(merge(new int[][] {{1, 4}, {1, 5}}));

//        System.out.println(Arrays.toString(searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8)));
//        System.out.println(Arrays.toString(searchRange(new int[] {5, 7, 7, 8, 8, 10}, 6)));
//        System.out.println(Arrays.toString(searchRange(new int[] {1}, 0)));

//        System.out.println(firstMissingPositive(new int[] {1, 2, 0}));
//        System.out.println(firstMissingPositive(new int[] {3, 4, -1, 1}));
//        System.out.println(firstMissingPositive(new int[] {7, 8, 9, 11, 12}));

//        System.out.println(insert(new int[][] {{1, 3}, {6, 9}}, new int[] {2, 5}));
//        System.out.println(insert(new int[][] {}, new int[] {2, 5}));
//        System.out.println(insert(new int[][] {{1,5}}, new int[] {6,8}));
//        System.out.println(insert(new int[][] {{11,15}}, new int[] {6,8}));
//        System.out.println(insert(new int[][] {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[] {4, 8}));
//        System.out.println(minPathSum(new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));

//        System.out.println(summaryRanges(new int[] {0, 1, 2, 4, 5, 7}));
//        System.out.println(summaryRanges(new int[] {0, 2, 3, 4, 6, 8, 9}));
//        System.out.println(summaryRanges(new int[] {0}));
//        System.out.println(summaryRanges(new int[] {}));

//        System.out.println(numPairsDivisibleBy60(new int[] {60, 60, 60}));

//        System.out.println(findMinII(new int[] {1, 3, 5}));
//        System.out.println(findMinII(new int[] {2, 2, 2, 0, 1}));
//        System.out.println(findMinII(new int[] {3, 1, 3}));

//        int[] arr = new int[]{1,0,2,3,0,4};
//        duplicateZeros(arr);
//        System.out.println(Arrays.toString(arr));

//        System.out.println(canThreePartsEqualSum(new int[] {12, -4, 16, -5, 9, -3, 3, 8, 0}));

//        System.out.println(Arrays.toString(deckRevealedIncreasing(new int[] {17, 13, 11, 2, 3, 5, 7})));

//        System.out.println(findDuplicates(new int[] {4, 3, 2, 7, 8, 2, 3, 1}));

//        System.out.println(pancakeSort(new int[] {3, 2, 4, 1}));
//        System.out.println(pancakeSort(new int[] {1, 2, 3}));

//        System.out.println(subsets(new int[] {1, 2, 3}));

//        System.out.println(maxChunksToSorted(new int[] {2, 0, 1}));
//        System.out.println(maxChunksToSorted(new int[] {4, 3, 2, 1, 0}));
//        System.out.println(maxChunksToSorted(new int[] {1, 0, 2, 3, 4}));

//        System.out.println(findDuplicate(new int[] {1, 3, 4, 2, 2}));
//        System.out.println(findDuplicate(new int[] {3, 1, 3, 4, 2}));
//        System.out.println(maxScoreSightseeingPair(new int[] {8, 1, 5, 2, 6}));

//        System.out.println(generateMatrix(1));
//        System.out.println(generateMatrix(3));
//        System.out.println(generateMatrix(4));

//        System.out.println(dayOfYear("2019-02-10"));

//        System.out.println(subarraysDivByK(new int[] {-1, -9, -4, 0}, 9));

//        System.out.println(Arrays.toString(prevPermOpt1(new int[] {1, 9, 4, 6, 7})));
//        System.out.println(Arrays.toString(prevPermOpt1(new int[] {3, 1, 1, 3})));

//        System.out.println(triangleNumber(new int[] {2, 2, 3, 4}));

//        System.out.println(numMatchingSubseq("abcde", new String[] {"a", "bb", "acd", "ace"}));

//        System.out.println(removeDuplicates(new int[] {1, 1, 1, 2, 2, 3}));
//        System.out.println(removeDuplicates(new int[] {0, 0, 1, 1, 1, 1, 2, 3, 3}));

//        System.out.println(groupThePeople(new int[] {3, 3, 3, 3, 3, 1, 3}));

//        System.out.println(fractionAddition("-1/2+1/2+1/3"));
//        System.out.println(fractionAddition("5/3+1/3"));

//        System.out.println(brokenCalc(2, 3));
//        System.out.println(brokenCalc(5, 8));
//        System.out.println(brokenCalc(3, 10));
//        System.out.println(brokenCalc(1024, 1));

//        System.out.println(allPathsSourceTarget(new int[][] {{1, 2}, {3}, {3}, {}}));

//        System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
//        System.out.println(minRemoveToMakeValid("a)b(c)d"));
//        System.out.println(minRemoveToMakeValid("))(("));

//        System.out.println(ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log")));

//        List<List<Integer>> nums = new ArrayList<>();
//        nums.add(Arrays.asList(4, 10, 15, 24, 26));
//        nums.add(Arrays.asList(0, 9, 12, 20));
//        nums.add(Arrays.asList(5, 18, 22, 30));
//        System.out.println(Arrays.toString(smallestRange(nums)));
//        nums.clear();
//        nums.add(Arrays.asList(1, 3, 5, 7, 9, 10));
//        nums.add(Arrays.asList(2, 4, 6, 8, 10));
//        System.out.println(Arrays.toString(smallestRange(nums)));

//        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
//        System.out.println(minWindow("a", "aa"));

//        System.out.println(Arrays.toString(maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3)));
//        System.out.println(Arrays.toString(maxSlidingWindow(new int[] {1, 3, 1, 2, 0, 5}, 3)));

//        System.out.println(findSubstring("barfoothefoobarman", new String[] {"foo", "bar"}));

//        System.out.println(compress(new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
//        System.out.println(compress(new char[] {'a'}));
//        System.out.println(compress(new char[] {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));

//        System.out.println(alphabetBoardPath("leet"));
//        System.out.println(alphabetBoardPath("zdz"));

//        System.out.println(largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}));

//        System.out.println(combinationSum3(3, 7));
//        System.out.println(combinationSum3(3, 9));

//        System.out.println(Arrays.toString(advantageCount(new int[] {2, 7, 11, 15}, new int[] {1, 10, 4, 11})));

//        System.out.println(maxSubarraySumCircular(new int[] {1, -2, 3, -2}));
//        System.out.println(maxSubarraySumCircular(new int[] {5, -3, 5}));
//        System.out.println(maxSubarraySumCircular(new int[] {3, -1, 2, -1}));
//        System.out.println(maxSubarraySumCircular(new int[] {3, -2, 2, -3}));
//        System.out.println(maxSubarraySumCircular(new int[] {-2, -3, -1}));

//        System.out.println(findPeakElement(new int[] {1, 2, 3, 1}));
//        System.out.println(findPeakElement(new int[] {1, 2, 1, 3, 5, 6, 4}));

//        System.out.println(minDominoRotations(new int[] {2, 1, 2, 4, 2, 2}, new int[] {5, 2, 6, 2, 3, 2}));
//        System.out.println(minDominoRotations(new int[] {3, 5, 1, 2, 3}, new int[] {3, 6, 3, 3, 4}));
//        System.out.println(minDominoRotations(new int[] {3, 5, 1, 2, 3}, new int[] {3, 3, 3, 3, 3}));

//        System.out.println(maxTurbulenceSize(new int[] {9, 4, 2, 10, 7, 8, 8, 1, 9}));

//        System.out.println(shortestCompletingWord("1s3 PSt", new String[] {"step", "steps", "stripe", "stepple"}));
//        System.out.println(shortestCompletingWord("1s3 456", new String[] {"looks", "pest", "stew", "show"}));

//        System.out.println(partitionDisjoint(new int[] {5, 0, 3, 8, 6}));

//        System.out.println(numSubarrayBoundedMax(new int[] {2, 1, 4, 3}, 2, 3));
//        System.out.println(numSubarrayBoundedMax(new int[] {2, 9, 2, 5, 6}, 2, 8));

//        System.out.println(numSubarrayProductLessThanK(new int[] {10, 5, 2, 6}, 100));
//        System.out.println(numSubarrayProductLessThanK(new int[] {1, 1, 1}, 1));

//        System.out.println(longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));

//        System.out.println(wordBreak("leetcode", Arrays.asList("leet", "code")));

//        System.out.println(findTargetSumWays(new int[] {1, 1, 1, 1, 1}, 3));
//        System.out.println(findTargetSumWays2(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 1}, 1));

//        System.out.println(findAnagrams("cbaebabacd", "abc"));
//        System.out.println(findAnagrams("abaacbabc", "abc"));

//        System.out.println(decodeString("3[a]2[bc]"));
//        System.out.println(decodeString("3[a2[c]]"));
//        System.out.println(decodeString("2[abc]3[cd]ef"));
    }

    // 508. Most Frequent Subtree Sum
    public static int[] findFrequentTreeSum(TreeNode root) {
       Map<Integer, Integer> map = new HashMap<>();
       int[] maxT = new int[1];
       findFrequentTreeSumHelper(root, map, maxT);
       return  map.entrySet().stream().filter(o -> o.getValue().intValue() == maxT[0]).mapToInt(Map.Entry::getKey).toArray();
    }

    private static int findFrequentTreeSumHelper(TreeNode root, Map<Integer, Integer> map, int[] maxT) {
        if (root == null) {
            return 0;
        }
        int left = findFrequentTreeSumHelper(root.left, map, maxT);
        int right = findFrequentTreeSumHelper(root.right, map, maxT);
        int result = left + right + root.val;
        map.put(result, map.getOrDefault(result, 0) + 1);
        maxT[0] = Math.max(maxT[0], map.get(result));
        return result;
    }

    // 106. Construct Binary Tree from Inorder and Postorder Traversal
    public TreeNode buildTree1(int[] inorder, int[] postorder) {
        return buildTreeHelper1(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTreeHelper1(int[] in, int inL, int inR, int[] post, int postL, int postR) {
        if (inL > inR) {
            return null;
        }
        TreeNode root = new TreeNode(post[postR]);
        int k = 0;
        for (int i = inL; i <= inR; i++) {
            if (in[i] == post[postR]) {
                k = i;
                break;
            }
        }
        root.left = buildTreeHelper(in, inL, k - 1, post, postL, k - 1 - inL + postL);
        root.left = buildTreeHelper(in, k + 1, inR, post, k - inR + postR, postR - 1);
        return root;
    }

    // 637. Average of Levels in Binary Tree
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.remove();
                sum += cur.val;
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            res.add(sum / size);
        }
        return res;
    }

    // 107. Binary Tree Level Order Traversal II
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> layer = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.remove();
                layer.add(cur.val);
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            res.addFirst(layer);
        }
        return res;
    }

    // 103. Binary Tree Zigzag Level Order Traversal
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        boolean flag = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> layer = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.remove();
                if (flag) {
                    layer.addLast(cur.val);
                } else {
                    layer.addFirst(cur.val);
                }
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            flag = !flag;
            res.add(layer);
        }
        return res;
    }

    // 337. House Robber III
    public static int rob(TreeNode root) {
//        return robHelper(root);

        int[] res = robHelper2(root);
        return Math.max(res[0], res[1]);
    }

    // 效率很好
    private static int[] robHelper2(TreeNode root) {
        if (root == null) {
            return new int[] {0, 0};
        }
        int[] left = robHelper2(root.left);
        int[] right = robHelper2(root.right);
        int rob = root.val + left[0] + right[0];
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[] {notRob, rob};
    }

    private static int robHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int rob = root.val;
        if (root.left != null) {
            rob += robHelper(root.left.left) + robHelper(root.left.right);
        }
        if (root.right != null) {
            rob += robHelper(root.right.left) + robHelper(root.right.right);
        }
        int notRob = robHelper(root.left) + robHelper(root.right);
        return Math.max(rob, notRob);
    }

    // 322. Coin Change
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
            for (int x : coins) {
                if (i - x >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - x] + 1);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    // 394. Decode String
    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']') {
                StringBuilder encoded = new StringBuilder();
                while (stack.peek() != '[') {
                    encoded.append(stack.pop());
                }
                encoded = encoded.reverse();
                stack.pop();
                StringBuilder count = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    count.append(stack.pop());
                }
                count = count.reverse();
                for (int j = Integer.valueOf(count.toString()); j > 0; j--) {
                    for (char cc : encoded.toString().toCharArray()) {
                        stack.push(cc);
                    }
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }

    // 438. Find All Anagrams in a String
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int lenS = s.length(), lenP = p.length();
        if (lenP > lenS) {
            return res;
        }
        int[] count = new int[26];
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }
        int unique = (int) Arrays.stream(count).filter(k -> k > 0).count();
        int fit = 0;
        int[] slide = new int[26];
        for (int i = 0; i < lenP; i++) {
            int index = s.charAt(i) - 'a';
            slide[index]++;
            if (slide[index] == count[index]) {
                fit++;
            } else if (slide[index] == count[index] + 1) {
                fit--;
            }
        }
        if (fit == unique) {
            res.add(0);
        }
        for (int i = lenP; i < lenS; i++) {
            int index = s.charAt(i) - 'a';
            slide[index]++;
            if (count[index] == slide[index]) {
                fit++;
            } else if (slide[index] == count[index] + 1) {
                fit--;
            }
            index = s.charAt(i - lenP) - 'a';
            slide[index]--;
            if (count[index] == slide[index]) {
                fit++;
            } else if (slide[index] == count[index] - 1) {
                fit--;
            }
            if (fit == unique) {
                res.add(i - lenP + 1);
            }
        }
        return res;
    }

    // 494. Target Sum (solution 2)
    // 相关问题Ksum、Uncertain sum（子集和问题）
    // https://blog.csdn.net/Deeven123/article/details/82925433
    public static int findTargetSumWays2(int[] nums, int S) {
        int sum = Arrays.stream(nums).sum();
        if (sum < S) {
            return 0;
        }
        if (((sum + S) & 1) == 1) {
            return 0;
        }
        int target = (sum + S) / 2;
        return uncertainSum2(nums, target);
    }

    // Uncertain sum（子集和问题）
    private static int uncertainSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[][] dp = new int[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= nums[i - 1]) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[n][target];
    }

    // Uncertain sum（子集和问题）
    private static int uncertainSum2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int x : nums) {
            int i = target;
            while (i >= x) {
                dp[i] += dp[i - x];
                i--;
            }
        }
        return dp[target];
    }

    // 494. Target Sum
    public static int findTargetSumWays(int[] nums, int S) {
        int[] ans = new int[1];
        findTargetSumWaysHelper(nums, 0, S, ans);
        return ans[0];
    }

    private static void findTargetSumWaysHelper(int[] nums, int i, int sum, int[] ans) {
        if (i == nums.length) {
            if (sum == 0) {
                ans[0]++;
            }
            return;
        }
        findTargetSumWaysHelper(nums, i + 1, sum - nums[i], ans);
        findTargetSumWaysHelper(nums, i + 1, sum + nums[i], ans);
    }

    // 543. Diameter of Binary Tree
    public static int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1];
        diameterOfBinaryTreeHelper(root, max);
        return max[0];
    }

    private static int diameterOfBinaryTreeHelper(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }
        int l = diameterOfBinaryTreeHelper(root.left, max);
        int r = diameterOfBinaryTreeHelper(root.right, max);
        max[0] = Math.max(max[0], l + r);
        return Math.max(l, r) + 1;
    }

    // 617. Merge Two Binary Trees
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    // 139. Word Break
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = wordDict.stream().collect(Collectors.toSet());
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (dp[i] && dict.contains(s.substring(i, j))) {
                    dp[j] = true;
                }
            }
        }
        return dp[n];
    }

    // 221. Maximal Square
    public static int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length, n = matrix[0].length;
        int res = 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i] - '0';
            res = Math.max(res, dp[0][i]);
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = matrix[i][0] - '0';
            res = Math.max(res, dp[i][0]);
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = matrix[i][j] == '0' ? 0 : Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                res = Math.max(res, dp[i][j]);
            }
        }
        return res * res;
    }

    // 987. Vertical Order Traversal of a Binary Tree
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<Node2> list = new ArrayList<>();
        int[] bound = new int[2];
        verticalTraversalHelper(root, list, bound, 0, 0);
        list.sort(Comparator.comparingInt(Node2::getLayer).thenComparingInt(Node2::getIndex).thenComparingInt(Node2::getVal));
        int size = bound[1] - bound[0] + 1;
        List<List<Integer>> res = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            res.add(new ArrayList<>());
        }
        for (Node2 node : list) {
            res.get(node.index - bound[0]).add(node.val);
        }
        return res;
    }

    private void verticalTraversalHelper(TreeNode root, List<Node2> list, int[] bound, int index, int layer) {
        if (root == null) {
            return;
        }
        bound[0] = Math.min(bound[0], index);
        bound[1] = Math.max(bound[1], index);
        list.add(new Node2(index, layer, root.val));
        verticalTraversalHelper(root.left, list, bound, index - 1, layer + 1);
        verticalTraversalHelper(root.right, list, bound, index + 1, layer + 1);
    }

    private static class Node2 {
        int index;
        int layer;
        int val;

        public Node2(int index, int layer, int val) {
            this.index = index;
            this.layer = layer;
            this.val = val;
        }

        public int getIndex() {
            return index;
        }

        public int getLayer() {
            return layer;
        }

        public int getVal() {
            return val;
        }
    }

    // 226. Invert Binary Tree
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    // 200. Number of Islands
    public static int numIslands(char[][] grid) {
        int res = 0;
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return res;
        }
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
                    queue.add(new Pair<>(i, j));
                    grid[i][j] = '0';
                    while (!queue.isEmpty()) {
                        Pair<Integer, Integer> cur = queue.remove();
                        int cur_i = cur.getElement0();
                        int cur_j = cur.getElement1();
                        if (cur_i + 1 < m && grid[cur_i + 1][cur_j] == '1') {
                            queue.add(new Pair<>(cur_i + 1, cur_j));
                            grid[cur_i + 1][cur_j] = '0';
                        }
                        if (cur_i - 1 >= 0 && grid[cur_i - 1][cur_j] == '1') {
                            queue.add(new Pair<>(cur_i - 1, cur_j));
                            grid[cur_i - 1][cur_j] = '0';
                        }
                        if (cur_j + 1 < n && grid[cur_i][cur_j + 1] == '1') {
                            queue.add(new Pair<>(cur_i, cur_j + 1));
                            grid[cur_i][cur_j + 1] = '0';
                        }
                        if (cur_j - 1 >= 0 && grid[cur_i][cur_j - 1] == '1') {
                            queue.add(new Pair<>(cur_i, cur_j - 1));
                            grid[cur_i][cur_j - 1] = '0';
                        }
                    }
                    res++;
                }
            }
        }
        return res;
    }

    // 198. House Robber
    public static int rob(int[] nums) {
        int pre = 0, cur = 0;
        for (int x : nums) {
            int temp = cur;
            cur = Math.max(pre + x, cur);
            pre = temp;
        }
        return cur;
    }

    // 102. Binary Tree Level Order Traversal
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return res;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.remove();
                list.add(cur.val);
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            res.add(list);
        }
        return res;
    }

    // 98. Validate Binary Search Tree
    public static boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        isValidBSTHelper(root, list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static void isValidBSTHelper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        isValidBSTHelper(root.left, list);
        list.add(root.val);
        isValidBSTHelper(root.right, list);
    }

    // 96. Unique Binary Search Trees
    public static int numTrees(int n) {
        long cur = 1;
        for (int i = 1; i < n; i++) {
            cur = cur * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) cur;
    }

    // 39. Combination Sum
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combinationSumHelper(candidates, target, 0, list, res);
        return res;
    }

    private static void combinationSumHelper(int[] candidates, int target, int last, List<Integer> list, List<List<Integer>> res) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = last; i < candidates.length; i++) {
            list.add(candidates[i]);
            combinationSumHelper(candidates, target - candidates[i], i, list, res);
            list.remove(list.size() - 1);
        }
    }

    // 22. Generate Parentheses
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesisHelper(n, n, "", res);
        return res;
    }

    private static void generateParenthesisHelper(int l, int r, String s, List<String> res) {
        if (l < 0 || r < 0 || l > r) {
            return;
        }
        if (l == 0 && r == 0) {
            res.add(s);
            return;
        }
        generateParenthesisHelper(l - 1, r, s + "(", res);
        generateParenthesisHelper(l, r - 1, s + ")", res);
    }

    // 1290. Convert Binary Number in a Linked List to Integer
    public static int getDecimalValue(ListNode head) {
        int res = 0;
        while (head != null) {
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }

    // 1019. Next Greater Node In Linked List
    // 单调栈
    public static int[] nextLargerNodes(ListNode head) {
        Stack<Node1> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (head != null) {
            res.add(0);
            while (!stack.isEmpty() && stack.peek().value < head.val) {
                res.set(stack.pop().index, head.val);
            }
            stack.push(new Node1(i, head.val));
            head = head.next;
            i++;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    // 430. Flatten a Multilevel Doubly Linked List
    public static Node flatten(Node head) {
        Node cur = head;
        while (cur != null) {
            if (cur.child != null) {
                Node h = flatten(cur.child);
                cur.child = null;
                Node next = cur.next;
                cur.next = h;
                h.prev = cur;
                while (h.next != null) {
                    h = h.next;
                }
                h.next = next;
                if (next == null) {
                    return head;
                }
                next.prev = h;
                cur = next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    private class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    ;

    // 25. Reverse Nodes in k-Group
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode pre = null, cur = head, next;
        while (cur != null) {
            int i = 1;
            while (i < k && cur != null) {
                cur = cur.next;
                i++;
            }
            if (cur == null) {
                return head;
            }
            next = cur.next;
            ListNode[] nodes;
            if (pre == null) {
                nodes = reverse(head, cur);
                head = nodes[0];
            } else {
                nodes = reverse(pre.next, cur);
                pre.next = nodes[0];
            }
            nodes[1].next = next;
            pre = nodes[1];
            cur = next;
        }
        return head;
    }

    private static ListNode[] reverse(ListNode head, ListNode tail) {
        ListNode pre = null, cur = head, next = cur.next;
        while (cur != tail) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next.next;
        }
        cur.next = pre;
        return new ListNode[] {tail, head};
    }

    // 128. Longest Consecutive Sequence
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int res = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    count++;
                    num++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }

    // 713. Subarray Product Less Than K
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) {
            return 0;
        }
        int l = 0, r = 1, prod = nums[0], n = nums.length, res = 0;
        while (r < n) {
            if (prod < k) {
                res += r - l;
                prod *= nums[r++];
            } else {
                while (l < r && prod >= k) {
                    prod /= nums[l++];
                }
                if (l == r) {
                    prod *= nums[r++];
                }
            }
        }
        while (l < n && prod >= k) {
            prod /= nums[l++];
        }
        return res + r - l;
    }

    // 1300. Sum of Mutated Array Closest to Target
    public static int findBestValue(int[] arr, int target) {
        int l = 0, r = 100000;
        while (l < r) {
            int mid = (l + r) / 2;
            int b = sum(arr, mid);
            if (b < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        int sum1 = sum(arr, l - 1);
        int sum2 = sum(arr, l);
        if (sum2 - target < target - sum1) {
            return l;
        }
        return l - 1;
    }

    private static int sum(int[] arr, int val) {
        int res = 0;
        for (int x : arr) {
            res += Math.min(x, val);
        }
        return res;
    }

    // 81. Search in Rotated Sorted Array II
    public static boolean searchII(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[l] == nums[mid]) {
                l++;
            } else if (nums[l] < nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }

    // 795. Number of Subarrays with Bounded Maximum
    public static int numSubarrayBoundedMax(int[] A, int L, int R) {
        int count1 = 0, count2 = 0, cur1 = 0, cur2 = 0;
        for (int x : A) {
            cur1 = x < L ? cur1 + 1 : 0;
            cur2 = x <= R ? cur2 + 1 : 0;
            count1 += cur1;
            count2 += cur2;
        }
        return count2 - count1;
    }

    // 54. Spiral Matrix
    public static List<Integer> spiralOrder(int[][] matrix) {
        List ans = new ArrayList();
        if (matrix.length == 0) {
            return ans;
        }
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) {
                ans.add(matrix[r1][c]);
            }
            for (int r = r1 + 1; r <= r2; r++) {
                ans.add(matrix[r][c2]);
            }
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) {
                    ans.add(matrix[r2][c]);
                }
                for (int r = r2; r > r1; r--) {
                    ans.add(matrix[r][c1]);
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
    }

    // 1299. Replace Elements with Greatest Element on Right Side
    public static int[] replaceElements(int[] arr) {
        int n = arr.length, max = arr[n - 1];
        arr[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            int cur = arr[i];
            arr[i] = Math.max(max, arr[i + 1]);
            max = cur;
        }
        return arr;
    }

    // 1304. Find N Unique Integers Sum up to Zero
    public static int[] sumZero(int n) {
        int[] res = new int[n];
        res[0] = -n / 2;
        if ((n & 1) == 1) {
            for (int i = 1; i < n; i++) {
                res[i] = res[i - 1] + 1;
            }
        } else {
            for (int i = 1; i < n; i++) {
                if (res[i - 1] == -1) {
                    res[i] = 1;
                } else {
                    res[i] = res[i - 1] + 1;
                }
            }
        }
        return res;
    }

    // 915. Partition Array into Disjoint Intervals
    public static int partitionDisjoint(int[] A) {
        int n = A.length;
        int[] maxLeft = new int[n];
        int[] minRight = new int[n];
        maxLeft[0] = A[0];
        minRight[n - 1] = A[n - 1];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], A[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(minRight[i + 1], A[i]);
        }
        for (int i = 1; i < n; i++) {
            if (maxLeft[i - 1] <= minRight[i]) {
                return i;
            }
        }
        return -1;
    }

    // 891. Sum of Subsequence Widths
    public static int sumSubseqWidths(int[] A) {
        int MOD = 1000000007;
        long[] pow = new long[A.length];
        pow[0] = 1;
        for (int i = 1; i < A.length; i++) {
            pow[i] = pow[i - 1] * 2 % MOD;
        }
        long res = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            res = (res + (pow[i] - pow[A.length - 1 - i]) * A[i]) % MOD;
        }
        return (int) res;
    }

    // 748. Shortest Completing Word
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> target = countWord(licensePlate);
        int minLen = Integer.MAX_VALUE;
        String res = null;
        for (String word : words) {
            Map<Character, Integer> cur = countWord(word);
            if (isValid(target, cur) && word.length() < minLen) {
                res = word;
                minLen = word.length();
            }
        }
        return res;
    }

    private static boolean isValid(Map<Character, Integer> target, Map<Character, Integer> cur) {
        for (Map.Entry<Character, Integer> entry : target.entrySet()) {
            Character key = entry.getKey();
            if (!cur.containsKey(key)) {
                return false;
            }
            if (target.get(key) > cur.get(key)) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> countWord(String word) {
        Map<Character, Integer> res = new HashMap<>();
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                c = (char) (c - 'A' + 'a');
            }
            if (Character.isLowerCase(c)) {
                res.put(c, res.getOrDefault(c, 0) + 1);
            }
        }
        return res;
    }

    // 978. Longest Turbulent Subarray
    public static int maxTurbulenceSize(int[] A) {
        int n = A.length;
        int res = 1;
        int anchor = 0;
        int i = 1;
        while (i < n) {
            while (i < n - 1 && Integer.compare(A[i - 1], A[i]) * Integer.compare(A[i], A[i + 1]) == -1) {
                i++;
            }
            if (A[i] != A[i - 1]) {
                res = Math.max(res, i - anchor + 1);
            }
            anchor = i;
            i = anchor + 1;
        }
        return res;
    }

    // 945. Minimum Increment to Make Array Unique
    public static int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int res = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                res += A[i - 1] + 1 - A[i];
                A[i] = A[i - 1] + 1;
            }
        }
        return res;
    }

    // 1007. Minimum Domino Rotations For Equal Row
    public static int minDominoRotations(int[] A, int[] B) {
        Set<Integer>[] a = new Set[7];
        Set<Integer>[] b = new Set[7];
        for (int i = 1; i <= 6; i++) {
            a[i] = new HashSet<>();
            b[i] = new HashSet<>();
        }
        for (int i = 0; i < A.length; i++) {
            a[A[i]].add(i);
            b[B[i]].add(i);
        }
        int res = 2000001;
        for (int i = 1; i <= 6; i++) {
            Set<Integer> temp = new HashSet<>();
            temp.addAll(a[i]);
            temp.addAll(b[i]);
            if (temp.size() == A.length) {
                res = Math.min(res, Math.min(a[i].size(), b[i].size()) - (a[i].size() + b[i].size() - A.length));
            }
        }
        return res == 2000001 ? -1 : res;
    }

    // 162. Find Peak Element
    public static int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    // 918. Maximum Sum Circular Subarray
    public static int maxSubarraySumCircular(int[] A) {
        int sum = 0;
        for (int x : A) {
            sum += x;
        }
        int res1 = kanade(A, 0, A.length - 1, 1);
        int res2 = sum + kanade(A, 0, A.length - 2, -1);
        int res3 = sum + kanade(A, 1, A.length - 1, -1);
        return Math.max(res1, Math.max(res2, res3));
    }

    private static int kanade(int[] nums, int i, int j, int sign) {
        int cur = Integer.MIN_VALUE, res = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            cur = Math.max(cur, 0) + sign * nums[k];
            res = Math.max(res, cur);
        }
        return res;
    }

    // 1252. Cells with Odd Values in a Matrix
    public static int oddCells(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int[] col = new int[m];
        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (((row[i] + col[j]) & 1) == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    // 1277. Count Square Submatrices with All Ones
    public static int countSquares(int[][] matrix) {
        int res = 0;
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j];
                } else if (matrix[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Math.min(matrix[i - 1][j], Math.min(matrix[i][j - 1], matrix[i - 1][j - 1])) + 1;
                }
                res += dp[i][j];
            }
        }
        return res;
    }

    // 870. Advantage Shuffle
    // 田忌赛马
    public static int[] advantageCount(int[] A, int[] B) {
        int[] a = A.clone();
        Arrays.sort(a);
        int[] b = B.clone();
        Arrays.sort(b);
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            map.computeIfAbsent(B[i], k -> new LinkedList<>()).add(i);
        }
        int[] res = new int[a.length];
        int i = 0, j = 0, index = b.length - 1;
        while (i < a.length) {
            if (a[i] > b[j]) {
                res[map.get(b[j++]).remove()] = a[i++];
            } else {
                res[map.get(b[index--]).remove()] = a[i++];
            }
        }
        return res;
    }

    // 719. Find K-th Smallest Pair Distance
    public static int smallestDistancePair(int[] nums, int k) {
//        // Time Limit Exceeded
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
//        for (int i = nums.length - 1; i >= 0; i--) {
//            for (int j = i - 1; j >= 0; j--) {
//                int dis = Math.abs(nums[i] - nums[j]);
//                if (maxHeap.size() < k) {
//                    maxHeap.add(dis);
//                } else if (dis < maxHeap.peek()) {
//                    maxHeap.remove();
//                    maxHeap.add(dis);
//                }
//            }
//        }
//        return maxHeap.peek();

        Arrays.sort(nums);
        int maxDis = nums[nums.length - 1] - nums[0];
        int[] count = new int[maxDis + 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                count[nums[i] - nums[j]]++;
            }
        }
        int c = 0;
        for (int i = 0; i <= maxDis; i++) {
            if (c + count[i] >= k) {
                return i;
            }
            c += count[i];
        }
        return 0;
    }

    // 216. Combination Sum III
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        combinationSum3Helper(k, n, 1, res, new Stack<>());
        return res;
    }

    public static void combinationSum3Helper(int k, int n, int begin, List<List<Integer>> res, Stack<Integer> list) {
        if (k < 0) {
            return;
        }
        if (k == 0 && n == 0) {
            List<Integer> temp = new ArrayList<>(list);
            res.add(temp);
            return;
        }
        for (int i = begin; i <= 10 - k; i++) {
            list.push(i);
            combinationSum3Helper(k - 1, n - i, i + 1, res, list);
            list.pop();
        }
    }

    // 1266. Minimum Time Visiting All Points
    public static int minTimeToVisitAllPoints(int[][] points) {
        int preX = points[0][0], preY = points[0][1];
        int res = 0;
        for (int i = 1; i < points.length; i++) {
            int curX = points[i][0], curY = points[i][1];
            res += Math.max(Math.abs(curX - preX), Math.abs(curY - preY));
            preX = curX;
            preY = curY;
        }
        return res;
    }

    // 670. Maximum Swap
    public static int maximumSwap(int num) {
        char[] A = Integer.toString(num).toCharArray();
        int[] last = new int[10];
        for (int i = 0; i < A.length; i++) {
            last[A[i] - '0'] = i;
        }

        for (int i = 0; i < A.length; i++) {
            for (int d = 9; d > A[i] - '0'; d--) {
                if (last[d] > i) {
                    char tmp = A[i];
                    A[i] = A[last[d]];
                    A[last[d]] = tmp;
                    return Integer.valueOf(new String(A));
                }
            }
        }
        return num;
    }

    // 84. Largest Rectangle in Histogram
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
                res = Math.max(res, heights[stack.pop()] * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            res = Math.max(res, heights[stack.pop()] * (heights.length - stack.peek() - 1));
        }
        return res;
    }

    // 962. Maximum Width Ramp
    public static int maxWidthRamp(int[] A) {
        int N = A.length;
        Integer[] B = new Integer[N];
        for (int i = 0; i < N; ++i) {
            B[i] = i;
        }

        Arrays.sort(B, (i, j) -> ((Integer) A[i]).compareTo(A[j]));

        int ans = 0;
        int m = N;
        for (int i : B) {
            ans = Math.max(ans, i - m);
            m = Math.min(m, i);
        }

        return ans;
    }

    // 90. Subsets II
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Collections.EMPTY_LIST);
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        for (int num : nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> tmpList = new ArrayList<>(res.get(i));
                tmpList.add(num);
                res.add(tmpList);
            }
        }
        return res.stream().distinct().collect(Collectors.toList());
    }

    // 954. Array of Doubled Pairs
    public static boolean canReorderDoubled(int[] A) {
        TreeMap<Integer, Integer> posMap = new TreeMap<>();
        TreeMap<Integer, Integer> negMap = new TreeMap<>();
        int zeroCount = 0;
        for (int a : A) {
            if (a > 0) {
                posMap.put(a, posMap.getOrDefault(a, 0) + 1);
            } else if (a < 0) {
                negMap.put(-a, negMap.getOrDefault(-a, 0) + 1);
            } else {
                zeroCount++;
            }
        }
        if ((zeroCount & 1) == 1) {
            return false;
        }
        int size = posMap.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<Integer, Integer> entry = posMap.firstEntry();
            int key = entry.getKey();
            int value = entry.getValue();
            posMap.remove(key);
            Integer doubled = posMap.get(2 * key);
            if (doubled == null || doubled.intValue() < value) {
                return false;
            } else if (doubled > value) {
                posMap.put(2 * key, doubled - value);
            } else if (doubled == value) {
                posMap.remove(2 * key);
                i++;
            }
        }
        size = negMap.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<Integer, Integer> entry = negMap.firstEntry();
            int key = entry.getKey();
            int value = entry.getValue();
            negMap.remove(key);
            Integer doubled = negMap.get(2 * key);
            if (doubled == null || doubled.intValue() < value) {
                return false;
            } else if (doubled > value) {
                negMap.put(2 * key, doubled - value);
            } else if (doubled == value) {
                negMap.remove(2 * key);
                i++;
            }
        }
        return true;
    }

    // 229. Majority Element II
    public static List<Integer> majorityElementII(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int majorityA = nums[0], majorityB = nums[0];
        int countA = 0, countB = 0;
        for (int num : nums) {
            if (num == majorityA) {
                countA++;
                continue;
            }
            if (num == majorityB) {
                countB++;
                continue;
            }
            if (countA == 0) {
                majorityA = num;
                countA++;
                continue;
            }
            if (countB == 0) {
                majorityB = num;
                countB++;
                continue;
            }
            countA--;
            countB--;
        }
        countA = countB = 0;
        for (int num : nums) {
            if (num == majorityA) {
                countA++;
            } else if (num == majorityB) {
                countB++;
            }
        }
        if (countA > nums.length / 3) {
            res.add(majorityA);
        }
        if (countB > nums.length / 3) {
            res.add(majorityB);
        }
        return res;
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

    // 825. Friends Of Appropriate Ages
    public static int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age : ages) {
            count[age]++;
        }
        int res = 0;
        for (int ageA = 1; ageA <= 120; ageA++) {
            for (int ageB = 1; ageB <= ageA; ageB++) {
                if ((ageA < 100 && 100 < ageB) || ageA * 0.5 + 7 >= ageB) {
                    continue;
                }
                res += count[ageA] * count[ageB];
                if (ageA == ageB) {
                    res -= count[ageA];
                }
            }
        }
        return res;
    }

    // 120. Triangle
    public static int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        for (int i = 1; i < size; i++) {
            List<Integer> list = triangle.get(i);
            List<Integer> preList = triangle.get(i - 1);
            int tmpSize = list.size();
            list.set(0, preList.get(0) + list.get(0));
            for (int j = 1; j < tmpSize - 1; j++) {
                list.set(j, Math.min(preList.get(j - 1), preList.get(j)) + list.get(j));
            }
            list.set(tmpSize - 1, preList.get(tmpSize - 2) + list.get(tmpSize - 1));
        }
        return triangle.get(size - 1).stream().min(Comparator.comparingInt(Integer::intValue)).get();
    }

    // 73. Set Matrix Zeroes
    public static void setZeroes(int[][] matrix) {
        Boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;

        for (int i = 0; i < R; i++) {

            // Since first cell for both first row and first column is the same i.e. matrix[0][0]
            // We can use an additional variable for either the first row/column.
            // For this solution we are using an additional variable for the first column
            // and using matrix[0][0] for the first row.
            if (matrix[i][0] == 0) {
                isCol = true;
            }

            for (int j = 1; j < C; j++) {
                // If an element is zero, we set the first element of the corresponding row and column to 0
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Iterate over the array once again and using the first row and first column, update the elements.
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // See if the first row needs to be set to zero as well
        if (matrix[0][0] == 0) {
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }

        // See if the first column needs to be set to zero as well
        if (isCol) {
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // 105. Construct Binary Tree from Preorder and Inorder Traversal
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private static TreeNode buildTreeHelper(int[] pre, int preL, int preR, int[] in, int inL, int inR) {
        if (preL > preR) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int k = 0;
        for (int i = inL; i <= inR; i++) {
            if (pre[preL] == in[i]) {
                k = i;
                break;
            }
        }
        root.left = buildTreeHelper(pre, preL + 1, preR - inR + k, in, inL, k - 1);
        root.right = buildTreeHelper(pre, preR - inR + k + 1, preR, in, k + 1, inR);
        return root;
    }

    // 695. Max Area of Island
    public static int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int count = 0;
                    Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
                    queue.add(new Pair<>(i, j));
                    grid[i][j] = 0;
                    while (!queue.isEmpty()) {
                        int size = queue.size();
                        count += size;
                        for (int k = 0; k < size; k++) {
                            Pair<Integer, Integer> cur = queue.remove();
                            int cur_i = cur.getElement0(), cur_j = cur.getElement1();
                            if (cur_i - 1 >= 0 && grid[cur_i - 1][cur_j] == 1) {
                                queue.add(new Pair<>(cur_i - 1, cur_j));
                                grid[cur_i - 1][cur_j] = 0;
                            }
                            if (cur_i + 1 < m && grid[cur_i + 1][cur_j] == 1) {
                                queue.add(new Pair<>(cur_i + 1, cur_j));
                                grid[cur_i + 1][cur_j] = 0;
                            }
                            if (cur_j - 1 >= 0 && grid[cur_i][cur_j - 1] == 1) {
                                queue.add(new Pair<>(cur_i, cur_j - 1));
                                grid[cur_i][cur_j - 1] = 0;
                            }
                            if (cur_j + 1 < n && grid[cur_i][cur_j + 1] == 1) {
                                queue.add(new Pair<>(cur_i, cur_j + 1));
                                grid[cur_i][cur_j + 1] = 0;
                            }
                        }
                    }
                    res = Math.max(res, count);
                }
            }
        }
        return res;
    }

    // 768. Max Chunks To Make Sorted II
    public static int maxChunksToSortedII(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int x : arr) {
            if (stack.isEmpty() || x >= stack.peek()) {
                stack.push(x);
            } else {
                int top = stack.pop();
                while (!stack.isEmpty() && x < stack.peek()) {
                    stack.pop();
                }
                stack.push(top);
            }
        }
        return stack.size();
    }

    // 1144. Decrease Elements To Make Array Zigzag
    public static int movesToMakeZigzag(int[] nums) {
        int sum1 = 0;
        for (int i = 0; i < nums.length; i += 2) {
            if (i == 0) {
                sum1 += Math.max(0, nums[i] - nums[i + 1] + 1);
            } else if (i == nums.length - 1) {
                sum1 += Math.max(0, nums[i] - nums[i - 1] + 1);
            } else {
                sum1 += Math.max(0, nums[i] - Math.min(nums[i - 1], nums[i + 1]) + 1);
            }
        }
        int sum2 = 0;
        for (int i = 1; i < nums.length; i += 2) {
            if (i == nums.length - 1) {
                sum2 += Math.max(0, nums[i] - nums[i - 1] + 1);
            } else {
                sum2 += Math.max(0, nums[i] - Math.min(nums[i - 1], nums[i + 1]) + 1);
            }
        }
        return Math.min(sum1, sum2);
    }

    // 1138. Alphabet Board Path
    public static String alphabetBoardPath(String target) {
        int x = 0, y = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : target.toCharArray()) {
            int x1 = (ch - 'a') % 5, y1 = (ch - 'a') / 5;
            sb.append(String.join("", Collections.nCopies(Math.max(0, y - y1), "U")) +
                    String.join("", Collections.nCopies(Math.max(0, x1 - x), "R")) +
                    String.join("", Collections.nCopies(Math.max(0, x - x1), "L")) +
                    String.join("", Collections.nCopies(Math.max(0, y1 - y), "D")) + "!");
            x = x1;
            y = y1;
        }
        return sb.toString();
    }

    // 443. String Compression
    public static int compress(char[] chars) {
        List<Character> res = new ArrayList<>();
        int n = chars.length, start = 0, end = 0, index = 0;
        while (end < n) {
            end = start + 1;
            while (end < n && chars[end] == chars[start]) {
                end++;
            }
            chars[index++] = chars[start];
            int count = end - start;
            if (count != 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
            start = end;
        }
        return index;
    }

    // 30. Substring with Concatenation of All Words
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        int wordNum = words.length;
        if (wordNum == 0) {
            return res;
        }
        int wordLen = words[0].length();
        HashMap<String, Integer> allWords = new HashMap<String, Integer>();
        for (String w : words) {
            int value = allWords.getOrDefault(w, 0);
            allWords.put(w, value + 1);
        }
        //将所有移动分成 wordLen 类情况
        for (int j = 0; j < wordLen; j++) {
            HashMap<String, Integer> hasWords = new HashMap<String, Integer>();
            int num = 0; //记录当前 HashMap2（这里的 hasWords 变量）中有多少个单词
            //每次移动一个单词长度
            for (int i = j; i < s.length() - wordNum * wordLen + 1; i = i + wordLen) {
                boolean hasRemoved = false; //防止情况三移除后，情况一继续移除
                while (num < wordNum) {
                    String word = s.substring(i + num * wordLen, i + (num + 1) * wordLen);
                    if (allWords.containsKey(word)) {
                        int value = hasWords.getOrDefault(word, 0);
                        hasWords.put(word, value + 1);
                        //出现情况三，遇到了符合的单词，但是次数超了
                        if (hasWords.get(word) > allWords.get(word)) {
                            // hasWords.put(word, value);
                            hasRemoved = true;
                            int removeNum = 0;
                            //一直移除单词，直到次数符合了
                            while (hasWords.get(word) > allWords.get(word)) {
                                String firstWord = s.substring(i + removeNum * wordLen, i + (removeNum + 1) * wordLen);
                                int v = hasWords.get(firstWord);
                                hasWords.put(firstWord, v - 1);
                                removeNum++;
                            }
                            num = num - removeNum + 1; //加 1 是因为我们把当前单词加入到了 HashMap 2 中
                            i = i + (removeNum - 1) * wordLen; //这里依旧是考虑到了最外层的 for 循环，看情况二的解释
                            break;
                        }
                        //出现情况二，遇到了不匹配的单词，直接将 i 移动到该单词的后边（但其实这里
                        //只是移动到了出现问题单词的地方，因为最外层有 for 循环， i 还会移动一个单词
                        //然后刚好就移动到了单词后边）
                    } else {
                        hasWords.clear();
                        i = i + num * wordLen;
                        num = 0;
                        break;
                    }
                    num++;
                }
                if (num == wordNum) {
                    res.add(i);
                }
                //出现情况一，子串完全匹配，我们将上一个子串的第一个单词从 HashMap2 中移除
                if (num > 0 && !hasRemoved) {
                    String firstWord = s.substring(i, i + wordLen);
                    int v = hasWords.get(firstWord);
                    hasWords.put(firstWord, v - 1);
                    num = num - 1;
                }

            }
        }
        return res;
    }

    // 239. Sliding Window Maximum
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        Deque<Integer> deque = new LinkedList<>();
        deque.add(0);
        for (int i = 1; i < k; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.getLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        res[index++] = nums[deque.getFirst()];
        for (int i = k; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.getFirst() <= i - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[i] >= nums[deque.getLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
            res[index++] = nums[deque.getFirst()];
        }
        return res;
    }

    // 76. Minimum Window Substring
    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        Map<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        Map<Character, Integer> windowCount = new HashMap<>();
        int l = 0, r = 0, count = 0, lenS = s.length();
        int start = -1, end = lenS + 1;
        while (r < lenS) {
            while (count < countT.size() && r < lenS) {
                char c = s.charAt(r);
                windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);
                if (countT.containsKey(c) && windowCount.get(c).equals(countT.get(c))) {
                    count++;
                }
                r++;
            }
            while (count == countT.size() && l < r) {
                char c = s.charAt(l);
                windowCount.put(c, windowCount.getOrDefault(c, 0) - 1);
                if (countT.containsKey(c) && windowCount.get(c) == countT.get(c) - 1) {
                    count--;
                    if (r - l < end - start) {
                        start = l;
                        end = r;
                    }
                }
                l++;
            }
        }
        return (start >= 0 && end <= lenS) ? s.substring(start, end) : "";
    }

    // 632. Smallest Range Covering Elements from K Lists
    public static int[] smallestRange(List<List<Integer>> nums) {
        final int k = nums.size();
        List<Node1> all = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            for (int num : nums.get(i)) {
                all.add(new Node1(i, num));
            }
        }
        all.sort((o1, o2) -> o1.value - o2.value);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(all.get(0).index, 1);
        final int size = all.size();
        int l = 0, r = 1, lres = all.get(0).value, rres = all.get(size - 1).value;
        while (r < size) {
            while (map.size() < k && r < size) {
                int key = all.get(r).index;
                map.put(key, map.getOrDefault(key, 0) + 1);
                r++;
            }
            while (map.size() == k && l < r) {
                int key = all.get(l).index;
                if (map.get(key) == 1) {
                    map.remove(key);
                    if (all.get(r - 1).value - all.get(l).value < rres - lres) {
                        rres = all.get(r - 1).value;
                        lres = all.get(l).value;
                    }
                } else {
                    map.put(key, map.get(key) - 1);
                }
                l++;
            }
        }
        return new int[] {lres, rres};
    }

    private static class Node1 {
        int index;
        int value;

        public Node1(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    // 127. Word Ladder
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        Set<String> set = new HashSet<>(wordList);
        set.add(endWord);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int res = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.remove();
                if (cur.equals(endWord)) {
                    return res;
                }
                wordMatch(cur, set, queue);
            }
            res++;
        }
        return 0;
    }

    private static void wordMatch(String word, Set<String> set, Queue<String> queue) {
        for (int i = 0; i < word.length(); i++) {
            char[] w = word.toCharArray();
            for (int j = 0; j < 26; j++) {
                char c = (char) ('a' + j);
                if (w[i] == c) {
                    continue;
                }
                w[i] = c;
                String s = String.valueOf(w);
                if (set.contains(s)) {
                    set.remove(s);
                    queue.offer(s);
                }
            }
        }
    }

    // 1249. Minimum Remove to Make Valid Parentheses
    public static String minRemoveToMakeValid(String s) {
        int n = s.length();
        boolean[] invalid = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                invalid[i] = true;
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    invalid[i] = true;
                } else {
                    invalid[stack.pop()] = false;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!invalid[i]) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    // 797. All Paths From Source to Target
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int n = graph.length;
        dfs(graph, n, path, 0, res, new boolean[n]);
        return res;
    }

    private static void dfs(int[][] graph, int n, List<Integer> path, int pos, List<List<Integer>> res, boolean[] visit) {
        path.add(pos);
        visit[pos] = true;
        if (pos == n - 1) {
            res.add(new ArrayList<>(path));
        } else {
            for (int next : graph[pos]) {
                if (!visit[next]) {
                    dfs(graph, n, path, next, res, visit);
                }
            }
        }
        path.remove(path.size() - 1);
        visit[pos] = false;
    }

    // 79. Word Search
    public static boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        char[] w = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (exist(board, i, j, w, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean exist(char[][] board, int i, int j, char[] word, int k) {
        if (k == word.length) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word[k]) {
            return false;
        }
        board[i][j] ^= 256;
        boolean exist = exist(board, i - 1, j, word, k + 1)
                || exist(board, i + 1, j, word, k + 1)
                || exist(board, i, j - 1, word, k + 1)
                || exist(board, i, j + 1, word, k + 1);
        board[i][j] ^= 256;
        return exist;
    }

    // 991. Broken Calculator
    public static int brokenCalc(int x, int y) {
        if (x >= y) {
            return x - y;
        }
        int res = 0;
        while (x < y) {
            if ((y & 1) == 1) {
                y++;
            } else {
                y /= 2;
            }
            res++;
        }
        return res + x - y;
    }

    // 592. Fraction Addition and Subtraction
    public static String fractionAddition(String expression) {
        int i = 0, n = expression.length();
        Fraction fraction = new Fraction(0, 1);
        while (i < n) {
            int j = i + 1;
            while (j < n && expression.charAt(j) != '+' && expression.charAt(j) != '-') {
                j++;
            }
            fraction = fraction.add(new Fraction(expression.substring(i, j)));
            i = j;
            if (i < n && expression.charAt(j) == '+') {
                i++;
            }
        }
        return fraction.numerator + "/" + fraction.denominator;
    }

    private static class Fraction {
        int numerator;
        int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public Fraction(String s) {
            String[] strs = s.split("/");
            this.numerator = Integer.valueOf(strs[0]);
            this.denominator = Integer.valueOf(strs[1]);
        }

        public Fraction add(Fraction addend) {
            int x = this.numerator * addend.denominator + addend.numerator * this.denominator;
            if (x == 0) {
                return new Fraction(0, 1);
            }
            int y = this.denominator * addend.denominator;
            int gcd = gcd(Math.abs(x), Math.abs(y));
            return new Fraction(x / gcd, y / gcd);
        }
    }

    public static int gcd(int m, int n) {
        return n == 0 ? m : gcd(n, m % n);
    }

    // 89. Gray Code
    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>((int) Math.pow(2, n));
        if (n == 0) {
            res.add(0);
            return res;
        }
        res.add(0);
        for (int i = 0; i < n; i++) {
            int temp = 1 << i;
            for (int j = res.size() - 1; j >= 0; j--) {
                res.add(res.get(j) ^ temp);
            }
        }
        return res;
    }

    // 1282. Group the People Given the Group Size They Belong To
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = groupSizes.length - 1; i >= 0; i--) {
            map.computeIfAbsent(groupSizes[i], k -> new ArrayList<>()).add(i);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int size = entry.getKey();
            List<Integer> list = entry.getValue();
            int count = list.size() / size;
            for (int i = 0; i < count; i++) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < size; j++) {
                    temp.add(list.get(i * size + j));
                }
                res.add(temp);
            }
        }
        return res;
    }

    // 975. Odd Even Jump
    public static int oddEvenJumps(int[] A) {
        int n = A.length;
        if (n <= 1) {
            return n;
        }
        boolean[] odd = new boolean[n];
        boolean[] even = new boolean[n];
        odd[n - 1] = even[n - 1] = true;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(A[n - 1], n - 1);
        for (int i = n - 2; i >= 0; i--) {
            if (map.containsKey(A[i])) {
                odd[i] = even[map.get(A[i])];
                even[i] = odd[map.get(A[i])];
            } else {
                Integer lower = map.lowerKey(A[i]);
                Integer higher = map.higherKey(A[i]);
                if (lower != null) {
                    even[i] = odd[map.get(lower)];
                }
                if (higher != null) {
                    odd[i] = even[map.get(higher)];
                }
            }
            map.put(A[i], i);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (odd[i]) {
                res++;
            }
        }
        return res;
    }

    // 80. Remove Duplicates from Sorted Array II
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int index = 0, i = 0;
        while (i < n) {
            int j = i + 1, count = 1;
            while (j < n && nums[j] == nums[i]) {
                count++;
                j++;
            }
            for (int k = 0; k < Math.min(2, count); k++) {
                nums[index++] = nums[i];
            }
            i = j;
        }
        return index;
    }

    // 18. 4Sum
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int l = j + 1, r = n - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return res.stream().collect(Collectors.toList());
    }

    // 15. 3Sum
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res.stream().collect(Collectors.toList());
    }

    // 16. 3Sum Closest
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
            }
        }
        return res;
    }

    // 792. Number of Matching Subsequences
    public static int numMatchingSubseq(String S, String[] words) {
        Map<Character, TreeSet<Integer>> map = new HashMap<>();
        for (int i = S.length() - 1; i >= 0; i--) {
            map.computeIfAbsent(S.charAt(i), k -> new TreeSet<>()).add(i);
        }
        int res = 0;
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (set.contains(word)) {
                res++;
                continue;
            }
            int pre = -1;
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!map.containsKey(c)) {
                    flag = false;
                    break;
                }
                Integer cur = map.get(c).higher(pre);
                if (cur == null) {
                    flag = false;
                    break;
                }
                pre = cur;
            }
            if (flag) {
                set.add(word);
                res++;
            }
        }
        return res;
    }

    // 611. Valid Triangle Number
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, res = 0;
        for (int c = n - 1; c >= 2; c--) {
            int a = 0, b = c - 1;
            while (a < b) {
                if (nums[a] + nums[b] > nums[c]) {
                    res += b - a;
                    b--;
                } else {
                    a++;
                }
            }
        }
        return res;
    }

    // 1053. Previous Permutation With One Swap
    public static int[] prevPermOpt1(int[] A) {
        int i = A.length - 2;
        while (i >= 0 && A[i] <= A[i + 1]) {
            i--;
        }
        if (i < 0) {
            return A;
        }
        int minIndex = i + 1;
        for (int j = minIndex + 1; j < A.length; j++) {
            if (A[j] < A[i] && A[j] > A[i + 1]) {
                minIndex = j;
            }
        }
        swap(A, i, minIndex);
        return A;
    }

    // 974. Subarray Sums Divisible by K
    public static int subarraysDivByK(int[] A, int K) {
        int n = A.length, res = 0;
        int[] preSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + A[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int mod = (preSum[i] % K + K) % K;
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        for (int value : map.values()) {
            if (value > 1) {
                res += value * (value - 1) / 2;
            }
        }
        return res + map.getOrDefault(0, 0);
    }

    // 873. Length of Longest Fibonacci Subsequence
//    public static int lenLongestFibSubseq(int[] A) {
//        int n = A.length;
//        int[][] dp = new int[n][n];
//    }

    // 63. Unique Paths II
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = 1 - obstacleGrid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = Math.min(1 - obstacleGrid[i][0], dp[i - 1][0]);
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = Math.min(1 - obstacleGrid[0][i], dp[0][i - 1]);
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    // 62. Unique Paths
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        Arrays.fill(dp[0], 1);
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    // 1154. Day of the Year
    public static int dayOfYear(String date) {
        int[] leap = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] common = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] strs = date.split("-");
        int year = Integer.valueOf(strs[0]);
        int month = Integer.valueOf(strs[1]) - 1;
        int day = Integer.valueOf(strs[2]);
        int res = 0;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            for (int i = 0; i < month; i++) {
                res += leap[i];
            }
        } else {
            for (int i = 0; i < month; i++) {
                res += common[i];
            }
        }
        res += day;
        return res;
    }

    // 1109. Corporate Flight Bookings
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for (int[] booking : bookings) {
            for (int i = booking[0] - 1; i < booking[1]; i++) {
                res[i] += booking[2];
            }
        }
        return res;
    }

    // 59. Spiral Matrix II
    public static int[][] generateMatrix(int n) {
        int[] dI = new int[] {0, 1, 0, -1};
        int[] dJ = new int[] {1, 0, -1, 0};
        int dire = 0, num = n * n, i = 0, j = 0, x = 1;
        int[][] res = new int[n][n];
        while (x <= num) {
            res[i][j] = x++;
            i += dI[dire];
            j += dJ[dire];
            if (i >= n || i < 0 || j >= n || j < 0 || res[i][j] != 0) {
                i -= dI[dire];
                j -= dJ[dire];
                dire = (dire + 1) % 4;
                i += dI[dire];
                j += dJ[dire];
            }
        }
        return res;
    }

    // 1014. Best Sightseeing Pair
    public static int maxScoreSightseeingPair(int[] A) {
        int preMax = A[0] + 0, n = A.length;
        int res = Integer.MIN_VALUE;
        for (int j = 1; j < n; j++) {
            res = Math.max(res, preMax + A[j] - j);
            preMax = Math.max(preMax, A[j] + j);
        }
        return res;
    }

    // 287. Find the Duplicate Number
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                return index + 1;
            }
            nums[index] = -nums[index];
        }
        return -1;
    }

    // 48. Rotate Image
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    // 1035. Uncrossed Lines
    public static int maxUncrossedLines(int[] A, int[] B) {
        int lenA = A.length, lenB = B.length;
        int[][] dp = new int[lenA + 1][lenB + 1];
        for (int i = 0; i < lenA; i++) {
            for (int j = 0; j < lenB; j++) {
                if (A[i] == B[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[lenA][lenB];
    }

    // 495. Teemo Attacking
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        int res = 0;
        int i = 0, n = timeSeries.length;
        while (i < n) {
            int j = i + 1;
            while (j < n && timeSeries[j] <= timeSeries[j - 1] + duration) {
                j++;
            }
            res += timeSeries[j - 1] - timeSeries[i] + duration;
            i = j;
        }
        return res;
    }

    // 667. Beautiful Arrangement II
    public static int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int c = 0;
        for (int v = 1; v < n - k; v++) {
            ans[c++] = v;
        }
        for (int i = 0; i <= k; i++) {
            ans[c++] = (i % 2 == 0) ? (n - k + i / 2) : (n - i / 2);
        }
        return ans;
    }

    // 769. Max Chunks To Make Sorted
    public static int maxChunksToSorted(int[] arr) {
        int ans = 0, max = 0;
        for (int i = 0; i < arr.length; ++i) {
            max = Math.max(max, arr[i]);
            if (max == i) {
                ans++;
            }
        }
        return ans;
    }

    // 565. Array Nesting
    public static int arrayNesting(int[] nums) {
        int res = 1;
        boolean[] vis = new boolean[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!vis[i]) {
                int index = i;
                Set<Integer> set = new HashSet<>();
                while (!set.contains(nums[index])) {
                    vis[index] = true;
                    set.add(nums[index]);
                    index = nums[index];
                }
                res = Math.max(set.size(), res);
            }
        }
        return res;
    }

    // 1233. Remove Sub-Folders from the Filesystem
    public static List<String> removeSubfolders(String[] folder) {
        return null;
    }

    // 1031. Maximum Sum of Two Non-Overlapping Subarrays
    public static int maxSumTwoNoOverlap(int[] A, int L, int M) {
        return 0;
    }

    // 1267. Count Servers that Communicate
    public static int countServers(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int numRows = grid.length;
        int numCols = grid[0].length;
        int rowCount[] = new int[numRows];
        int colCount[] = new int[numCols];
        int totalServers = 0;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (grid[row][col] == 1) {
                    rowCount[row]++;
                    colCount[col]++;
                    totalServers++;
                }
            }
        }
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (grid[row][col] == 1) {
                    if (rowCount[row] == 1 && colCount[col] == 1) {
                        totalServers--;
                    }
                }
            }
        }
        return totalServers;
    }

    // 78. Subsets
    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<Integer>[] res = new List[(int) Math.pow(2, n)];
        int index = 0;
        res[index++] = Collections.EMPTY_LIST;
        int end = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < end; j++) {
                List<Integer> tmp = new ArrayList<>();
                tmp.addAll(res[j]);
                tmp.add(nums[i]);
                res[index++] = tmp;
            }
            end *= 2;
        }
        return Arrays.stream(res).collect(Collectors.toList());
    }

    // 238. Product of Array Except Self
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int x = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            res[i] = res[i] * x;
            x *= nums[i];
        }
        return res;
    }

    // 969. Pancake Sorting
    public static List<Integer> pancakeSort(int[] A) {
        int n = A.length;
        List<Integer> res = new ArrayList<>();
        for (int i = n - 1; i > 0; i--) {
            if (A[i] == i + 1) {
                continue;
            }
            int index = 0;
            for (int j = 0; j < i; j++) {
                if (A[j] == i + 1) {
                    reverse(A, 0, j);
                    res.add(j + 1);
                }
            }
            reverse(A, 0, i);
            res.add(i + 1);
        }
        return res;
    }

    // 442. Find All Duplicates in an Array
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                res.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return res;
    }

    // 1222. Queens That Can Attack the King
    public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[][] seen = new boolean[8][8];
        for (int[] queen : queens) {
            seen[queen[0]][queen[1]] = true;
        }
        int[] dirs = {-1, 0, 1};
        for (int dx : dirs) {
            for (int dy : dirs) {
                if (dx == 0 && dy == 0) {
                    continue;
                }
                int x = king[0], y = king[1];
                while (x + dx >= 0 && x + dx < 8 && y + dy >= 0 && y + dy < 8) {
                    x += dx;
                    y += dy;
                    if (seen[x][y]) {
                        result.add(Arrays.asList(x, y));
                        break;
                    }
                }
            }
        }
        return result;
    }

    // 950. Reveal Cards In Increasing Order
    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = deck.length - 1; i >= 0; i--) {
            res.addFirst(deck[i]);
            if (i != 0) {
                res.offerFirst(res.pollLast());
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    // 1128. Number of Equivalent Domino Pairs
    public static int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        int res = 0;
        for (int[] domino : dominoes) {
            StringBuilder sb = new StringBuilder();
            if (domino[0] < domino[1]) {
                sb.append(domino[0]).append("_").append(domino[1]);
            } else {
                sb.append(domino[1]).append("_").append(domino[0]);
            }
            String key = sb.toString();
            if (map.containsKey(key)) {
                res += map.get(key);
            }
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return res;
    }

    static class Point {
        int x, y;

        public Point(int _x, int _y) {
            x = _x;
            y = _y;
        }
    }

    // 1018. Binary Prefix Divisible By 5
    public static List<Boolean> prefixesDivBy5(int[] A) {
        int num = 0;
        List<Boolean> res = new ArrayList<>();
        for (int x : A) {
            num = (num << 1 | x) % 5;
            res.add(num == 0);
        }
        return res;
    }

    // 1184. Distance Between Bus Stops
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dis1 = 0, len = distance.length;
        for (int i = start; i % len != destination; i++) {
            dis1 += distance[i % len];
        }
        int dis2 = 0;
        for (int i = destination; i % len != start; i++) {
            dis2 += distance[(i + len) % len];
        }
        return Math.min(dis1, dis2);
    }

    // 1013. Partition Array Into Three Parts With Equal Sum
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int x : A) {
            sum += x;
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;
        int count = 0;
        for (int i = 0; i < A.length; ) {
            int tmpSum = A[i];
            int j = i + 1;
            if (count < 2) {
                while (j < A.length && tmpSum != sum) {
                    tmpSum += A[j++];
                }
            } else {
                while (j < A.length) {
                    tmpSum += A[j++];
                }
            }
            count++;
            i = j;
        }
        return count == 3;
    }

    // 1089. Duplicate Zeros
    public static void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length_ = arr.length - 1;

        for (int left = 0; left <= length_ - possibleDups; left++) {

            if (arr[left] == 0) {

                if (left == length_ - possibleDups) {
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length_ - possibleDups;

        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }

    // 1260. Shift 2D Grid
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length, len = m * n;
        k %= len;
        for (int i = 0; i < (len - k) / 2; i++) {
            int temp = grid[i / n][i % n];
            grid[i / n][i % n] = grid[(len - k - 1 - i) / n][(len - k - 1 - i) % n];
            grid[(len - k - 1 - i) / n][(len - k - 1 - i) % n] = temp;
        }
        for (int i = 0; i < k / 2; i++) {
            int temp = grid[(len - k + i) / n][(len - k + i) % n];
            grid[(len - k + i) / n][(len - k + i) % n] = grid[(len - 1 - i) / n][(len - 1 - i) % n];
            grid[(len - 1 - i) / n][(len - 1 - i) % n] = temp;
        }
        for (int i = 0; i < len / 2; i++) {
            int temp = grid[i / n][i % n];
            grid[i / n][i % n] = grid[(len - 1 - i) / n][(len - 1 - i) % n];
            grid[(len - 1 - i) / n][(len - 1 - i) % n] = temp;
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(grid[i][j]);
            }
            res.add(list);
        }
        return res;
    }

    // 1287. Element Appearing More Than 25% In Sorted Array
    public static int findSpecialInteger(int[] arr) {
        int len = arr.length, num = len % 4 == 0 ? len / 4 + 1 : (int) Math.ceil(len / 4.0);
        for (int i = 0, j = num - 1; j < len; i++, j++) {
            if (arr[i] == arr[j]) {
                return arr[i];
            }
        }
        return -1;
    }

    // 999. Available Captures for Rook
    public static int numRookCaptures(char[][] board) {
        int x = 0, y = 0, res = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        for (int i = x - 1; i >= 0 && board[i][y] != 'B'; i--) {
            if (board[i][y] == 'p') {
                res++;
                break;
            }
        }

        for (int i = x + 1; i < 8 && board[i][y] != 'B'; i++) {
            if (board[i][y] == 'p') {
                res++;
                break;
            }
        }

        for (int i = y - 1; i >= 0 && board[x][i] != 'B'; i--) {
            if (board[x][i] == 'p') {
                res++;
                break;
            }
        }

        for (int i = y + 1; i < 8 && board[x][i] != 'B'; i++) {
            if (board[x][i] == 'p') {
                res++;
                break;
            }
        }

        return res;
    }

    // 1200. Minimum Absolute Difference
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int minDis = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDis = Math.min(minDis, arr[i] - arr[i - 1]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDis) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return res;
    }

    // 154. Find Minimum in Rotated Sorted Array II
    public static int findMinII(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                r--;
            }
        }
        return nums[l];
    }

    // 1010. Pairs of Songs With Total Durations Divisible by 60
    public static int numPairsDivisibleBy60(int[] time) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : time) {
            t %= 60;
            int d = (60 - t) % 60;
            res += map.getOrDefault(d, 0);
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        return res;
    }

    // 228. Summary Ranges
    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int start = 0, end = 1, len = nums.length;
        while (end <= len) {
            while (end < len && nums[end] == nums[end - 1] + 1) {
                end++;
            }
            if (start == end - 1) {
                res.add(String.valueOf(nums[start]));
            } else {
                res.add(nums[start] + "->" + nums[end - 1]);
            }
            start = end;
            end = start + 1;
        }
        return res;
    }

    // 64. Minimum Path Sum
    public static int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[m - 1][n - 1];
    }

    // 57. Insert Interval
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) {
            return new int[][] {newInterval};
        }
        int len = intervals.length, l = 0, r = len - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (intervals[mid][0] >= newInterval[0]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        int start = r + 1;
        l = start;
        r = len - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (intervals[mid][1] > newInterval[1]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        int end = l - 1;

        if (start > 0 && intervals[start - 1][1] >= newInterval[0]) {
            start--;
        }
        if (end < len - 1 && intervals[end + 1][0] <= newInterval[1]) {
            end++;
        }
        int[][] res = new int[len - end + start][2];
        int index = 0;
        for (int i = 0; i < start; i++) {
            res[index++] = intervals[i];
        }
        if (start <= end) {
            res[index++] = new int[] {Math.min(intervals[start][0], newInterval[0]), Math.max(intervals[end][1], newInterval[1])};
        } else {
            res[index++] = newInterval;
        }
        for (int i = end + 1; i < len; i++) {
            res[index++] = intervals[i];
        }
        return res;
    }

    // 41. First Missing Positive
    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] <= 0 || nums[i] > len) {
                nums[i] = len + 1;
            }
        }

        for (int i = 0; i < len; i++) {
            int num = Math.abs(nums[i]);
            if (num <= len) {
                nums[num - 1] = -1 * Math.abs(nums[num - 1]);
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return len + 1;
    }

    // 34. Find First and Last Position of Element in Sorted Array
    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (l - 1 < 0 || nums[l - 1] != target) {
            return new int[] {-1, -1};
        }
        int end = l - 1;
        r = l - 1;
        l = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        int start = r + 1;
        return new int[] {start, end};
    }

    // 56. Merge Intervals
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 2) {
            return intervals;
        }
        Arrays.sort(intervals, (o1, o2) -> o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1]);
        ArrayList<int[]> res = new ArrayList<>();
        for (int[] o : intervals) {
            if (res.isEmpty()) {
                res.add(o);
            } else {
                int[] last = res.get(res.size() - 1);
                if (o[0] >= last[0] && o[0] <= last[1]) {
                    last[1] = Math.max(o[1], last[1]);
                } else {
                    res.add(o);
                }
            }
        }
        return res.toArray(new int[res.size()][2]);
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
            if (s.charAt(k) != s.charAt(j - k + i)) {
                return false;
            }
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
        if (sb.toString().contains(B)) {
            return count;
        }
        if (sb.append(A).toString().contains(B)) {
            return ++count;
        }
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
                res[index++] = new int[] {i, j};
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
        return new int[] {curLine, curWidth};
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
        Map<String, Set<String>> map = new HashMap<>();
        for (String email : emails) {
            int index = email.indexOf('@');
            String localName = email.substring(0, index);
            int i;
            if ((i = localName.indexOf('+')) != -1) {
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
            if (s.charAt(i) == '(') {
                opened.push(i);
            }
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
        return new int[] {num1, num2};
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
            while (count[l] == 0) {
                l++;
            }
            while (count[r] == 0) {
                r--;
            }
            if (nl < nr) {
                avg += count[l] * l;
                nl += count[l];
                if (count[l] > count[(int) mode]) {
                    mode = l;
                }
                mn = Math.min(mn, l);
                mid1 = l;
                l++;
            } else {
                avg += count[r] * r;
                nr += count[r];
                if (count[r] > count[(int) mode]) {
                    mode = r;
                }
                mx = Math.max(mx, r);
                mid2 = r;
                r--;
            }
        }
        avg /= (nl + nr);
        // Find median
        if (nl < nr) {
            mid = mid2;
        } else if (nl > nr) {
            mid = mid1;
        } else {
            mid = (double) (mid1 + mid2) / 2;
        }
        return new double[] {mn, mx, avg, mid, mode};
    }

    // 441. Arranging Coins
    public static int arrangeCoins(int n) {
        return (int) (Math.sqrt(2.0 * n + 0.25) - 0.5);
    }

    // 1041. Robot Bounded In Circle
    public static boolean isRobotBounded(String instructions) {
        int[] xDict = new int[] {1, 0, -1, 0};
        int[] yDict = new int[] {0, 1, 0, -1};
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
            if (isPalindrome(N) && isPrime(N)) {
                return N;
            }
            N++;
            if (10_000_000 < N && N < 100_000_000) {
                N = 100_000_000;
            }
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
            if (m[s1.charAt(i)] != m[s2.charAt(i) + 256]) {
                return false;
            }
            m[s1.charAt(i)] = m[s2.charAt(i) + 256] = i + 1;
        }
        return true;
    }

    // 290. Word Pattern
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map index = new HashMap();
        for (Integer i = 0; i < words.length; ++i) {
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) {
                return false;
            }
        }
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

    private static class TreeNode {
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
                return new int[] {map.get(comp), i};
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
        if (S.length() < 3) {
            return res;
        }
        int start = 0, end = 0, p = 1;
        boolean flag = false;
        for (; p < S.length(); ) {
            for (; p < S.length() && S.charAt(p) == S.charAt(p - 1); p++) {
                ;
            }
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
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int[] sumL = new int[nums.length];
        sumL[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumL[i] = sumL[i - 1] + nums[i];
        }
        if (sumL[sumL.length - 1] == sumL[0]) {
            return 0;
        }
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
        for (int i : A) {
            sumA += i;
        }
        for (int i : B) {
            sumB += i;
        }
        Set<Integer> setB = new HashSet<Integer>();
        for (int i : B) {
            setB.add(i);
        }
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
            } else {
                count--;
            }
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
            if (bits[i] == 0) {
                i++;
            } else {
                i += 2;
            }
        }
        return i == len - 1;
    }

    //122. Best Time to Buy and Sell Stock II
    // https://www.jianshu.com/p/9fa0faff99da
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int res = 0, buyIndex = 0, sellIndex = 0, curPointer = 1;
        boolean flag = true;
        for (; curPointer < prices.length; ) {
            if (flag) {
                for (; curPointer < prices.length && prices[curPointer] <= prices[curPointer - 1]; curPointer++) {
                    ;
                }
                buyIndex = curPointer - 1;
                flag = false;
            } else {
                for (; curPointer < prices.length && prices[curPointer] >= prices[curPointer - 1]; curPointer++) {
                    ;
                }
                sellIndex = curPointer - 1;
                flag = true;
                res = res + prices[sellIndex] - prices[buyIndex];
            }
        }
        return res;
    }

    //217. Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (nums.length == set.size()) {
            return false;
        } else {
            return true;
        }
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
            } else {
                break;
            }
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
            if (frequency.containsKey(nums[i])) {
                frequency.put(nums[i], frequency.get(nums[i]) + 1);
            } else {
                frequency.put(nums[i], 1);
            }
            degree = Math.max(degree, frequency.get(nums[i]));
            if (!left.containsKey(nums[i])) {
                left.put(nums[i], i);
            }
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
    // https://www.jianshu.com/p/9fa0faff99da
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
                if (grid[i][j] != 5) {
                    continue;
                }
                if (magic(grid[i - 1][j - 1], grid[i - 1][j], grid[i - 1][j + 1],
                        grid[i][j - 1], grid[i][j], grid[i][j + 1],
                        grid[i + 1][j - 1], grid[i + 1][j], grid[i + 1][j + 1])) {
                    res++;
                }
            }
        }
        return res;
    }

    public static boolean magic(int... vals) {
        int[] count = new int[16];
        for (int v : vals) {
            count[v]++;
        }
        for (int v = 1; v <= 9; ++v) {
            if (count[v] != 1) {
                return false;
            }
        }
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
        if (x < y) {
            return gcd(y, x);
        }
        if (y == 0) {
            return x;
        }
        if ((x & 1) == 1) //x为奇数
        {
            if ((y & 1) == 1) //y为奇数
            {
                return gcd(x - y, y);
            } else         //y为偶数
            {
                return gcd(x, y >> 1);
            }
        } else         //x为偶数
        {
            if ((y & 1) == 1) //y为奇数
            {
                return gcd(x >> 1, y);
            } else         //y为偶数
            {
                return 2 * gcd(x >> 1, y >> 1);
            }

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

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
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

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        data = new int[k];
        front = 0;
        tail = 0;
        capacity = k;
        size = 0;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        data[tail] = value;
        tail = (tail + 1) % capacity;
        size++;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        return isEmpty() ? -1 : data[front];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        return isEmpty() ? -1 : data[(tail - 1 + capacity) % capacity];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
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

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        data = new int[k];
        capacity = k;
        size = 0;
        front = 0;
        tail = 0;
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        data[front] = value;
        size++;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        data[tail] = value;
        tail = (tail + 1) % capacity;
        size++;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tail = (tail - 1 + capacity) % capacity;
        size--;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int getFront() {
        return isEmpty() ? -1 : data[front];
    }

    /**
     * Get the last item from the queue.
     */
    public int getRear() {
        return isEmpty() ? -1 : data[(tail - 1 + capacity) % capacity];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
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

