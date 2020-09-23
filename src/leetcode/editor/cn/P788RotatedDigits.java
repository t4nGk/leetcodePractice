//我们称一个数 X 为好数, 如果它的每位数字逐个地被旋转 180 度后，我们仍可以得到一个有效的，且和 X 不同的数。要求每位数字都要被旋转。 
//
// 如果一个数的每位数字被旋转以后仍然还是一个数字， 则这个数是有效的。0, 1, 和 8 被旋转后仍然是它们自己；2 和 5 可以互相旋转成对方（在这种情况
//下，它们以不同的方向旋转，换句话说，2 和 5 互为镜像）；6 和 9 同理，除了这些以外其他的数字旋转以后都不再是有效的数字。 
//
// 现在我们有一个正整数 N, 计算从 1 到 N 中有多少个数 X 是好数？ 
//
// 
//
// 示例： 
//
// 输入: 10
//输出: 4
//解释: 
//在[1, 10]中有四个好数： 2, 5, 6, 9。
//注意 1 和 10 不是好数, 因为他们在旋转之后不变。
// 
//
// 
//
// 提示： 
//
// 
// N 的取值范围是 [1, 10000]。 
// 
// Related Topics 字符串 
// 👍 79 👎 0


package leetcode.editor.cn;

/**
 * Java：旋转数字
 * date：2020-09-14 16:51:36
 **/
public class P788RotatedDigits {
    public static void main(String[] args) {
        Solution solution = new P788RotatedDigits().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int rotatedDigits(int N) {
            if (N < 2) return 0;
            if (N < 5) return 1;
            if (N < 6) return 2;
            if (N < 9) return 3;
            if (N < 10) return 4;
            int count = 4;
            int[] dp = new int[N + 1];
            dp[2] = 1;
            dp[3] = -1;
            dp[4] = -1;
            dp[5] = 1;
            dp[6] = 1;
            dp[7] = -1;
            dp[8] = 0;
            dp[9] = 1;
            for (int i = 10; i < N + 1; i++) {
                if (dp[i / 10] == -1 || dp[i % 10] == -1) dp[i] = -1;
                else if (dp[i / 10] == 0 && dp[i % 10] == 0) dp[i] = 0;
                else {
                    dp[i] = 1;
                    count++;
                }
            }
            return count;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
