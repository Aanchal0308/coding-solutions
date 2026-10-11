# Add Binary

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two binary strings `a` and `b`, return  *their sum as a binary string*.

 

 **Example 1:** 

```
Input: a = "11", b = "1"
Output: "100"

```

 **Example 2:** 

```
Input: a = "1010", b = "1011"
Output: "10101"

```

 

 **Constraints:** 

- 1 <= a.length, b.length <= 104
- a and b consist only of '0' or '1' characters.
- Each string does not contain leading zeros except for the zero itself.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 11.33%)  
**Memory:** 45.4 MB (beats 5.39%)  
**Submitted:** 2026-10-11T18:24:53.030Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/add-binary/)