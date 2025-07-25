package com.lessons;

import java.util.*;

/*
*
Given an integer array `nums` and an integer `k`, return the k most frequent elements.
You may return the answer in any order.
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements topk = new TopKFrequentElements();
        int[] arr1 = {1,1,1,2,2,3};
        // Output : [1,2]
        System.out.println(topk.topKFirstApproach(arr1,2));
    }

    /*
    * Here we'll use Hashmap + Heap (Priority Queue) to solve this problem.
     */
    public int[] topKFirstApproach(int[] arr, int num){

        if (num == arr.length){
            return arr;
        }

        Map<Integer,Integer> count = new HashMap<>();
        for(int n:arr){
            count.put(n, count.getOrDefault(n,0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (a,b) -> count.get(a)-count.get(b));

        for(int n:count.keySet()){
            heap.add(n);
            if(heap.size()>num){
                heap.poll();
            }
        }

        int[] ans = new int[num];
        for(int i=0;i<num;i++){
            ans[i] = heap.poll();
        }

        return ans;
    }
}
