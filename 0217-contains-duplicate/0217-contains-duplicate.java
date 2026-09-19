class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> element = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(element.contains(nums[i])) return true;

            element.add(nums[i]);
        }
        return false;
    }
}