package CountAlmostEqualPairs;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isAlmostEqualPair(12,21));
    }

    private static  boolean isAlmostEqualPair(int a,int b){
        if(a==b) return  true;
        char [] c1 = String.valueOf(a).toCharArray();
        char [] c2 = String.valueOf(b).toCharArray();
     if(c1.length>= c2.length) {
         for (int i = 0; i < c1.length; i++) {
             for (int j = i + 1; j < c1.length; j++) {
                 swap(c1, i, j);
                 if (Integer.parseInt(new String(c1)) == b) return true;
                 swap(c1, i, j);
             }
         }
     }else{
         for (int i = 0; i < c2.length; i++) {
             for (int j = i + 1; j < c2.length; j++) {
                 swap(c2, i, j);
                 if (Integer.parseInt(new String(c2)) == a) return true;
                 swap(c2, i, j);
             }
         }
     }

        return false;

    }


    private static void swap(char [] chars, int i ,int j ){
        char temp = chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }
}
