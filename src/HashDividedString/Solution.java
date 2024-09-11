package HashDividedString;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        stringHash("mxz",3);
    }

    public static  String stringHash(String s, int k) {
        int  n = s.length();
        StringBuilder result = new StringBuilder(); ;

        ArrayList<String> arr = new ArrayList<>();


        //window ok k size

        for(int i=0;i<n;i++){
            if(n-i>=k){
                StringBuilder stringBuilder = new StringBuilder();
                for(int j=0;j<k;j++){
                    stringBuilder.append(s.charAt(i));
                    i++;
                }
                i--;
                arr.add(stringBuilder.toString());
            }
        }

        for(String subString : arr){
            int sum =0;
            for(char c : subString.toCharArray()){
                sum+=((int) c - 97) %26 ;
            }
            sum%=26;
            result.append((char) (sum+97));

        }

        return result.toString();
    }
}
