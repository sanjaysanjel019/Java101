package com.lessons;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.0

 *
 Given an integer array nums, and an integer target, return indices of the numbers in such that they add up to target.

 You may assume that each input word would have exactly one solution, and you may not use the same element twice.

 You can return your answer in any order.
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {3,5,67,2,54,1,89,76,4};
        int[] sol = ts.twoSum(nums,9);
        for(int s:sol){
            System.out.println(s);
        }
    }

    /**
     *  This is indeed a very tricky solution
     *  Essentially what we're doing here is.


     */
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        //Iterate through the array
        for(int i=0;i<nums.length;i++){

            // Calculate the complement of the given number
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if(map.containsKey(complement)){
                //If found, return the indice of the complement and the current number
                return new int[]{map.get(complement),i};
            }

            //Otherwise, add the current number and it's index to the map
            map.put(nums[i],i);
        }

        //Return an empty array is no solution is found
        return new int[]{};
    }
}
