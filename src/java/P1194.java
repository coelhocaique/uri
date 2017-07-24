package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Node {
	Node left, right;
	char data;

	public Node() {
		left = null;
		right = null;
		data = 0;
	}

	public Node(char n) {
		left = null;
		right = null;
		data = n;
	}
}

class BT {
	Node root;
	int preIndex = 0;
	String postorder = "";

	public BT() {
		root = null;
	}
	
	public Node buildTree(char inorder[], char preorder[], int inStart, int inEnd) {
		if (inStart > inEnd)
			return null;

		/*
		 * Pick current node from Preorder traversal using preIndex and
		 * increment preIndex
		 */
		Node node = new Node(preorder[preIndex++]);

		/* If this node has no children then return */
		if (inStart == inEnd)
			return node;

		/* Else find the index of this node in Inorder traversal */
		int inIndex = search(inorder, inStart, inEnd, node.data);

		/*
		 * Using index in Inorder traversal, construct left and right
		 * subtress
		 */
		node.left = buildTree(inorder, preorder, inStart, inIndex - 1);
		node.right = buildTree(inorder, preorder, inIndex + 1, inEnd);

		return node;
	}

	public void postorder() {
		 postorder(root);
	}

	private void postorder(Node r) {
		if (r != null) {
			postorder(r.left);
			postorder(r.right);
			postorder+= r.data;
		}
	}
	
	public int search(char arr[], int strt, int end, char value) {
		int i;
		for (i = strt; i <= end; i++) {
			if (arr[i] == value)
				return i;
		}
		return i;
	}
}

public class P1194 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(scan.readLine());
		while(count-- > 0){
			String[] split = scan.readLine().split(" ");
			char[] pre = split[1].toCharArray();
			char[] in = split[2].toCharArray();
			
			BT bt = new BT();
			bt.root = bt.buildTree(in, pre, 0, in.length - 1);
			bt.postorder();
			
			System.out.println(bt.postorder);
		}
	}
}