//package EventfulSafeNodes;
//
//
//import java.util.List;
//import java.util.Stack;
//
//class Solution {
//
//
//    public List<Integer> eventualSafeNodes(int[][] graph) {
//        int n= graph.length;
//       boolean [] isVisited = new boolean[n];
//       boolean [] stack = new boolean[n];
//       boolean [] isTerminal = new boolean[n];
//
//       for(int i=0;i<n;i++){
//           if(graph[i].length==0) isTerminal[i]=true;
//       }
//
//        for(int i=0;i<n;i++){
//            if(!isVisited[i]) cyclicElements(graph,isVisited,i,stack);
//        }
//
//
//
//        for(int i=0;i<n;i++){
//           if(!stack[i]){
//               if(isSafeNode(i,graph,stack,isTerminal)){
//                   stack[i]=true;
//               }
//           }
//        }
//
//    }
//
//    private static  boolean isSafeNode(int curr, int [][] graph,boolean [] stack,boolean [] isTerminal){
//        for(int i=0;i<graph[curr].length;i++){
//            int dest = graph[curr][i];
//            if(isTerminal[dest]) continue;
//            if(stack[dest]) return false;
//            isSafeNode(dest,graph,stack,isTerminal);
//        }
//        return true;
//    }
//
//
//    private  static boolean cyclicElements(
//            int [][] graph, boolean [] isVisited,
//            int curr, boolean [] stack){
//
//        isVisited[curr]=true;
//        stack[curr]=true;
//
//        for(int i=0;i<graph[curr].length;i++){
//            int dest = graph[curr][i];
//            if(isVisited[dest] && stack[dest]) return true;
//            if(!isVisited[dest]){
//                if(cyclicElements(graph,isVisited,dest,stack))return true;
//            }
//        }
//
//        stack[curr]=false;
//
//    }
//}