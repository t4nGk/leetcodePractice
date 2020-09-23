//给定一副牌，每张牌上都写着一个整数。 
//
// 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组： 
//
// 
// 每组都有 X 张牌。 
// 组内所有的牌上都写着相同的整数。 
// 
//
// 仅当你可选的 X >= 2 时返回 true。 
//
// 
//
// 示例 1： 
//
// 输入：[1,2,3,4,4,3,2,1]
//输出：true
//解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
// 
//
// 示例 2： 
//
// 输入：[1,1,1,2,2,2,3,3]
//输出：false
//解释：没有满足要求的分组。
// 
//
// 示例 3： 
//
// 输入：[1]
//输出：false
//解释：没有满足要求的分组。
// 
//
// 示例 4： 
//
// 输入：[1,1]
//输出：true
//解释：可行的分组是 [1,1]
// 
//
// 示例 5： 
//
// 输入：[1,1,2,2,2,2]
//输出：true
//解释：可行的分组是 [1,1]，[2,2]，[2,2]
// 
//
// 
//提示： 
//
// 
// 1 <= deck.length <= 10000 
// 0 <= deck[i] < 10000 
// 
//
// 
// Related Topics 数组 数学 
// 👍 184 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * Java：卡牌分组
 * date：2020-09-15 13:48:17
 **/
public class P914XOfAKindInADeckOfCards {
    public static void main(String[] args) {
        Solution solution = new P914XOfAKindInADeckOfCards().new Solution();
        // TO TEST
        System.out.println(solution.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        System.out.println(solution.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
        System.out.println(solution.hasGroupsSizeX(new int[]{1}));
        System.out.println(solution.hasGroupsSizeX(new int[]{1, 1}));
        System.out.println(solution.hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {
            // 计数
            int[] counter = new int[10000];
            for (int num: deck) {
                counter[num]++;
            }
            // 迭代求多个数的最大公约数
            int x = 0;
            for(int cnt: counter) {
                if (cnt > 0) {
                    x = gcd(x, cnt);
                    if (x == 1) { // 如果某步中gcd是1，直接返回false
                        return false;
                    }
                }
            }
            return x >= 2;
        }

        // 辗转相除法
        private int gcd (int a, int b) {
            return b == 0? a: gcd(b, a % b);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
