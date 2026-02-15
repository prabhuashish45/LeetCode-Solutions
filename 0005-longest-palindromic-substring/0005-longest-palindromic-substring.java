class Solution {
    private boolean check(String s, int low, int high) {
        while(low < high) {
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLength = 0;
        String res = "";
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(check(s, i, j)) {
                    if(j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        res = s.substring(i, j+1);
                    }
                }
            }
        }
        return res;
    }
}