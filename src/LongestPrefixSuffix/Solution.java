package LongestPrefixSuffix;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        better("abab");
    }
    int lps(String s) {
        // code here
        ArrayList<String> prefix = new ArrayList<>();
        ArrayList<String> suffix = new ArrayList<>();
        int n=s.length();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n-1;i++){
            str.append(s.charAt(i));
            prefix.add(str.toString());
        }

        String temp ="";
        for(int i=n-1;i>0;i--){
           String c= String.valueOf(s.charAt(i));
           temp=c+temp;
           suffix.add(temp);
        }
        int result =0;
        for(int i=0;i<prefix.size();i++){
            if(prefix.get(i).equals(suffix.get(i))){
                result= Math.max(result,prefix.get(i).length());
            }
        }
        return result;
    }

    static   int better(String s){

        int result =0;
        int n=s.length();

        int start=0;
        int end  = n-1;
        StringBuilder prefix= new StringBuilder();
        StringBuilder suffix= new StringBuilder();
        while(start<n-1){
            prefix.append(s.charAt(start));
            suffix.insert(0, s.charAt(end));
            if(prefix.toString().equals(suffix.toString())){
                result=Math.max(prefix.length(),result);
            }
            start++;
            end--;
        }


        return result;
    }




}
