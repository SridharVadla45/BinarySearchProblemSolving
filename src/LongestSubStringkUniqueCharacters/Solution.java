package LongestSubStringkUniqueCharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int longestSubstring(String s, int k) {
      return  0;
    }

    private static  int brute(String s ,int k ){
        int n= s.length();
        int result = 0;
        HashMap<Character,Integer> map ;
        for(int i=0;i<n;i++){
            map= new HashMap<>();
            for(int j=i;j<n;j++){
                char c = s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);
                boolean flag= false;
                for(Integer val : map.values()){
                    if(val<k){
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    result=Math.max(result,j-i+1);
                }
            }
        }

        return  result;
    }


}




