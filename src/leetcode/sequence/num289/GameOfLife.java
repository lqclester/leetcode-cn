package leetcode.sequence.num289;

import java.util.ArrayList;

import static leetcode.model.Utils.printIntArrayArray;

/**
 * @author lqclester
 * 289. 生命游戏
 */
public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        printIntArrayArray(board);
        new Solution().gameOfLife(board);
        printIntArrayArray(board);
    }


    private static class Solution {
        public void gameOfLife(int[][] board) {
            if (board == null) {
                return;
            }
            int n = board.length;
            int m = board[0].length;
            ArrayList<Integer[]> changes = new ArrayList<>();
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < m; col++) {
                    int live = 0;
                    int[] point8 = new int[8];
                    point8[0] = row - 1 > 0 ? board[row - 1][col] : -1; //up
                    point8[1] = row + 1 < n ? board[row + 1][col] : -1;//down
                    point8[2] = col - 1 > 0 ? board[row][col - 1] : -1;//left
                    point8[3] = col + 1 < m ? board[row][col + 1] : -1;//right
                    point8[4] = col - 1 > 0 && row - 1 > 0 ? board[row - 1][col - 1] : -1;//upleft
                    point8[5] = col - 1 > 0 && row + 1 < n ? board[row + 1][col - 1] : -1;//upright
                    point8[6] = col + 1 < m && row - 1 > 0 ? board[row - 1][col + 1] : -1;//downleft
                    point8[7] = col + 1 < m && row + 1 < n ? board[row + 1][col + 1] : -1;//downright
                    for (int i = 0; i < point8.length; i++) {
                        if (point8[i] == 1) {
                            live++;
                        }
                    }
                    if ((board[row][col] == 0 && live == 3) || (board[row][col] == 1 && (live < 2 || live > 3))) {
                        Integer[] xy = new Integer[2];
                        xy[0] = row;
                        xy[1] = col;
                        changes.add(xy);
                        break;
                    }
                }
            }
            for (int i = 0; i < changes.size(); i++) {
                int row = changes.get(i)[0];
                int col = changes.get(i)[1];
                board[row][col] = board[row][col] == 0 ? 1 : 0;
            }
        }
    }
}
