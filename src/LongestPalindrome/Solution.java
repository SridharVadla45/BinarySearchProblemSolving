package LongestPalindrome;

import java.util.HashMap;
import java.util.Iterator;

public class Solution {

    public static void main(String[] args) {
      Solution solution = new Solution();
      String s = "abccccdd";
      int palindromeLength = solution.longestPalindrome(s);
      System.out.println(palindromeLength);
    }


    public int longestPalindrome(String s) {
     int palindromeLength =0;
     HashMap<Character,Integer> map = new HashMap<>();
     for(char c : s.toCharArray()){
         if(map.containsKey(c)){
             map.put(c,map.get(c)+1);
         }else{
             map.put(c,1);
         }
     }

    Iterator<Character> charSet=  map.keySet().iterator();
     while (charSet.hasNext()){
         char c = charSet.next();
         int count = map.get(c);
         if(count%2==0){
             palindromeLength+=count;
         }else{
             palindromeLength+=count-1;
         }
     }
     return palindromeLength+1;
    }
}
