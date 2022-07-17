package com.xtu;

import java.util.*;

public class LC6164 {
    public static int maximumSum(int[] nums){
        Map<Integer, List<Integer>> pair = new HashMap<>();
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int total = 0;
            int flag = nums[i];
            while(flag!= 0){
                total += flag%10;
                flag /= 10;
            }
            if(pair.containsKey(total)){
                List<Integer> list = pair.get(total);
                list.add(nums[i]);
                pair.put(total, list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                pair.put(total, list);
            }
        }
        for(Integer num : pair.keySet()){
            if(pair.get(num).size() <=1){
                continue;
            }else{
                List list1 = pair.get(num);
                Collections.sort(list1);
                Collections.reverse(list1);
                System.out.println(list1.get(0)+"    "+ list1.get(1));
                ans = Math.max((Integer)list1.get(0)+(Integer) list1.get(1), ans);
            }
        }
        if(ans == 0){
            ans = -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maximumSum(new int[]{229,398,269,317,420,464,491,218,439,153,482,169,411,93,147,50,347,210,251,366,401}));
    }
}
