class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sChars = new HashMap<>();
        Map<Character, Integer> tChars = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            sChars.merge(s.charAt(i), 1, Integer::sum);
            tChars.merge(t.charAt(i), 1, Integer::sum);
        }

        return sChars.equals(tChars);
    }
}
