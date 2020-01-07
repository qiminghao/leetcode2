package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName RandomizedSet.java
 * @Description 380. Insert Delete GetRandom O(1)
 * @createTime 2020/1/1 2:38 下午
 */
public class RandomizedSet {

    private Map<Integer, Integer> map;
    private List<Integer> list;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            int index = map.get(val);
            int num = list.get(list.size() - 1);
            list.set(index, num);
            list.remove(list.size() - 1);
            map.put(num, index);
            map.remove(val);
            return true;
        }
        return false;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            list.set(map.get(val), list.get(list.size() - 1));
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get((int) (Math.random() * list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
