class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        for (; i >= 0 || j >= 0 || carry > 0; i--, j--) {
            int remA = 0;
            int remB = 0;

            if (i >= 0) {
                remA = a.charAt(i) - '0';
            }
            if (j >= 0) {
                remB = b.charAt(j) - '0';
            }

            int sum = remA + remB + carry;
            result = (sum % 2) + result;
            carry = sum / 2;
        }

        return result;
    }
}
