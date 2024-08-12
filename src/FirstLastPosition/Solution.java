package FirstLastPosition;

public class Solution {

    public int[] searchRange(int[] nums, int target) {
       int low =binarySearchLowBound(nums,target);
       int high =binarySearchUpperBound(nums,target);
       int [] ans ={-1,-1};
       if(!binarySearch(nums,target)) return ans;
       if(isValid(low,high,nums.length)){
           ans[0]=low;
           ans[1]=high;
           return ans;
       }

       return  ans;

    }

    private static boolean isValid(int start,int end,int n){
        if(start<0 || start>=n || end <0 || end>=n)  return false;
        return true;
    }


    private static int  binarySearchLowBound(int[] nums, int target){

        int start =0,end= nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<=nums[mid]) end=mid-1;
            else start=mid+1;
        }

        return end+1;
    }

    private static int  binarySearchUpperBound(int[] nums, int target){
        int start =0,end= nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<nums[mid]) end=mid-1;
            else start=mid+1;
        }
        return start;
    }

    private static boolean  binarySearch(int[] nums, int target){
        int start =0,end= nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target==nums[mid]) return true;
            else if(target<nums[mid]) end=mid-1;
            else start=mid+1;
        }
        return false;
    }

}
