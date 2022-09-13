package com.xtu;


/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了37.22%的用户
 * 内存消耗：38.6 MB, 在所有 Java 提交中击败了21.27%的用户
 * 通过测试用例：111 / 111
 */
public class LC670 {

    public int maximumSwap(int num){
        StringBuilder numStr = new StringBuilder(String.valueOf(num));
        for(int i=0; i<numStr.length(); i++){
            Character max = '0';
            int flag = 0;
            for(int j=numStr.length()-1; j>i; j--){
                if(numStr.charAt(i) < numStr.charAt(j)){
                    if(max < numStr.charAt(j)){
                        max = numStr.charAt(j);
                        flag = j;
                    }
                }
            }
            if(max != '0'){
                Character temp = numStr.charAt(i);
                numStr.setCharAt(i, max);
                numStr.setCharAt(flag, temp);
                break;
            }
        }
        return Integer.valueOf(numStr.toString());
    }

    public static void main(String[] args) {

    }
}
