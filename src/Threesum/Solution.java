package Threesum;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = new Solution().threeSum(nums);
        System.out.println(result.toString());
    }

    public List<List<Integer>> threeSum(int[] nums) {

        return brute(nums);

    }
    // Time complexity : O(n*n)
    // Time Complexity :(n) + O(unique triplets)
    private static List<List<Integer>> brute(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<List<Integer>> set = new HashSet<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
               int sum=nums[i]+nums[j];
                if(map.containsKey(-1*sum) && map.get(-1*sum)!=i && map.get(-1*sum)!=j ){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(-1*sum);
                    Collections.sort(list);
                    set.add(list);
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> i:set){
            ans.add(i);
        }

        return ans;
    }




}