package com.xtu;

import java.util.HashSet;
import java.util.Set;

public class LC6120 {
    public int[] numberOfPairs(int[] nums){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(set.add(nums[i]) == false){
                count++;
                set.remove(nums[i]);
            }
        }
        int[] ans = new int[2];
        ans[0] = count;
        ans[1] = set.size();
        return ans;
    }
}
