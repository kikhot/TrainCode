package com.xtu;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.9 MB, 在所有 Java 提交中击败了30.28%的用户
 * 通过测试用例：
 * 131 / 131
 */
public class LC1790 {
    public boolean areAlmostEqual(String s1, String s2){
        int count = 0;
        int firstFlag = 0;
        int secondFlag = 0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(count == 0){
                    firstFlag = i;
                }else if(count == 1){
                    secondFlag = i;
                }
                count++;

            }
        }
        if(count == 0){
            return true;
        }else if(count == 2){
            if (s1.charAt(firstFlag)==s2.charAt(secondFlag) && s1.charAt(secondFlag) == s2.charAt(firstFlag)) {
                return true;
            }
        }
        return false;
    }
}
