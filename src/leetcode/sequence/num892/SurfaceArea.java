package leetcode.sequence.num892;

import leetcode.model.Utils;

/**
 * @author lqclester
 * 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 * <p>
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 * <p>
 * 请你返回最终形体的表面积。
 * <p>
 */
public class SurfaceArea {
    public static void main(String[] args) {
        int[][] array1 = Utils.toIntIntArray("[[2]]"); //10
        int[][] array2 = Utils.toIntIntArray("[[1,2],[3,4]]");//34
        int[][] array3 = Utils.toIntIntArray("[[1,0],[0,2]]"); //16
        int[][] array4 = Utils.toIntIntArray("[[1,1,1],[1,0,1],[1,1,1]]");//32
        int[][] array5 = Utils.toIntIntArray("[[2,2,2],[2,1,2],[2,2,2]]");//46
        System.out.println(new Solution().surfaceArea(array1));
        System.out.println(new Solution().surfaceArea(array2));
        System.out.println(new Solution().surfaceArea(array3));
        System.out.println(new Solution().surfaceArea(array4));
        System.out.println(new Solution().surfaceArea(array5));
    }
}

/**
 * n=1 grid=6, n=2 4n+2
 * 示例 1：
 * <p>
 * 输入：[[2]] grid[0][0]=2
 * 输出：10
 * 示例 2：
 * <p>
 * 输入：[[1,2],[3,4]]
 [0][0]=1  [0][1]=2
 [1][0]=3  [1][1]=4
 48  -(1*2+1*2) - (2*2) - (3*2)=48 - 4 - 4- 6

 * 输出：34
 * 示例 3：
 * <p>
 * 输入：[[1,0],[0,2]]
 * 输出：16
 * 示例 4：
 * <p>
 * 输入：[[1,1,1],[1,0,1],[1,1,1]]
 * 输出：32
 * 示例 5：
 * <p>
 * 输入：[[2,2,2],[2,1,2],[2,2,2]]
 * 输出：46
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/surface-area-of-3d-shapes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/