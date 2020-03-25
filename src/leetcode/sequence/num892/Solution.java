package leetcode.sequence.num892;

/**
 * @author lqclester
 *
 */
/**
 * [0][0]=1  [0][1]=2   [1][0]=3  [1][1]=4
 * 48  -(1*2+1*2) - (2*2) - (3*2)=48 - 4 - 4- 6
 * <p>
 * [1,2],[3,4]
 * [0,0]=1 [0,1]=2
 * [1,0]=3 [1,1]=4
 * 34
 * 6+10+14+18 - (1*2 + 1*2 +2*2 + 3*2 ) =48-14=34
 * <p>
 * [2,2,2],[2,1,2],[2,2,2]
 * [0,0]=2 [0,1]=2 [0,2]=2
 * [1,0]=2, [1,1]=1 [1,2]=2
 * [2,0]=2, [2,1]=2 [2,2]=2
 * 46
 * [1,0],[0,2]
 */
class Solution {
    public int surfaceArea(int[][] grid) {
        int point = 0;
        int sub = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                int target = grid[x][y]; //grid[1,4]
                if (target == 0) {
                    continue;
                }

                point += target == 1 ? 6 : (target * 4 + 2);
                if (y + 1 < grid[x].length) {
                    sub += Math.min(grid[x][y + 1], target); //grid[1,  5]
                }
                if (x + 1 < grid.length && y <= grid[x + 1].length) {
                    sub += Math.min(grid[x + 1][y], target);      //grid[2, 4]
                }

            }
        }
        return point - 2 * sub;
    }
}