package duilie.ercha;
import java.util.List;
import duilie.LinkedListQueue;
import java.util.ArrayList;
public class cengxu {
    // 问题：对二叉树进行层序遍历
    // 要一层一层的完成遍历
//    public List<List<Integer>> levelOrder(TreeNode root){
//
//    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        LinkedListQueue<TreeNode> queue = new LinkedListQueue<>();
        queue.offer(root);
        int c1 = 1; // 当前层节点数
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>(); // 保存每一层结果
            int c2 = 0; // 下一层节点数
            for (int i = 0; i < c1; i++) {
                TreeNode n = queue.poll();
                level.add(n.val);
                if (n.left != null) {
                    queue.offer(n.left);
                    c2++;
                }
                if (n.right != null) {
                    queue.offer(n.right);
                    c2++;
                }
            }
            result.add(level);
            c1 = c2;
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(new TreeNode(
                new TreeNode(4),
                2,
                new TreeNode(5)
        ),
                1,
        new TreeNode(
                new TreeNode(6),
                3,
                new TreeNode(7)
                )
        );
        List<List<Integer>> lists = new cengxu().levelOrder(root);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
        LinkedListQueue<TreeNode> queue = new LinkedListQueue<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            System.out.println(n);
            if (n.left != null) {
                queue.offer(n.left);
            }
            if (n.right != null) {
                queue.offer(n.right);
            }
        }

    }
}
