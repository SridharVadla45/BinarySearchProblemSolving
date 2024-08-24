package LongestSubStringWithOutRepeating;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        better("pwwkew");
    }

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map ;
        int result=0;
        for(int i=0;i<s.length();i++){
            map = new HashMap<>();
            map.put(s.charAt(i),1);
            for(int j=i+1;j<s.length();j++){
                if(map.containsKey(s.charAt(j))){
                    result= Math.max(result,map.size());
                    break;
                }else{
                    map.put(s.charAt(j),1);
                }
            }
            result= Math.max(result,map.size());
        }
        return result;
    }


    private static int better (String s){
        int n=s.length();
        HashSet<Character> set = new HashSet<>();
        int pointer =0;
        int result =0;
        for(int i =0;i<n;i++){
            if(set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))){
                    char c= s.charAt(pointer);
                    set.remove(c);
                    pointer++;
                }
                set.add(s.charAt(i));
                result=Math.max(result,set.size());
            }else{
                set.add(s.charAt(i));
                result=Math.max(result,set.size());
            }
        }
        return result;
    }



    private  static  int optimal(String s ){
        int result =0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int pointer =0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(!map.containsKey(c) || map.get(c)<pointer){
                map.put(c,i);
                result =  Math.max(result,i-pointer+1);
            }else{
                pointer = map.get(c)+1;
            }
        }
        return result;
    }




}