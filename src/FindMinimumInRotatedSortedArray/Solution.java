package FindMinimumInRotatedSortedArray;

public class Solution {
    public static void main(String[] args) {

    }

    public int findMin(int[] nums) {
      return binarySearch(nums);
    }


    private static  int binarySearch(int [] nums){
        int start=0,end=nums.length-1;
        int ans =Integer.MAX_VALUE;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(nums[start]<=nums[mid]){
                ans=Math.min(nums[start],ans);
                start=mid+1;
            }else{
                ans=Math.min(nums[mid],ans);
                end=mid-1;
            }
        }
        return ans;
    }


}
