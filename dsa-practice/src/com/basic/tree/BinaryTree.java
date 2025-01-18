package com.basic.tree;

public class BinaryTree {

	class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;

		public TreeNode(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	TreeNode root;

	BinaryTree() {
		root = null;
	}

	public void insert(int value) {
		root = insertRec(root, value);
	}

	private TreeNode insertRec(TreeNode root, int value) {

		if (root == null) {
			root = new TreeNode(value);
			return root;
		}

		if (value < root.value) {
			root.left = insertRec(root.left, value);
		} else if (value > root.value) {
			root.right = insertRec(root.right, value);
		}

		return root;
	}

	public boolean search(int value) {
		return searchRec(root, value);
	}

	private boolean searchRec(TreeNode root, int value) {

		if (root == null) {
			return false;
		}

		if (root.value == value) {
			return true;
		}

		if (value > root.value) {
			return searchRec(root.right, value);
		}

		return searchRec(root.left, value);

	}

	public void preOrder() {
		preOrderRec(root);
	}

	private void preOrderRec(TreeNode root) {
		if (root != null) {
			System.out.print(root.value + " ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}

	public void inOrder() {
		inOrderRec(root);
	}

	private void inOrderRec(TreeNode root) {
		if (root != null) {
			inOrderRec(root.left);
			System.out.print(root.value + " ");
			inOrderRec(root.right);
		}
	}

	public void postOrder() {
		postOrderRec(root);
	}

	private void postOrderRec(TreeNode root) {
		if (root != null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.value + " ");

		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("Pre-Order Traversal :");
		tree.preOrder();

		System.out.println("\n -------------------------------------");

		System.out.println("In-Order Traversal :");
		tree.inOrder();

		System.out.println("\n -------------------------------------");

		System.out.println("Post-Order Traversal :");
		tree.postOrder();

		System.out.println();
		System.out.println(tree.search(50));

	}

}
