package binarytree;

public class BinarySearchTree {
    
    private BinaryTreeNode<Integer> root;
    
    public void insertData(int data) {
        root = insertDataHelper(root, data);
    }
    
    private BinaryTreeNode<Integer> insertDataHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return new BinaryTreeNode<>(data);
        }
        if (data < root.data) {
            root.left = insertDataHelper(root.left, data);
        } else if (data > root.data) {
            root.right = insertDataHelper(root.right, data);
        }
        return root;
    }
    
    public void deleteData(int data) {
        root = deleteDataHelper(root, data);
    }
    
    private BinaryTreeNode<Integer> deleteDataHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = deleteDataHelper(root.left, data);
        } else if (data > root.data) {
            root.right = deleteDataHelper(root.right, data);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = findMin(root.right);
            // Delete the inorder successor
            root.right = deleteDataHelper(root.right, root.data);
        }
        return root;
    }
    
    private int findMin(BinaryTreeNode<Integer> root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    
    public boolean hasData(int data) {
        return hasDataHelper(data, root);
    }
    
    private boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        } else if (data > root.data) {
            return hasDataHelper(data, root.right);
        } else {
            return hasDataHelper(data, root.left);
        }
    }
    
    public void printTree() {
        printTreeHelper(root);
    }
    
    private void printTreeHelper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        String output = root.data + ":";
        if (root.left != null) {
            output += " L:" + root.left.data;
        }
        if (root.right != null) {
            output += " R:" + root.right.data;
        }
        System.out.println(output);
        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }
    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertData(10);
        bst.insertData(20);
        bst.insertData(5);
        bst.insertData(15);
        bst.insertData(3);
        bst.insertData(7);
        
        System.out.println("Binary Search Tree:");
        bst.printTree();
        bst.deleteData(10);
        bst.printTree();
    }
}
