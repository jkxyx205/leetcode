package com.rick.leetcode;

/**
 * 860. 柠檬水找零
 * @author Rick
 * @createdAt 2022-06-30 09:11:00
 */
public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int[] moneyMap = new int[21];

        for (int bill : bills) {
            if (bill == 10) {
                int count = moneyMap[5];
                if (count <= 0) {
                    return false;
                }
                moneyMap[5] = count - 1;
            } else if (bill == 20) {
                // 10 + 5 && 5 + 5 + 5
                int count5 = moneyMap[5];
                if (count5 <= 0) {
                    return false;
                }

                int count10 = moneyMap[10];
                if (count10 >=1) {
                    moneyMap[5] = count5 - 1;
                    moneyMap[10] = count10 - 1;
                } else if(count5 >= 3) {
                    moneyMap[5] = count5 - 3;
                } else {
                    return false;
                }

            }
            int count = moneyMap[bill];
            moneyMap[bill] =  count + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        LemonadeChange lemonadeChange = new LemonadeChange();
        lemonadeChange.lemonadeChange(new int[] {5,5,5,10,20});
    }
}
