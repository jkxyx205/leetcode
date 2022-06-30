package com.rick.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 884. 两句话中的不常见单词
 * @author Rick
 * @createdAt 2022-06-30 09:36:00
 */
public class UncommonFromSentences {

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String s : s1.split(" ")) {
            Integer count = map.get(s);
            if (count == null) {
                count = 0;
            }
            map.put(s, ++count);
        }

        for (String s : s2.split(" ")) {
            Integer count = map.get(s);
            if (count == null) {
                count = 0;
            }
            map.put(s, ++count);
        }

        List<String> collect = map.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());

        return collect.toArray(new String[]{});
    }
}
