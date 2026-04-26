class Solution {
    public boolean isAnagram(String input1, String input2) {
      if (input1.length() != input2.length()) return false;

        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();


        for (int i = 0; i < input1.length(); i++) {
            map1.compute(input1.charAt(i), (k, v) -> (v == null) ? 1 : ++v);
            map2.compute(input2.charAt(i), (k, v) -> (v == null) ? 1 : ++v);

        }
        return map1.equals(map2);
    }
}
