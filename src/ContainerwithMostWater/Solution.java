package ContainerwithMostWater;

public class Solution {

    public static void main(String[] args) {
        int [] nums = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(nums) ;
        System.out.println(result);
    }

    public static  int maxArea(int[] height) {
//        return  brute(height);
        return  better(height);
    }


    private static int brute(int [] height){
        int maxArea=0;
        int n= height.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int distance = j-i;
                int min = Math.min(height[i],height[j]);
                maxArea= Math.max(maxArea,distance*min);
            }
        }
        return maxArea;
    }

    private static  int better(int [] height){
        int maxArea=0;
        int n= height.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int distance = j-i;
            int min = Math.min(height[i],height[j]);
            maxArea= Math.max(maxArea,distance*min);
            if(height[i]<=height[j]){
                i++;
                while(i<n && height[i]<height[i-1]) i++;
            }else{
                j--;
                while(j>=0 && height[j]<height[j+1]) j--;
            }
        }
        return  maxArea;
    }
}
