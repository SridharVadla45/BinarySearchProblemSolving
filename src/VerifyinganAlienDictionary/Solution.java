package VerifyinganAlienDictionary;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        String [] words=  {"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        boolean result = new Solution().isAlienSorted(words,order);
        System.out.println(result);
    }
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> orderMap = new HashMap<>();

        for(int i=0;i<order.length();i++){
            Character c = order.charAt(i);
            orderMap.put(c,i);
        }

        for(int i=0;i<words.length-1;i++){
            String word1 = words[i];
            String word2 = words[i+1];

            if(!isSorted(word1,word2,orderMap)) return false;
        }
        return true;

    }


    private static boolean isSorted(String str1, String str2 , HashMap<Character,Integer> orderMap){

        for(int i=0;i<str1.length();i++){
            Character c1 = str1.charAt(i);
            if(i>=str2.length()) return false;
            Character c2 = str2.charAt(i);
            if(orderMap.get(c1) < orderMap.get(c2)) return true;
            if(orderMap.get(c1) > orderMap.get(c2)) return false;

        }
        return true;
    }
}
