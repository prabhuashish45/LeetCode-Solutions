class Solution {

    private void swap(char[] s, int low, int high) {
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
    }

    private void reverseStringHelper(char[] s, int low, int high) {
        if (low >= high) return;
        swap(s, low, high);
        reverseStringHelper(s, low + 1, high - 1);
    }

    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        reverseStringHelper(s, low, high);
    }
}