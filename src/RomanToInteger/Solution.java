package RomanToInteger;

import java.util.HashMap;

public class Solution {

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;
        for(int i=0;i<s.length()-1;i++){
            char c = s.charAt(i);
            char c2= s.charAt(i+1);
            if(map.get(c)<map.get(c2))result-=map.get(c);
            else result+=map.get(c);
        }
        char c = s.charAt(s.length()-1);
        result+=map.get(c);
        return result;

    }



}
