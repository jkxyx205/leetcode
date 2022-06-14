package com.rick.leetcode;

/**
 * 468. 验证IP地址
 * @author Rick
 * @createdAt 2022-05-29 21:54:00
 */
public class ValidIPAddress {

    public String validIPAddress(String queryIP) {
        if (queryIP.endsWith(".") || queryIP.endsWith(":")) {
            return "Neither";
        }
        if (isIPv4(queryIP)) {
            return "IPv4";
        }

        if (isIPv6(queryIP)) {
            return "IPv6";
        }

        return "Neither";
    }

    private boolean isIPv4(String queryIP) {
        String[] values = queryIP.split("\\.");
        if (values.length != 4) {
            return false;
        }

        for (String value : values) {
            if (value.length()>1 && value.startsWith("0")) {
                return false;
            }

            try {
                int num = Integer.parseInt(value);
                if (num > 255 || num < 0) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }

        }

        return true;
    }

    private boolean isIPv6(String queryIP) {
        String[] values = queryIP.split(":");
        if (values.length != 8) {
            return false;
        }

        for (String value : values) {
            if (!value.matches("[0-9abcdefABCDEF]{1,4}")) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidIPAddress().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
    }
}
