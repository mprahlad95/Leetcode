package Medium;

public class PopulatingNextPointers {
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		TreeLinkNode nextLeftmost = null;

		while (root.left != null) {
			nextLeftmost = root.left;
			while (root != null) {
				root.left.next = root.right;
				root.right.next = root.next == null ? null : root.next.left;
				root = root.next;
			}
			root = nextLeftmost;
		}
	}
}
