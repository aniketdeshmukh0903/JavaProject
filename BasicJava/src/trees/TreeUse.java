package trees;

import java.util.Scanner;

public class TreeUse {
    public static TreeNode<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter next node data");
        int n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter number of children for " + n);
        int childCount = s.nextInt();
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s += root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }
    
    public static int countLeafNodes(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        
        if (root.children.size() == 0) {
            return 1; // This is a leaf node
        }
        
        int leafCount = 0;
        for (TreeNode<Integer> child : root.children) {
            leafCount += countLeafNodes(child);
        }
        
        return leafCount;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        print(root);
        
        int leafNodeCount = countLeafNodes(root);
        System.out.println("Number of leaf nodes: " + leafNodeCount);
    }
}
