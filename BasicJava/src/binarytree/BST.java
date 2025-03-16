package binarytree;

public class BST {

	private BinaryTreeNode<Integer> root;
	private int size;
	
	private static boolean isPresentHelper(BinaryTreeNode<Integer> node,int x) {
		if(node==null) {
			return false;
		}
		if(node.data==x) {
			return true;
		}
		if(x<node.data) {
			 return isPresentHelper(node.left,x);
		}
		else {
			return isPresentHelper(node.right,x);
		}
	}
	
	public boolean isPresent(int x) {
		return isPresentHelper(root,x); 
		
	}
	public void insert(int x) {
		
	}
	public boolean deleteData(int x) {
		return false;
	}
	public int size() {
		return size;
	}
	private static void printTreeHelper(BinaryTreeNode<Integer> node) {
		if (node == null) {
			return;
		}
		String toBePrinted = node.data + "";
		if (node.left != null) {
			toBePrinted += " L:" + node.left.data;
		}
		if (node.right != null) {
			toBePrinted += " R:" +node.right.data;
		}
		System.out.println();
		printTreeHelper(node.left);
		printTreeHelper(node.right);
	}
	}
	public void printTree() {
		printTreeHelper(root);	
	}
}
