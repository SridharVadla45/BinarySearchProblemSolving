package lexicographicallySmallest;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int position = binarySearch(letters,target);
        if(position>=0 && position<=letters.length-1){
            for(int i=position;i<=letters.length-1;i++){
                if(letters[i]!=target)return letters[i];
            }
        }
        return letters[0];

    }


    private static int binarySearch(char[] letters, char target){

        int start=0,end=letters.length-1;
        while(start<=end)
        {
            int mid =start +(end-start)/2;
            if(letters[mid]==target) return mid+1;
            else if(target<letters[mid])end=mid-1;
            else start=mid+1;
        }

        return start;
    }
}