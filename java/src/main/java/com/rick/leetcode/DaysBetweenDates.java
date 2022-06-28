package com.rick.leetcode;

import java.sql.Timestamp;

/**
 * @author Rick
 * @createdAt 2022-06-28 16:15:00
 */
public class DaysBetweenDates {

    public int daysBetweenDates(String date1, String date2) {
//        int day1 = (date1.charAt(9)-'0') + (date1.charAt(8)-'0')*10;
//        int month1 = (date1.charAt(6)-'0') + (date1.charAt(5)-'0')*10 - 1;
//        int year1 = (date1.charAt(3)-'0') + (date1.charAt(2)-'0')*10 + (date1.charAt(1)-'0')*100 + (date1.charAt(0)-'0')*1000;
//
//        int day2 = (date2.charAt(9)-'0') + (date2.charAt(8)-'0')*10;
//        int month2 = (date2.charAt(6)-'0') + (date2.charAt(5)-'0')*10 - 1;
//        int year2 = (date2.charAt(3)-'0') + (date2.charAt(2)-'0')*10 + (date2.charAt(1)-'0')*100 + (date2.charAt(0)-'0')*1000;



                return (int) Math.abs(((Timestamp.valueOf(date1 + " 00:00:00").getTime() - Timestamp.valueOf(date2 + " 00:00:00").getTime()) / (24 * 60 * 60 * 1000)));
//        Date date11 = new Date(year1, month1, day1);
//        Date date22 = new Date(year2, month2, day2);
//        return (int) Math.abs(((date22.getTime() -  date11.getTime()) / (24 * 60 * 60 * 1000)));
    }
}
