package leetcode.sequence.num999;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lqclester
 */
class Solution {
    public int numRookCaptures(char[][] board) {
        Set<String> bishop = new HashSet<>();//我方象
        List<List<Character>> pawn = new ArrayList<>(); //敌方卒
        int rookX, rookY;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    rookX = i;
                    rookY = j;
                    continue;
                }
                if (board[i][j] == 'p') {

                }
            }
        }
        return 0;
    }
}