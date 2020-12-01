//给出一个完全二叉树，求出该树的节点个数。 
//
// 说明： 
//
// 完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为
//第 h 层，则该层包含 1~ 2h 个节点。 
//
// 示例: 
//
// 输入: 
//    1
//   / \
//  2   3
// / \  /
//4  5 6
//
//输出: 6 
// Related Topics 树 二分查找 
// 👍 303 👎 0


package leetcode.editor.cn;

/**
 * Java：完全二叉树的节点个数
 * date：2020-11-24 09:39:42
 **/
public class P222CountCompleteTreeNodes {
    public static void main(String[] args) {
        Solution solution = new P222CountCompleteTreeNodes().new Solution();
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
        int count = 0;
        public int countNodes(TreeNode root) {
            helper(root);
            return count;
        }

        private void helper(TreeNode node) {
            if (node == null) return;
            count++;
            helper(node.left);
            helper(node.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
