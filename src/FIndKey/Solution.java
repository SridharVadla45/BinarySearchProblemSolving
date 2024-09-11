package FIndKey;

class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int [] num1Arr = new int[4];
        int [] num2Arr = new int[4];
        int [] num3Arr = new int[4];
        StringBuilder str = new StringBuilder();
        loadDigitsIntoArray(num1,num1Arr);
        loadDigitsIntoArray(num2,num2Arr);
        loadDigitsIntoArray(num3,num3Arr);

        for(int i=0;i<4;i++){
            str.append(Math.min(num3Arr[i],Math.min(num1Arr[i],num2Arr[i])));
        }

        return Integer.parseInt(str.toString());
    }


    private static void loadDigitsIntoArray(int num , int [] arr){
        int n = arr.length-1;

        while(num!=0){
            arr[n]=num%10;
            num =num/10;
            n--;
        }
    }
}