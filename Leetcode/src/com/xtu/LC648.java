package com.xtu;

import java.util.Comparator;
import java.util.List;

/**
 * 执行用时：93 ms, 在所有 Java 提交中击败了23.15%的用户
 * 内存消耗：49.3 MB, 在所有 Java 提交中击败了65.94%的用户
 */
public class LC648 {

    public String replaceWords(List<String> dictionary, String sentence) {
        String[] strs = sentence.split(" ");
        int flag = 0;
        String res = "";
        dictionary.sort((s1,s2)->s1.length()-s2.length());

        for(String s : strs){
            for(String s1:dictionary){
                if(s1.length()>s.length()){
                    break;
                }else if(s1.equals(s.substring(0,s1.length()))){
                    res += s1 + " ";
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                res += s + " ";
            }
            flag = 0;
        }
        res = res.trim();
        return res;
    }
    public static void main(String[] args) {
        System.out.println("cattle".substring(0,2));
    }
}
