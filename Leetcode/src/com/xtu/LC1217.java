package com.xtu;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.8 MB, 在所有 Java 提交中击败了77.61%的用户
 * 通过测试用例：51 / 51
 */
public class LC1217 {
    /**
     * 这道题如果仔细研究可以看出规律，position为奇数的筹码移动到偶数筹码上的cost都为1，同奇同偶cost都为0
     * @param position
     * @return
     */
    public int minCostToMoveChips(int[] position){
        int oddNum = 0;     //统计奇数位置上的筹码数
        int evenNum = 0;    //统计偶数位置上的筹码数
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                oddNum++;
            }else{
                evenNum++;
            }
        }

        return oddNum>evenNum?evenNum:oddNum;   //只需要统计奇数筹码与偶数筹码中较小的那个就是最后的结果
    }
}
