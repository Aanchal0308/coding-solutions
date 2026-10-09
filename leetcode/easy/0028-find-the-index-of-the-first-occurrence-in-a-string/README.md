# Find the Index of the First Occurrence in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

 

 **Example 1:** 

```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

```

 **Example 2:** 

```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

```

 

 **Constraints:** 

- 1 <= haystack.length, needle.length <= 104
- haystack and needle consist of only lowercase English characters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 49.79%)  
**Memory:** 42.9 MB (beats 81.62%)  
**Submitted:** 2026-10-09T18:53:47.598Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)