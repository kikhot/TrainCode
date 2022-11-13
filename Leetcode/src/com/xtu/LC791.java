package com.xtu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LC791 {
    public String customSortString(String order, String s){
        Map<Character, Integer> orderMap = new LinkedHashMap<>();
        String resultStr = "";
        for(int i=0;i<order.length();i++){
            orderMap.put(order.charAt(i), 0);
        }
        for(int i=0;i<s.length();i++){
            if(orderMap.containsKey(s.charAt(i))){
                orderMap.put(s.charAt(i), orderMap.get(s.charAt(i))+1);
            }else{
                resultStr += s.charAt(i);
            }
        }
        for(Character ch : orderMap.keySet()){
            for(int i=0;i<orderMap.get(ch);i++){
                resultStr += ch;
            }
        }
        return resultStr;
    }
}
