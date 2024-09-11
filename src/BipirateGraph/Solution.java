package BipirateGraph;

import java.awt.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int [] [] graph ={{1,2,3},{0,2},{0,1,3},{0,2}};
        isBipartite(graph);
    }

    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int [] colour = new int[n];
        Arrays.fill(colour,-1);

        for(int i =0;i<n;i++){
            if(colour[i]==-1){
                if(!Bipartite(graph,colour,i,0)) return false;
            }
        }
        return true;

    }

    private static  boolean  Bipartite(int [][] graph ,int [] colour ,int curr, int col){

        colour[curr]=col;

        for(int i=0;i<graph[curr].length;i++){
            int adj = graph[curr][i];
            if(colour[adj]==-1){
                if(!Bipartite(graph,colour,adj,1-col)) return false;
            }else if(colour[adj]==col) return false;
        }

       return true;
    }

}
