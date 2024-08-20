package SortVowelsinString;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public String sortVowels(String s) {
        StringBuilder temp= new StringBuilder();
        ArrayList<Character> arr= new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c =='a'  || c=='A' || c=='e' ||c=='E' ||c=='i' ||c=='I' ||c=='o' ||c=='O' ||c=='u' || c=='U'){
                arr.add(c);
            }
        }
        Collections.sort(arr);
        int pointer=-1;
        for(char c : s.toCharArray()){
            if(c =='a'  || c=='A' || c=='e' ||c=='E' ||c=='i' ||c=='I' ||c=='o' ||c=='O' ||c=='u' || c=='U'){
                pointer++;
                temp.append(arr.get(pointer));
            }else {
                temp.append(c);
            }
        }

        return temp.toString();
    }

}
