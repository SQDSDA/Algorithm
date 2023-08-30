package duilie.ercha;
// 可以直接从JAVA里引入queue去完成二叉树的层序遍历

import java.util.LinkedList;

import java.util.Queue;

public class cengxu_sys {
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
                ));

        breadthFirstTraversal(root);
    }

    public static void breadthFirstTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>(); // 使用 java.util.Queue
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " "); // 输出节点值

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }
}
