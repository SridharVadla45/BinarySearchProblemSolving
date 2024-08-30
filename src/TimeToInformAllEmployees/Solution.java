package TimeToInformAllEmployees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] manager = {5,9,6,10,-1,8,9,1,9,3,4};
        int [] informTIme ={0,213,0,253,686,170,975,0,261,309,337};
        int result = solution.numOfMinutes(11,4,manager,informTIme);
        System.out.println("TimeTaken :" + result);
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
      return  bfs(n,headID,manager,informTime);
    }


    private static int bfs(int n, int headID, int[] manager, int[] informTime){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(headID);
        int time =0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int levelTime =0;
            for(int i=0;i<size;i++){
               int head=  queue.poll();
               levelTime=Math.max(levelTime,informTime[head]);
               for(int j=0;j<manager.length;j++){
                   if(manager[j]==head){
                       queue.add(j);
                   }
               }
            }
            time+=levelTime;
        }
        return  time;
    }


}
