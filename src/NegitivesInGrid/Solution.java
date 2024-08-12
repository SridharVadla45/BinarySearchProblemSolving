package NegitivesInGrid;

public class Solution {

    public static void main(String[] args) {

    }

    public int countNegatives(int[][] grid) {
        return bruteApproach(grid);
    }

    private static int bruteApproach(int[][] grid) {
        int count = 0;

        for (int[] a : grid) {
            for (int i : a) {
                if (i < 0) count++;
            }
        }

        return count;

    }

    private static int betterApproach(int[][] grid) {
        int count = 0;
        for (int[] a : grid) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0) {
                    count += a.length - i;
                    break;
                }
            }

        }
        return count;
    }


    private static int optimalApproach(int[][] grid) {
        int count = 0;
        for (int[] a : grid) {
            int i=binarySearch(a);
            count+=a.length-i+1;
        }
        return count;
    }

    private static int binarySearch(int [] list){
        int start=0;
        int end =list.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(list[mid]<0){
                end=mid-1;
            }else {
                start = mid+1;
            }
        }
        return end;
    }
}
