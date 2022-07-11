package com.xtu;

import java.util.ArrayList;
import java.util.List;

/**
 * 执行用时：25 ms, 在所有 Java 提交中击败了71.83%的用户
 * 内存消耗：41.7 MB, 在所有 Java 提交中击败了89.50%的用户
 * 通过测试用例：83 / 83
 */
public class LC676 {
    class MagicDictionary{
        public List<String> dic;

        public MagicDictionary(){
            this.dic = new ArrayList<>();
        }

        public void buildDict(String[] dictionary){
            for(String str: dictionary){
                dic.add(str);
            }
        }

        public boolean search(String searchWord){
            int flag = 0;
            for(String str: dic){
                if(str.length()==searchWord.length()){
                    for(int i=0;i<str.length();i++){
                        if(flag > 1){
                            flag = 0;
                            break;
                        }else{
                            if(str.charAt(i) != searchWord.charAt(i))
                                flag++;
                        }
                    }
                    if(flag == 1){
                        return true;
                    }
                    flag = 0;
                }
            }
            return false;

        }

    }
}
