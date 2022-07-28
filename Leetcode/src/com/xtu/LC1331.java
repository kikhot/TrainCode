package com.xtu;

import java.util.Map;
import java.util.TreeMap;

/**
 * 执行用时：81 ms, 在所有 Java 提交中击败了5.02%的用户
 * 内存消耗：59.3 MB, 在所有 Java 提交中击败了28.72%的用户
 * 通过测试用例：38 / 38
 */
public class LC1331 {
    public static int[] arrayRankTransform(int[] arr){
        Map<Integer, Integer> order = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            order.put(arr[i], 0);
        }
        int flag = -1;
        int count = 0;
        for(int key :order.keySet()){
            if(key == flag){
                order.put(key, count);
            }else{
                flag = key;
                count++;
                order.put(key, count);
            }
        }
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = order.get(arr[i]);
        }

        return ans;

    }

    public static void main(String[] args) {
        arrayRankTransform(new int[]{40,10,20,30});
    }
}
