package CourseScheduler1;

import com.sun.security.auth.UnixNumericGroupPrincipal;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        int [][] pre = {{1,0}};
        System.out.println(canFinish(2,pre));
    }

    public static  boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] indegree = new int[numCourses];
        ArrayList<Integer>[] graph = generateGraph(numCourses,prerequisites,indegree);
        ArrayList<Integer> topoSort = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) queue.add(i);
        }

        while(!queue.isEmpty()){
            int value = queue.poll();
            topoSort.add(value);
            for(int i=0;i<graph[value].size();i++){
                int adj = graph[value].get(i);
                indegree[adj]-=1;
                if(indegree[adj]==0) queue.add(adj);
            }
        }

       if( topoSort.size() == numCourses )return true;
       return false;
    }

    public static void displayGraph(ArrayList<Integer>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Node " + i + ": ");
            for (int neighbor : graph[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }


    private static  ArrayList<Integer>[]  generateGraph(int n, int[][] prerequisites,int [] indegree){
        ArrayList<Integer>[] graph = new ArrayList[n];

        // Initialize each element of the array with a new ArrayList
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int [] arr : prerequisites){
            int take = arr[0];
            indegree[take]+=1;
            int taken =arr[1];
            graph[taken].add(take);
        }
        return graph;
    }
}
