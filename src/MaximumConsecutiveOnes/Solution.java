package MaximumConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      return brute(nums);
    }


    private static  int brute(int [] nums){
        int result= 0;
        int count=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                count++;
                result=Math.max(count,result);
            }else{
                count=0;
            }
        }
        return  result;
    }






}
