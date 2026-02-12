class Solution {
    private void combinationSumHelper(int index, int n, int sum, int [] candidates, List<Integer> arr, List<List<Integer>> res) {
        if(sum == 0) {
            res.add(new ArrayList<>(arr));
            return;
        }
        for(int i = index; i < n; i++) {
            if(i > index && candidates[i] == candidates[i-1]) {
                continue;
            }

            if(candidates[i] > sum) {
                break;
            }

            arr.add(candidates[i]);
            combinationSumHelper(i + 1, n, sum - candidates[i],candidates, arr, res);
            arr.remove(arr.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        combinationSumHelper(0, n, target, candidates, arr, res);
        return res;
    }
}