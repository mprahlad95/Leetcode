package Easy;

public class MaxDepth {
	public static int maxDepth(TreeNode root) {
        if (null == root)
            return 0;
        System.out.println(root.val);
        int i = maxDepth(root.left);
        System.out.println(root.val);
        int j = maxDepth(root.right);
        System.out.println(root.val);
        return (i < j) ? j + 1 : i + 1;
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(-5);
		root.right.right = new TreeNode(5);
		root.right.left = new TreeNode(24);
		System.out.println(maxDepth(root));
	}

}
