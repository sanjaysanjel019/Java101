package com.lessons.practise;
/*
Write a simple Java Program to validate whether a given set of strings are anagram or not.

String1 = "bat"
String2 = "tab"   <-- these string2 and string1 are anagram
 */
public class ValidAnagramPractise {

    public static void main(String[] args) {
        char lett = 'c';
        char lett2 = 'a';
        System.out.println(lett2-'b');
        System.out.println(lett2);
    }

    protected boolean isAnagram(String str1, String str2){

        // If two string are not of equal length - they cannot be an anagram
        if(str1.length() != str2.length()){
            return false;
        }

        int[] holdingArray = new int[26];

        for(int i=0;i<str1.length();i++){
            holdingArray[str1.charAt(i)-'a']++;
            holdingArray[str2.charAt(i)-'a']--;
        }

        return false;
    }
}
