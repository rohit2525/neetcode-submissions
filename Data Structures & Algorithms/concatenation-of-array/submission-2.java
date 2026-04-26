

class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];
        int times = 0;
        int index = 0;
        while (times < 2) {
            for (int num : nums) {
                ans[index++] = num;
            }
            times++;
        }
        return ans;
    }
}