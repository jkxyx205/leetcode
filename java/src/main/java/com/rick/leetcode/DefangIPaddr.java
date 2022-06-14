package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-08 10:03:00
 */
public class DefangIPaddr {
    public String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                stringBuilder.append("[.]");
            } else {
                stringBuilder.append(address.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
