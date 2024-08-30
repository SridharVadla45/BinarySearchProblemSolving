package Pyramid;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the base size of the pyramid");
        int input = sc.nextInt();
        printPyramid(input);

    }

    private static  void printPyramid(int n ){
         int base =n;
         int count=1;
        for(int i=0;i<n;i++){
            if(count<=base) {
                int half = (base - count) / 2;
                for (int m = 0; m < half; m++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < count; j++) {
                    System.out.print("*");
                }
                for (int m = 0; m < half; m++) {
                    System.out.print(" ");
                }
            }
            count+=2;
            System.out.println();

        }

    }

}
