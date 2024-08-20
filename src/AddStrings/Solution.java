package AddStrings;

public class Solution {

    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int i=len1-1;
        int j=len2-1;
        String result ="";
        while(i>=0 && j>=0){
            int carry =0;
            int up   = Integer.parseInt(String.valueOf(num1.charAt(i)));
            int down = Integer.parseInt(String.valueOf(num2.charAt(j)));
            int sum = up + down +carry;
            result=sum%10+result;
            carry= sum/10;
            i--;
            j--;
        }
        while(i>=0){
            result=Integer.parseInt(String.valueOf(num1.charAt(i)))+result;
        }

        while(j>=0){
            result=Integer.parseInt(String.valueOf(num2.charAt(j)))+result;
        }
        return result;
    }



}
