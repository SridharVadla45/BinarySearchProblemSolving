package SwapPermutations;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        generatePermutation(nums,0,nums.length-1);
    }


    private static  void generatePermutation(int [] nums,int start,int end){
        if(start==end) System.out.println(Arrays.toString(nums));
        for(int i=start;i<=end;i++){
            swapNumbers(start,i,nums);
            generatePermutation(nums,start+1,end);
            swapNumbers(start,i,nums);
        }
    }


    private static void swapNumbers(int i,int j ,int [] nums){
        int temp= nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }


}
