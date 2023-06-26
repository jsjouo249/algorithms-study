package day7;

//695. Max Area of Island

import java.util.LinkedList;
import java.util.Queue;

class Pos2 {
    int x;
    int y;

    public Pos2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class q2 {
    public static void main(String[] agrs) {
        int[][] grid = {{1,1,0,0,0}, {1,1,0,0,0}, {0,0,0,1,1}, {0,0,0,1,1}};
        maxAreaOfIsland(grid);
    }

    static int maxArea = 0;

    static int[] moveX = {0, 1, 0, -1};
    static int[] moveY = {1, 0, -1, 0};

    public static int maxAreaOfIsland(int[][] grid) {
        maxArea = 0;

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 1) {
                    setGrid(grid, i, j);
                }
            }
        }

        return maxArea;
    }

    private static int[][] setGrid(int[][] grid, int x, int y) {
        Queue<Pos2> que = new LinkedList<>();

        int max = 1;

        que.add(new Pos2(x, y));
        if (grid[x][y] == 1) {
            grid[x][y] = 2;
        }

        while (!que.isEmpty()) {
            Pos2 pos = que.poll();

            for (int i = 0; i < moveX.length; ++i) {
                int newX = pos.x + moveX[i];
                int newY = pos.y + moveY[i];
                if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == 1) {
                    que.add(new Pos2(newX, newY));
                    grid[newX][newY] = 2;
                    max++;
                }
            }
        }

        maxArea = Math.max(maxArea, max);

        return grid;
    }
}
