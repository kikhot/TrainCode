package com.xtu;

/**
 * 执行用时：7 ms, 在所有 Java 提交中击败了8.70%的用户
 * 内存消耗：41.3 MB, 在所有 Java 提交中击败了13.94%的用户
 * 通过测试用例：
 * 108 / 108
 */
public class Lc1768 {
    public String mergeAlternately(String word1, String word2){
        int length;
        String resStr = "";
        int flag = 0;
        if(word1.length() > word2.length()){
            length = word2.length();
        }else{
            length = word1.length();
            flag = 1;
        }

        for(int i=0;i<length;i++){
            resStr += word1.charAt(i);
            resStr += word2.charAt(i);
        }
        if(flag == 0){
            for(int i=length;i<word1.length();i++){
                resStr += word1.charAt(i);
            }
        }else{
            for(int i=length;i<word2.length();i++){
                resStr += word2.charAt(i);
            }
        }

        return resStr;

    }

}
