package MergeSortedArrays;

import java.sql.SQLOutput;

public class Solution {

    public static void main(String[] args) {
        int [] num1 = {1,2,2};
        int [] num2 =  {1,3,3};
        printSortedfromBack(num1,num2);
    }


    private static void printSortedfromBack(int [] nums1,int[] nums2){
        int i=nums1.length-1;
        int j=nums2.length-1;
        int total = nums1.length + nums2.length;
        int mid =0;

        while(j>=0 && i>=0){
            if(nums1[i]>=nums2[j]){
                System.out.print( nums1[i]+" ");
                i--;
            }else{
                System.out.print( nums2[j]+" ");
                j--;
            }
        }


        while(i>=0){
            System.out.print(nums1[i]+" ");
            i--;
        }

        while(j>=0){
            System.out.print(nums2[j]+" ");
            j--;
        }
    }

}
