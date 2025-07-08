package com.lessons;

import java.util.HashSet;

/**
 * 1.0

 *
 Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
    ContainsDuplicate obj = new ContainsDuplicate();
    int[] nums = {1,2,3,4,5,6,7,2};
    boolean ans = obj.containsDuplicate(nums);
        System.out.println("Answer :"+ans);
    }

    public boolean containsDuplicate(int[] nums){
        //Create a Hashset to store elements from the array
        HashSet<Integer> seenNumbers = new HashSet<>();
        for(int num:nums){
            if(seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }

}
