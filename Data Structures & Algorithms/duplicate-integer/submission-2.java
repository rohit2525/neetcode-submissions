//import java.util.HashSet;


class Solution {
    public boolean hasDuplicate(int[] nums) {
           var set = new HashSet<Integer>(nums.length);
        for (int i : nums) {
            if (!set.add(i)) return true;
        }
        return false;
    }}