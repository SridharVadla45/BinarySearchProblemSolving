package FruitsIntoBaskets;

import java.util.HashMap;

public class Solution {
    public int totalFruit(int[] fruits) {
       int result =0;
       int n= fruits.length;
        HashMap<Integer,Integer> left ;
        HashMap<Integer,Integer>  right ;
       for(int i=0;i<n;i++){
           left = new HashMap<Integer,Integer>();
           right = new HashMap<Integer,Integer>();
           for(int j=i;j<n;j++){
              if(left.isEmpty() || left.containsKey(fruits[i])){
                  left.put(fruits[i],1);
                  if(left.containsKey(fruits[i])){
                      left.put(fruits[i],left.get(fruits[i])+1);
                  }
              }else if(right.isEmpty() || right.containsKey(fruits[i])){
                  right.put(fruits[i],1);
                  if(right.containsKey(fruits[i])){
                      right.put(fruits[i],right.get(fruits[i])+1);
                  }
              }else{
                  break;
              }
              result = Math.max(result,left.size()+right.size());
           }
       }

       return  result;
    }
}
