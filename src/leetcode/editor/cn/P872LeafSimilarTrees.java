//请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。 
//
// 
//
// 举个例子，如上图所示，给定一颗叶值序列为 (6, 7, 4, 9, 8) 的树。 
//
// 如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。 
//
// 如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。 
//
// 
//
// 提示： 
//
// 
// 给定的两颗树可能会有 1 到 200 个结点。 
// 给定的两颗树上的值介于 0 到 200 之间。 
// 
// Related Topics 树 深度优先搜索 
// 👍 68 👎 0


package leetcode.editor.cn;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：叶子相似的树
 * date：2020-09-21 15:35:11
 **/
public class P872LeafSimilarTrees {
    public static void main(String[] args) {
        Solution solution = new P872LeafSimilarTrees().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        private List<Integer> serial1 = new ArrayList<>();
        private List<Integer> serial2 = new ArrayList<>();
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            inorder(root1, serial1);
            inorder(root2, serial2);
            int size1 = serial1.size();
            int size2 = serial2.size();
            if (size1 != size2) return false;
            for (int i = 0; i < size1; i++) {
                if (serial1.get(i) != serial2.get(i)) return false;
            }
            return true;
        }

        private void inorder(TreeNode node, List<Integer> serial) {
            if (node == null) return;
            inorder(node.left, serial);
            if (node.left == null && node.right == null) serial.add(node.val);
            inorder(node.right, serial);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
