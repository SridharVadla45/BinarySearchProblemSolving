package MaxIslandArea;

import java.util.LinkedList;
import java.util.Queue;


class Solution {


    public static void main(String[] args) {
        int [][] grid = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        Solution solution = new Solution();
        solution.maxAreaOfIsland(grid);
    }

    private static int bfs(int[][] grid, Queue<Cell> queue, boolean[][] isVisited) {
        int count = 1;
        int m = grid.length;
        int n = grid[0].length;
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            isVisited[cell.x][cell.y] = true;

            for (int i = 0; i < 4; i++) {
                int posX = cell.x + delRow[i];
                int posY = cell.y + delCol[i];
                if (isValid(posX, posY, m, n) && !isVisited[posX][posY] && grid[posX][posY] == 1){
                    isVisited[posX][posY]=true;
                    queue.add(new Cell(posX, posY));
                    count++;
                }


            }
        }


        return count;

    }

    private static boolean isValid(int i, int j, int m, int n) {

        return i >= 0 && i < m && j >= 0 && j < n;

    }

    public int maxAreaOfIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;

        boolean[][] isVisited = new boolean[m][n];

        Queue<Cell> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0 ;j < n; j++) {
                if (!isVisited[i][j] && grid[i][j] == 1) {
                    isVisited[i][j]=true;
                    queue.add(new Cell(i, j));
                    int count = bfs(grid, queue, isVisited);
                    maxArea = Math.max(maxArea, count);
                }
            }
        }


        return maxArea;


    }

    static class Cell {
        int x;
        int y;

        public Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }


}
