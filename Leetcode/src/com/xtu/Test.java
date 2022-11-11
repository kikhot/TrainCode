package com.xtu;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Test {

    public static int count(String str){
        String[] strnum = str.split(" ");
        int count = 0;
        for(int i=0;i<strnum.length-2;i++){
            if(strnum[i].equals(strnum[i+1]) && !strnum[i].equals(strnum[i+2])){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(count("can can need"));
    }
}
