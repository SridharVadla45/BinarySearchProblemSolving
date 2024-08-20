package PermutationAndCombinations;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        generatePermutations(nums);
        System.out.println(Arrays.toString(nums));

    }

    private  static String generatePermutations(int [] arr){
        int n= arr.length;

        boolean [] isVisited = new boolean[n];

            for (int i = 0; i < n; i++) {
                    String ans ="";
                    int [] count={0};
                    recursiveCall(arr,i, isVisited,ans,count);
                    return ans;
            }
            return "";
    }


    private static void recursiveCall(int [] arr, int current , boolean [] isVisited,String ans,int [] count ){
        isVisited[current]=true;
        ans+=""+arr[current];
        for(int i=0;i<isVisited.length;i++){
            if(!isVisited[i]){
                recursiveCall(arr,i,isVisited,ans,count);
            }
        }

        if(ans.length()==arr.length){
            count[0]++;
                    if(count[0]==2){
                        for(int i=0;i<ans.length();i++){
                            String c = String.valueOf(ans.charAt(i));
                            Integer val = Integer.parseInt(c);
                            arr[i]=val;
                        }
                        System.out.println(ans);
                        return;
                    }
        }
        isVisited[current] = false;

    }

}
