package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Preorder traversal (root, left subtree, right subtree) 
 * Inorder traversal (left subtree, root, right subtree).
 * Postorder traversal (left subtree, right subtree, root)
 * @author ccoelho
 *
 */

public class P1191 {
	
	
	public static void main(String[] args) throws IOException {
		P1191 p1191 = new P1191();
		BT bt = p1191.new BT();
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		String[] split = scan.readLine().split(" ");
		
		String preord = split[0];
		String inord = split[1];
		
		
		

	}
	
	/* Class BTNode */
	class Node {
		Node left, right;
		char data;

		/* Constructor */
		public Node() {
			left = null;
			right = null;
			data = 0;
		}

		/* Constructor */
		public Node(char n) {
			left = null;
			right = null;
			data = n;
		}

		/* Function to set left node */
		public void setLeft(Node n) {
			left = n;
		}

		/* Function to set right node */
		public void setRight(Node n) {
			right = n;
		}

		/* Function to get left node */
		public Node getLeft() {
			return left;
		}

		/* Function to get right node */
		public Node getRight() {
			return right;
		}

		/* Function to set data to node */
		public void setData(char d) {
			data = d;
		}

		/* Function to get data from node */
		public char getData() {
			return data;
		}
	}

	/* Class BT */
	class BT {
		private Node root;

		/* Constructor */
		public BT() {
			root = null;
		}

		/* Function to check if tree is empty */
		public boolean isEmpty() {
			return root == null;
		}

		/* Functions to insert data */
		public void insert(char data) {
			root = insert(root, data);
		}

		/* Function to insert data recursively */
		private Node insert(Node node, char data) {
			if (node == null)
				node = new Node(data);
			else {
				if (node.getRight() == null)
					node.right = insert(node.right, data);
				else
					node.left = insert(node.left, data);
			}
			return node;
		}

		/* Function to count number of nodes */
		public int countNodes() {
			return countNodes(root);
		}

		/* Function to count number of nodes recursively */
		private int countNodes(Node r) {
			if (r == null)
				return 0;
			else {
				int l = 1;
				l += countNodes(r.getLeft());
				l += countNodes(r.getRight());
				return l;
			}
		}

		/* Function to search for an element */
		public boolean search(int val) {
			return search(root, val);
		}

		/* Function to search for an element recursively */
		private boolean search(Node r, int val) {
			if (r.getData() == val)
				return true;
			if (r.getLeft() != null)
				if (search(r.getLeft(), val))
					return true;
			if (r.getRight() != null)
				if (search(r.getRight(), val))
					return true;
			return false;
		}

		/* Function for inorder traversal */
		public void inorder() {
			inorder(root);
		}

		private void inorder(Node r) {
			if (r != null) {
				inorder(r.getLeft());
				System.out.print(r.getData() + " ");
				inorder(r.getRight());
			}
		}

		/* Function for preorder traversal */
		public void preorder() {
			preorder(root);
		}

		private void preorder(Node r) {
			if (r != null) {
				System.out.print(r.getData() + " ");
				preorder(r.getLeft());
				preorder(r.getRight());
			}
		}

		/* Function for postorder traversal */
		public void postorder() {
			postorder(root);
		}

		private void postorder(Node r) {
			if (r != null) {
				postorder(r.getLeft());
				postorder(r.getRight());
				System.out.print(r.getData() + " ");
			}
		}
	}

}
