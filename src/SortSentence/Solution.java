package SortSentence;

public class Solution {

    public static void main(String[] args) {
     Solution solution = new Solution() ;
     String s = "is2 sentence4 This1 a3";
        System.out.println("Input :"+ s);
     String result = solution.sortSentence(s);
        System.out.println("Output:"+ result);

    }

    public String sortSentence(String s) {
        return bruteApproach(s);
    }
    // Time Complexity : O(n)
    // Space Complexity : shuffled sentence s containing no more than 9 words, can say constant :O(1)
    private  static String bruteApproach(String s){
        String [] words= s.split(" ");
        String [] sortedWords = new String[words.length+1];
        for(String word : words){
            int position = Integer.parseInt(String.valueOf(word.charAt(word.length()-1)));
            sortedWords[position]=word.substring(0,word.length()-1);
        }
        StringBuilder sentence= new StringBuilder();
        for(int i=0;i<sortedWords.length;i++){
            if(sortedWords[i]!=null && i!=sortedWords.length-1)
                sentence.append(sortedWords[i]).append(" ");
            else if(sortedWords[i]!=null && i==sortedWords.length-1)
                sentence.append(sortedWords[i]);


        }
        return  sentence.toString();
    }

}
