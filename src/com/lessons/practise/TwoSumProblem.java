package com.lessons.practise;

import java.util.HashMap;
import java.util.Map;

/*
* Given an array  of integers `nums` and an integer `target, retunr indices of two numbers such that
* they add upto the `target`
 */
public class TwoSumProblem {
    public static int[] twoSum(int[] arr, int k){
        Map<Integer,Integer> nMap = new HashMap<>();
        for(int i =0;i<arr.length;i++) {
            int diff = k - arr[i];

            if(nMap.containsKey(diff)){
                return new int[]{nMap.get(diff),i};
            }
            nMap.put(arr[i],i);
        }
        return null;

    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,12};
        int k = 12;
        int[] ans = new int[2];
        ans=twoSum(arr,k);

        for(int n:ans){
            System.out.println(n);
        }


    }
}
