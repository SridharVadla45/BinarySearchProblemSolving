package ArrayManuplationK;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {


    public static void main(String[] args) {
        int [] nums = {161209470};
        new Solution().getFinalState(nums,56851412,39846);
        System.out.println(Arrays.toString(nums));
    }

    class pair implements Comparable<pair> {
        Long a;
        Integer b;

        pair(long a,int b){
            this.a=a;
            this.b=b;
        }

        @Override
        public int compareTo(pair o) {
            if(this.a.compareTo(o.a)==0) return this.b.compareTo(o.b);
            return this.a.compareTo(o.a);
        }

        @Override
        public String toString() {
            return "pair{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }


    public   int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        PriorityQueue<pair> pq = new PriorityQueue<>(n);
        int mod = 1000000007;
        for(int i=0;i<n;i++){
            pq.add(new pair(nums[i]%mod,i));
        }

        System.out.println(Arrays.toString(pq.toArray()));

        for(int i =0;i<k;i++){
           pair p= pq.poll();
           p.a*=multiplier;
           pq.add(p);
           System.out.println(Arrays.toString(pq.toArray()));
        }

        while(!pq.isEmpty()){
            pair p = pq.poll();
            nums[p.b]= (int) (p.a%mod);
        }
        return  nums;
    }

















    public int[] getFinalState1(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int index = minIndex(nums);
            nums[index]*=multiplier;
        }
        return nums;
    }


    private static int minIndex(int [] nums){
        int mini = Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<mini){
                mini=nums[i];
                index=i;
            }
        }
        return index;
    }
}
