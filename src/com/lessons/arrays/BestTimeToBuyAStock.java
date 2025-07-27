package com.lessons.arrays;

/*
You are given an array `prices` where `prices[i]` is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to
sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return `0`.
 */
public class BestTimeToBuyAStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,3,7,8,9,2}));

    }

    public static int maxProfit(int[] prices){
        int min = prices[0];
        int profit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            profit = Math.max(profit,prices[i]-min);
        }
        System.out.println("min:"+min);
        return profit;

    }
}
