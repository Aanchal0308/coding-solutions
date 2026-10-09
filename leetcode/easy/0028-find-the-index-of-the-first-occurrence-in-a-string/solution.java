class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.length() < needle.length()) return -1;
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int k = i;
            int flag = 1;
            
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(k) != needle.charAt(j)) {
                    flag = 0;
                    break;
                }
                k++;
            }
            
            if (flag == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
