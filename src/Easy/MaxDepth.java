package Easy;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        } else {
            int i = maxDepth(root.left);
            int j = maxDepth(root.right);
            return (i < j) ? j + 1 : i + 1;
        }
    }
}
