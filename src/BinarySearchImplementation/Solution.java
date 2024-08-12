package BinarySearchImplementation;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = binarySearchIterative(nums, 8);
        System.out.println("found at index  " + result);

        int result1 = binarySearchRecursive(nums, 0, nums.length - 1, 81);
        System.out.println("found at index  " + result1);

    }

    private static int binarySearchIterative(int[] arr, int target) {
        int low = 0, end = arr.length - 1;
        int mid = -1;

        while (low <= end) {
            mid = low + (end - low) / 2;
            if (arr[mid] == target) return mid;
            else if (target < arr[mid]) end = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }

    private static int binarySearchRecursive(int[] arr, int start, int end, int target) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) return mid;
        if (target < arr[mid]) {
            return binarySearchRecursive(arr, start, mid - 1, target);
        } else {
            return binarySearchRecursive(arr, mid + 1, end, target);
        }

    }


}
