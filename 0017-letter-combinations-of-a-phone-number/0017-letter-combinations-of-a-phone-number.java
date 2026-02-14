class Solution {
    public void letterCombinationsHelper(int index,String str, List<String> res, String[] combo, String digits) {
        if(index == digits.length()) {
            res.add(str);
            return;
        }

        int number = digits.charAt(index) - '0';
        for(int i = 0; i < combo[number].length(); i++) {
            letterCombinationsHelper(index+1, str + combo[number].charAt(i), res, combo, digits);
        }
    }
    public List<String> letterCombinations(String digits) {
        String combo[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();

        letterCombinationsHelper(0, "", res, combo, digits);
        return res;
    }
}