package SearchInsertPosition;

import javax.sound.midi.SysexMessage;

public class Solution {

    public static void main(String[] args) {
       Solution solution =  new Solution();

       int nums [] = {1,3,5,6};
       int result = solution.searchInsert(nums,5);
        System.out.println(result);
    }

    public int searchInsert(int[] nums, int target) {
     return binarySearch(nums,target);
    }


    private static int binarySearch(int [] nums ,int target){
        int low=0,end=nums.length-1;
        int mid =-1;
        while(low<=end){
            mid = low +(end-low)/2;
            if(nums[mid]==target)return mid;
            else if (target< nums[mid]) end=mid-1;
            else low=mid+1;
        }
        return low;
    }
}
