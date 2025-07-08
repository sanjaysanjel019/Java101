package com.lessons;


public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram vaObj = new ValidAnagram();
        System.out.println(vaObj.isAnagram("caro","wcar"));

    }

    public boolean isAnagram(String str1, String str2){
        // The first condition is to be an Anagram ,the strings length must be equal.
        if(str1.length() != str1.length()){
            return false;
        }

        // Creating an array to count the character frequencies
        int[] charCounts = new int[26];

        //Increment count for each characters is 'str1' and decrement for each in 'str2'
        // Essentially. for a value we are populating the array for it's reference numbers and if found on str2, decreasing it.
        for(int i=0;i<str1.length();i++){
            charCounts[str1.charAt(i)-'a']++;
            charCounts[str2.charAt(i)-'a']--;
        }

        //Check if all counts are zero
        for(int count:charCounts){
            if(count !=0 ){
                return false;
            }
        }
        return true;
    }

}

