class Solution {
    public String longestCommonPrefix(String[] strs) {
       int n = strs.length;
       Arrays.sort(strs);
       String first = strs[0];
       String last = strs[n-1];

       StringBuffer ans = new StringBuffer();
       for(int i = 0; i <= Math.min(first.length()-1, last.length()-1);i++) {
          if(first.charAt(i) != last.charAt(i)) break;
          ans.append(first.charAt(i));
       }

       return ans.toString();
    }
}