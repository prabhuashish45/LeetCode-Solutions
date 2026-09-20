class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int mpp[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            mpp[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
           if (mpp[t.charAt(i) - 'a'] == 0) return false;
                mpp[t.charAt(i) - 'a'] -= 1;
        }
        return true;
    }
}