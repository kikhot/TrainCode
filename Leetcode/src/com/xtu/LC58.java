package com.xtu;

/**
 * 执行用时：7 ms, 在所有 Java 提交中击败了8.41%的用户
 * 内存消耗：42.1 MB, 在所有 Java 提交中击败了5.13%的用户
 * 通过测试用例：58 / 58
 */
public class LC58 {
    public int lengthOfLastWord(String s) {
        String tempstr = "";
        s = s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                tempstr = "";
            }else{
                tempstr += String.valueOf(s.charAt(i));
            }
        }
        return tempstr.length();
    }

    public static void main(String[] args) {

    }
}
