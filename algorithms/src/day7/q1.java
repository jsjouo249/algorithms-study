package day7;

//733. Flood Fill

import java.util.LinkedList;
import java.util.Queue;

class Pos {
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class q1 {
    public static void main(String[] agrs) {
//        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        int sr = 1;
        int sc = 0;
        int color = 2;
        floodFill(image, sr, sc, color);
    }

    static int[] moveX = {0, 1, 0, -1};
    static int[] moveY = {1, 0, -1, 0};

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Pos> que = new LinkedList<>();

        int pickColor = image[sr][sc];

        que.add(new Pos(sr, sc));

        while (!que.isEmpty()) {
            Pos pos = que.poll();

            if (image[pos.x][pos.y] == pickColor) {
                image[pos.x][pos.y] = color;
            }

            for (int i = 0; i < moveX.length; ++i) {
                int newX = pos.x + moveX[i];
                int newY = pos.y + moveY[i];
                if (newX >= 0 && newX < image.length && newY >= 0 && newY < image[0].length && image[newX][newY] == pickColor && image[newX][newY] != color) {
                    que.add(new Pos(newX, newY));
                }
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }

        return image;
    }
}
