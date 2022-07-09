package com.xtu;

import java.util.HashMap;
import java.util.Map;

/**
 * 执行用时：216 ms, 在所有 Java 提交中击败了20.45%的用户
 * 内存消耗：49.3 MB, 在所有 Java 提交中击败了53.96%的用户
 * 通过测试用例：56 / 56
 */
public class LC873 {
    /**
     * 使用动态规划算法
     * @param arr
     * @return
     */
    public static int lenLongestFibSubseq(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();    //用map进行表示，value为数组位置，key为对应的值
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i], i);
        }   //初始化map
        int[][] dp = new int[arr.length][arr.length];   //定义dp数组
        int maxVal = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i>=j){
                    dp[i][j] = 0;   //排序为k>i>j,所以当i>=j的时候是没有斐波那契序列的
                }else{
                    int k=map.getOrDefault(arr[j]-arr[i],-1);
                    if(k == -1 || k>=i)
                        dp[i][j] = 0;
                    else{
                        dp[i][j] = dp[k][i]>=3?dp[k][i]+1:3;
                        maxVal = maxVal>dp[i][j]?maxVal:dp[i][j];
                    }
                }
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        System.out.println(lenLongestFibSubseq(new int[]{1,2,3,4,5,6,7,8}));
    }
}
