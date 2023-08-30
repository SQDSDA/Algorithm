package duilie.ercha;

import com.sun.source.tree.Tree;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    // 这里之所以要用两个TreeNode是因为这两个方法是重写的，两个方法一起，才能完成二叉树的构建
    public TreeNode(int val) {this.val = val;}

    public TreeNode(TreeNode left, int val, TreeNode right) {
        this.left = left;
        this.val = val;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}
