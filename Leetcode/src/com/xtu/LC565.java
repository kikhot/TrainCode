package com.xtu;

import java.util.HashSet;
import java.util.Set;

/**
 * 执行用时：4 ms, 在所有 Java 提交中击败了79.91%的用户
 * 内存消耗：49.1 MB, 在所有 Java 提交中击败了98.82%的用户
 * 通过测试用例：885 / 885
 */
public class LC565 {
    // 超出时间限制
//    public int arrayNesting(int[] nums){
//        int ans = 0;
//        for(int i=0; i<nums.length; i++){
//            Set<Integer> set = new HashSet<>();
//            boolean judge = true;
//            int count = 0;
//            int flag = i;
//            while(judge){
//                if(!set.add(nums[flag])){
//                    judge = false;
//                    continue;
//                }else{
//                    count++;
//                    flag = nums[flag];
//                }
//
//            }
//            if(count > ans){
//                ans = count;
//            }
//        }
//        return ans;
//    }


    public int arrayNesting(int[] nums) {
        int ans = 0, n = nums.length;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; ++i) {
            int cnt = 0;
            while (!vis[i]) {
                vis[i] = true;
                i = nums[i];
                ++cnt;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }


    public static void main(String[] args) {
    }
}
