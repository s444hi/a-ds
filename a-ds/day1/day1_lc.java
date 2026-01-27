// 1. two sum

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // create a map

        for (int i = 0; i < nums.length; i++) { // run through list
            int result = target - nums[i]; // find out what the next val needs to be

            if (map.containsKey(result)) { // if the map has that next val
                return new int[] {map.get(result), i}; // return both index's
            }

            map.put(nums[i], i); // or else save the number with the index
        }
        return new int[] {}; // return a blank arr but since it always has a result, that won't happen
    }
}

// 217. contains duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(); // hashset since it doesn't take duplicates

        for (int i = 0; i < nums.length; i++) { // loops through nums
            if (seen.contains(nums[i])) { // if seen has that number it's a duplicate
                return true;
            }
            seen.add(nums[i]); // if it doesn't have the number then add it
        }

        return false; // no duplicates

    }
}
