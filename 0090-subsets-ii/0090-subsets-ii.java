class Solution {
    private void subsetWithDupHelper(int index, int n, int[] nums,List<Integer> arr, List<List<Integer>> res) {
        if(index == n) {
            res.add(new ArrayList<>(arr));
            return;
        }
        
        arr.add(nums[index]);
        subsetWithDupHelper(index+1, n, nums,arr, res);
        arr.remove(arr.size()-1);

        while(index + 1 < nums.length && nums[index] == nums[index + 1]) {
              index++;
        }
      
        subsetWithDupHelper(index+1, n, nums,arr, res);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> arr = new ArrayList<>();
       int n = nums.length;
       Arrays.sort(nums);
       subsetWithDupHelper(0, n, nums,arr,res);
       return res;
    }
}