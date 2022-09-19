package com.xtu;

import java.util.*;

public class LC1636 {

    public int[] frequencySort(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            list.add(num);
        }
        Collections.sort(list, (a,b)->{
            int a1 = map.get(a);
            int b1 = map.get(b);
            return a1!=b1 ? a1-b1 : b-a;
        });


        for (int i=0; i<list.size();i++){
            nums[i] = list.get(i);
        }

        return nums;
    }

    public static void main(String[] args) {

    }
}
