package IntegerToRoman;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

    }

    private static void helper(int num) {

        while (num > 0) {
            if (num >= 1000) {
                int count = num / 1000;
                num -= 1000 * count;

                System.out.print(1000 * count + " ");

            } else if (num >= 100) {
                int count = num / 100;
                num -= 100 * count;

                System.out.print(100 * count + " ");

            } else if (num >= 10) {
                int count = num / 10;
                num -= 10 * count;

                System.out.print(10 * count + " ");
            } else if (num >= 1) {
                int count = num;
                num -= count;

                System.out.print(count + " ");

            }
            System.out.println();
        }
    }

    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",900);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("DM",900);
        map.put("M",1000);



        return "";
    }
// 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).


}
