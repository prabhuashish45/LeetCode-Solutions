class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(mpp.containsKey(nums[i])) return true;

            mpp.put(nums[i], 1);
        }
        return false;
    }
}