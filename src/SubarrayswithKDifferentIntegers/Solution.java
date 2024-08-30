package SubarrayswithKDifferentIntegers;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int [] arr = {1,2,1,2,4};
        System.out.println(better(arr,2));
    }

    private static int brute(int[] nums, int k) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            map.clear();
            for (int j = i; j < n; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                if (map.size() == k) {
                    result++;
                }
                if (map.size() > k) {
                    break;
                }
            }
        }
        return result;
    }

    private static int better(int[] nums, int k) {
        int i = 0;
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int result = 0;
        while (j < n) {
            int val = nums[j];
            map.put(val, map.getOrDefault(val, 0) + 1);

               while(map.size()>k || j-i>1) {
                   int key = nums[i];
                   int value = map.get(key);
                   if (value == 1) {
                       map.remove(key);
                       result++;
                   } else {
                       map.put(key, value - 1);
                       result++;
                   }

                   i++;
               }


            if (map.size() == k) result++;
            j++;
        }
        return result;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {

        return 0;
    }


}
