package com.xtu;

import java.util.List;

/**
 * 执行用时：4 ms, 在所有 Java 提交中击败了94.33%的用户
 * 内存消耗：46.2 MB, 在所有 Java 提交中击败了50.83%的用户
 * 通过测试用例：92 / 92
 */
public class LC1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int flag = 0;
        int count = 0;
        if(ruleKey.equals("color")){
            flag = 1;
        }else if(ruleKey.equals("name")){
            flag = 2;
        }

        for(List<String> list : items){
            if(list.get(flag).equals(ruleValue)){
                count++;
            }
        }

        return count;
    }
}
