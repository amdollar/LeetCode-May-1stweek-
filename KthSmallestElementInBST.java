package io.test.Problems;

import io.test.TreeDS.Node;

public class KthSmallestElementInBST {
	private static int result, count = 0;

	public static void main(String[] args) { // [3]
		Node treeNode = new Node(3); // [1] [4]
		treeNode.rightNode = new Node(4);// [null] [2]
		treeNode.leftNode = new Node(1);
		treeNode.leftNode.leftNode = new Node(null);
		treeNode.leftNode.rightNode = new Node(2);
		int k = 1;
		kthSmallest(treeNode, k);
		System.out.println("\n" + result);
	}

	public static int kthSmallest(Node root, int k) {

		if (root == null) {
			return 0;
		}

		kthSmallest(root.leftNode, k);
		count++;

		if (count == k) {
			result = root.data;
		}
		kthSmallest(root.rightNode, k);
		return result;
	}

}
