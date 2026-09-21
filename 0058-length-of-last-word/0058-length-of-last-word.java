class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int right = n - 1;
        for(int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                right = i;
                break;
            }
        }
        
        int count = 0;
        for(int i = right; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}