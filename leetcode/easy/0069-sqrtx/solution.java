class Solution {
    public int mySqrt(int x) {
        int n = 0;

        for (long start = 0, end = x; start <= end; ) {
            long i = start + (end - start) / 2;

            if (i * i == x) {
                n = (int) i;
                break;
            } else if (i * i > x) {
                end = i - 1;
            } else {
                n = (int) i;
                start = i + 1;
            }
        }

        return n;
    }
}
