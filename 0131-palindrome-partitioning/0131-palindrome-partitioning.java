class Solution {
    private boolean check(String s, int low, int high) {
        while(low < high) {
            if(s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    private void partitionHelper(int index, int n, String s, List<List<String>> res, List<String> arr) {
        if(index == n) {
            res.add(new ArrayList<>(arr));
            return;
        }

        for(int j = index; j < n; j++) {
            if(check(s, index, j)) {
                String substring = s.substring(index, j+1);
                arr.add(substring);
                partitionHelper(j+1, n, s, res, arr);
                arr.remove(arr.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> res = new ArrayList<>();
        List<String> arr = new ArrayList<>();
        partitionHelper(0, n, s, res, arr);
        return res;
    }
}