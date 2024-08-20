//package PeakElement;
//
//import java.util.ArrayList;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        int [] arr= {1, 8, 1, 5, 3}
//    }
//
//    public static int findPeakElement(ArrayList<Integer> arr) {
//        // Write your code here.
//        if(arr.size()==1) return arr.get(0);
//        if(arr.get(0)>arr.get(1)) return arr.get(0);
//        if(arr.get(arr.size()-1)>arr.get(arr.size()-2)) return arr.get(arr.size()-1);
//        for(int i=1;i<arr.size()-1;i++){
//            if(arr.get(i-1)<arr.get(i) && arr.get(i)>arr.get(i+1)) return arr.get(i);
//        }
//
//        return -1;
//    }
//};
