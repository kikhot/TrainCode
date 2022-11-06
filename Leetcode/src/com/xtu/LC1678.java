package com.xtu;

import java.util.Stack;

/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了10.05%的用户
 * 内存消耗：39.9 MB, 在所有 Java 提交中击败了11.50%的用户
 * 通过测试用例：
 * 105 / 105
 */
public class LC1678 {
    public String interpret(String command){
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i=0;i<command.length();i++){
            if(stack.empty() && command.charAt(i)!='G'){
                stack.push(command.charAt(i));
            }else{
                if(command.charAt(i) == ')'){
                    if(stack.peek() == '('){
                        result += "o";
                    }else if(stack.peek() == 'l'){
                        result += "al";
                    }
                    stack.clear();
                }else if(command.charAt(i) == 'G'){
                    result += "G";
                }else {
                    stack.push(command.charAt(i));
                }
            }
        }
        return result;
    }
}
