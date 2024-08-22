package MaxPointsFromCards;

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n= cardPoints.length;
        int i=0;
        int j=n-1;
        int sum =0;
        for(i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int maxPoints=sum;
        while(i>0){
            sum-=cardPoints[i-1];
            sum+=cardPoints[j];
            maxPoints = Math.max(sum,maxPoints);
            j--;
            i--;
        }


        return maxPoints;

    }
}