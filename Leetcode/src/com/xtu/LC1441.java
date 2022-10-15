package com.xtu;

import java.util.LinkedList;
import java.util.List;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.8 MB, 在所有 Java 提交中击败了9.41%的用户
 * 通过测试用例：
 * 49 / 49
 */
public class LC1441 {
    public List<String> buildArray(int[] target, int n){
        List<String> res = new LinkedList<>();
        int flag = 0;
        for(int i=1;i<=n;i++){
            if(flag<target.length && i == target[flag]){
                res.add("Push");
                flag++;
            }else if(flag == target.length){
                break;
            }else{
                res.add("Push");
                res.add("Pop");
            }
        }
        return res;
    }
}
