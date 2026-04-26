class Solution {
    public boolean isAnagram(String input1, String input2) {
        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();

        for (Character c : input1.toCharArray()) {
            map1.compute(c, (k, v) -> (v == null) ? 1 : ++v);
        }
        for (Character c : input2.toCharArray()) {
            map2.compute(c, (k, v) -> (v == null) ? 1 : ++v);
        }
        return map1.equals(map2);
    }
}
