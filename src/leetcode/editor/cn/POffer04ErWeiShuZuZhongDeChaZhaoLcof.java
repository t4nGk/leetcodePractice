//在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
//判断数组中是否含有该整数。 
//
// 
//
// 示例: 
//
// 现有矩阵 matrix 如下： 
//
// [
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
// 
//
// 给定 target = 5，返回 true。 
//
// 给定 target = 20，返回 false。 
//
// 
//
// 限制： 
//
// 0 <= n <= 1000 
//
// 0 <= m <= 1000 
//
// 
//
// 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/ 
// Related Topics 数组 双指针 
// 👍 110 👎 0


package leetcode.editor.cn;

/**
 * Java：二维数组中的查找
 * date：2020-07-22 16:41:16
 **/
public class POffer04ErWeiShuZuZhongDeChaZhaoLcof {
    public static void main(String[] args) {
        Solution solution = new POffer04ErWeiShuZuZhongDeChaZhaoLcof().new Solution();
        // TO TEST
        System.out.println(solution.findNumberIn2DArray(new int[][]{{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24},{18, 21, 23, 26, 30}}, 5));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            int row = matrix.length;
            if (row == 0) return false;
            int col = matrix[0].length;
            if (col == 0) return false;
            int i = 0;
            int j = col - 1;
            while (i < row && j >= 0) {
                if (matrix[i][j] == target) return true;
                else if (matrix[i][j] < target) i++;
                else j--;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
