package com.xtu;

import java.util.HashSet;
import java.util.Set;

/**
 * 执行用时：7 ms, 在所有 Java 提交中击败了29.07%的用户
 * 内存消耗：41.9 MB, 在所有 Java 提交中击败了77.63%的用户
 * 通过测试用例：
 * 57 / 57
 */
public class LC817 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public int numberComponents(ListNode head, int[] nums) {
        Set<Integer> setNum = new HashSet<>();
        int count = 0;
        int flag = 0;
        for(int i=0;i<nums.length;i++){
            setNum.add(nums[i]);
        }
        while(head != null){
            if(setNum.contains(head.val) && flag == 0){
                flag = 1;
                count++;
            }else if(!setNum.contains(head.val)){
                flag = 0;
            }
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
