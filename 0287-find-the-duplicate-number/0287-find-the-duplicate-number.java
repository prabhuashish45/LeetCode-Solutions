class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums) {
            if(hs.contains(num)) return num;
            hs.add(num);
        }
        return 0;
    }
}