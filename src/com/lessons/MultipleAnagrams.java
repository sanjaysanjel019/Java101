package com.lessons;

import java.util.*;

public class MultipleAnagrams {

    public static void main(String[] args) {
        MultipleAnagrams msg = new MultipleAnagrams();
        String[] strings = {"man","tea","nam","eat","ate"};
        List<List<String>> groupAnagrams = msg.groupAnagrams(strings);
        System.out.println(groupAnagrams);
    }

    public List<List<String>> groupAnagrams (String[] strs){
        if(strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String,List> answerMap = new HashMap<>();

        int[] count = new int[26];

        for(String s:strs){
            Arrays.fill(count,0);
            for(char c:s.toCharArray()){
                count[c-'a']++;
                System.out.println("The value of count array is ==>"+count);
            }

            StringBuilder sb = new StringBuilder();

            for(int i=0;i<26;i++){
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();
            if(!answerMap.containsKey(key)){
                answerMap.put(key,new ArrayList());
            }

            answerMap.get(key).add(s);
        }

        return new ArrayList(answerMap.values());
    }
}
