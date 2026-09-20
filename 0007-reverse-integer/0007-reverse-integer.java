class Solution {
    public int reverse(int x) {

        int flag = 0;

        if (x < 0) {
            flag = 1;
        }

        long temp = x;

        if (flag == 1) {
            temp *= -1;
        }

        long rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (flag == 1) {
            rev *= -1;
        }

        if (rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE) {
            return (int) rev;
        }

        return 0;
    }
}