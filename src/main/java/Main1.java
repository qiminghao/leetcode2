import com.sun.source.tree.Tree;

import util.Trie;
import java.util.*;

public class Main1 {

    public static void main(String[] args) throws InterruptedException {
        String[] a = "A004:".split(":");
        System.out.println();
        System.out.println(new Main1().oddEvenJumps(new int[] {10, 13, 12, 14, 15}));
        System.out.println(new Main1().oddEvenJumps(new int[] {2, 3, 1, 1, 4}));
        System.out.println(new Main1().oddEvenJumps(new int[] {5, 1, 3, 4, 2}));

        System.out.println(Arrays.toString("-1/2+1/2-1/3".split("[+-]")));
        System.out.println(gcd(3, 5));

        Trie trie = new Trie();
        trie.insert("apple");
        trie.search("apple");   // returns true
        trie.search("app");     // returns false
        trie.startsWith("app"); // returns true
        trie.insert("app");
        trie.search("app");     // returns true
    }

    public static int gcd(int m, int n) {
        return n == 0 ? m : gcd(n, m % n);
    }

    public int oddEvenJumps(int[] A) {
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

    class Node implements Comparable<Node> {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Node node = (Node) o;
            return index == node.index &&
                    value == node.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index, value);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "index=" + index +
                    ", value=" + value +
                    '}';
        }

        @Override
        public int compareTo(Node o) {
            if (this.value != o.value) {
                return this.value - o.value;
            } else {
                return this.index - o.index;
            }
        }
    }

}