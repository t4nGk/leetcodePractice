//给定一个正整数数组 w ，其中 w[i] 代表位置 i 的权重，请写一个函数 pickIndex ，它可以随机地获取位置 i，选取位置 i 的概率与 w[i
//] 成正比。 
//
// 
// 
//
// 例如，给定一个值 [1，9] 的输入列表，当我们从中选择一个数字时，很有可能 10 次中有 9 次应该选择数字 9 作为答案。 
//
// 
//
// 示例 1： 
//
// 输入：
//["Solution","pickIndex"]
//[[[1]],[]]
//输出：[null,0]
// 
//
// 示例 2： 
//
// 输入：
//["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
//[[[1,3]],[],[],[],[],[]]
//输出：[null,0,1,1,1,0] 
//
// 
//
// 输入语法说明： 
//
// 输入是两个列表：调用成员函数名和调用的参数。Solution 的构造函数有一个参数，即数组 w。pickIndex 没有参数。输入参数是一个列表，即使参数
//为空，也会输入一个 [] 空列表。 
//
// 
//
// 提示： 
//
// 
// 1 <= w.length <= 10000 
// 1 <= w[i] <= 10^5 
// pickIndex 将被调用不超过 10000 次 
// 
// Related Topics 二分查找 Random 
// 👍 40 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Java：按权重随机选择
 * date：2020-07-22 14:00:25
 **/
public class P528RandomPickWithWeight {
    public static void main(String[] args) {
        int[] w = new int[]{1,9};
        Solution solution = new P528RandomPickWithWeight().new Solution(w);
        // TO TEST
        for (int i = 0; i < 10; i++) {
            System.out.println(solution.pickIndex());
        }

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        List<Integer> psum = new ArrayList<>();
        int tot = 0;
        Random rand = new Random();

        public Solution(int[] w) {
            for (int x : w) {
                tot += x;
                psum.add(tot);
            }
        }

        public int pickIndex() {
            int targ = rand.nextInt(tot);

            int lo = 0;
            int hi = psum.size() - 1;
            while (lo != hi) {
                int mid = (lo + hi) / 2;
                if (targ >= psum.get(mid)) lo = mid + 1;
                else hi = mid;
            }
            return lo;
        }
    }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
