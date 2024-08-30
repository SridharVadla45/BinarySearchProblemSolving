package MaxConsecutiveOnesIII;

public class Solution {
    public int longestOnes(int[] nums, int k) {
          return  better(nums,k);
    }


    private static  int better(int [] nums , int k){
        int result =0;

        int i=0,j=0;
        int n= nums.length;
        int zeros = 0;
        while (j<n){
            if(nums[j]==1){
                j++;
                result = Math.max(j-i+1,result);
            }else{
                if(zeros <=k){
                    j++;
                    zeros++;
                    result = Math.max(j-i+1,result);
                }else{
                    while(nums[i]!=0){
                        i++;
                    }
                    while(zeros<=k){
                        zeros--;
                        i++;
                    }
                }
            }
        }


        return  result;
    }

}
