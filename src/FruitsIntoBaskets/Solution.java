package FruitsIntoBaskets;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int [] arr = {1,2,3,2,2};
        System.out.println(brute(arr));

    }
    public  static  int brute(int[] fruits) {
        int result =0;
        int i=0;
        int j=0;
        int n = fruits.length;
        int [] baskets = new int[2];
        int [] fruitCount = new int [n+1];
        Arrays.fill(baskets,-1);
        while (j<n){
            int fruit = fruits[j];
            if(baskets[0]==-1 || fruit == baskets[0]){
                baskets[0]=fruit;
                fruitCount[fruit]++;
            } else if (baskets[1]==-1 || fruit == baskets[1]) {
                baskets[1]=fruit;
                fruitCount[fruit]++;
            }else{
                while(fruitCount[baskets[0]]!=0 && fruitCount[baskets[1]]!=0){
                    fruitCount[fruits[i]]--;
                    i++;
                }
                if(fruitCount[baskets[0]]==0){
                    baskets[0]=fruit;
                    fruitCount[fruit]++;
                }else{
                    baskets[1]=fruit;
                    fruitCount[fruit]++;
                }
            }
            result= Math.max(result,j-i+1);
            j++;
        }

        return result;
    }
}
