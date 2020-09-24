//给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么该节点的值等于两个子节点中较小的一
//个。 
//
// 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。 
//
// 示例 1: 
//
// 输入: 
//    2
//   / \
//  2   5
//     / \
//    5   7
//
//输出: 5
//说明: 最小的值是 2 ，第二小的值是 5 。
// 
//
// 示例 2: 
//
// 输入: 
//    2
//   / \
//  2   2
//
//输出: -1
//说明: 最小的值是 2, 但是不存在第二小的值。
// 
// Related Topics 树 
// 👍 108 👎 0


package leetcode.editor.cn;

/**
 * Java：二叉树中第二小的节点
 * date：2020-09-24 15:07:43
 **/
public class P671SecondMinimumNodeInABinaryTree {
    public static void main(String[] args) {
        Solution solution = new P671SecondMinimumNodeInABinaryTree().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        private int secSmallVal = Integer.MAX_VALUE;
        private boolean isValid = false;
        private int rootVal = 0;
        public int findSecondMinimumValue(TreeNode root) {
            rootVal = root.val;
            helper(root);
            return isValid ? secSmallVal : -1;
        }

        private void helper(TreeNode node) {
            if (node == null) return;
            helper(node.left);
            if (node.val > rootVal && node.val <= secSmallVal) {
                secSmallVal = node.val;
                isValid = true;
            }
            helper(node.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
