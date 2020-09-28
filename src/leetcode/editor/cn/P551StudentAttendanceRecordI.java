//给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符： 
//
// 
// 'A' : Absent，缺勤 
// 'L' : Late，迟到 
// 'P' : Present，到场 
// 
//
// 如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。 
//
// 你需要根据这个学生的出勤记录判断他是否会被奖赏。 
//
// 示例 1: 
//
// 输入: "PPALLP"
//输出: True
// 
//
// 示例 2: 
//
// 输入: "PPALLL"
//输出: False
// 
// Related Topics 字符串 
// 👍 52 👎 0


package leetcode.editor.cn;

/**
 * Java：学生出勤记录 I
 * date：2020-09-28 14:12:59
 **/
public class P551StudentAttendanceRecordI {
    public static void main(String[] args) {
        Solution solution = new P551StudentAttendanceRecordI().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkRecord(String s) {
            int aCount = 0;
            int lCount = 0;
            int len = s.length();
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                if (c == 'P') lCount = 0;
                else if (c == 'A') {
                    aCount++;
                    lCount = 0;
                    if (aCount == 2) return false;
                } else {
                    lCount++;
                    if (lCount == 3) return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}