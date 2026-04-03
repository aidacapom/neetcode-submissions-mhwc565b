class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sChars = new HashMap<>();
        Map<Character, Integer> tChars = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            sChars.put(s.charAt(i), sChars.getOrDefault(s.charAt(i), 0) + 1);
            tChars.put(t.charAt(i), tChars.getOrDefault(t.charAt(i), 0) + 1);
        }

        if(!sChars.equals(tChars)) {
            return false;
        }

        return true;
    }
}
