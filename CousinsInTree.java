package io.test.TreeDS;

public class CousinsInTree {
	static int depthx = -1, depthy = -2;
	static Node parentx, parenty;

	public static void main(String[] args) {

		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.leftNode.leftNode = new Node(3);
		root.leftNode.rightNode = null;
		root.rightNode = new Node(4);
		System.out.println(isCousins(root, 2, 3));

	}

	private static void preOrder(Node root, int x, int y, int depth, Node parent) {
		if (root == null)
			return;
		if (root.data == x) {
			depthx = depth;
			parentx = parent;
		} else if (root.data == y) {
			depthy = depth;
			parenty = parent;
		} else {
			preOrder(root.leftNode, x, y, depth + 1, root);
			preOrder(root.rightNode, x, y, depth + 1, root);
		}
	}

	private static boolean isCousins(Node node, int x, int y) {
		preOrder(node, x, y, 0, null);
		return depthx == depthy && parentx != parenty;
	}

}
