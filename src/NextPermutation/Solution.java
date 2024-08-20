package NextPermutation;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
      int [] nums = {1,2,3};
      new Solution().nextPermutation(nums);
       System.out.println(Arrays.toString(nums));
      }

    public void nextPermutation(int[] nums) {
     helper(nums);
    }

    private static void helper(int [] nums) {
        int n = nums.length;
        int index=-1;
        for(int i=n-1;i>=0;i--){
            if(nums[i-1]<nums[i]){
                index=i-1;
                break;
            }
        }

        for(int i=index+1;i<n;i++){
            if(nums[i]>nums[index]){
                int temp =nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                break;
            }
        }

        int start=index+1;
        int end = n-1;
        while (start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
