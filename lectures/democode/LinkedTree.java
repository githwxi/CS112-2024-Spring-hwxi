import java.util.*;

public class LinkedTree {

    private class Node {
	private int key;
	// private LLList data;
	private Node left;
	private Node right;
    }
    
    private Node root;

    public void inorderPrint() {
	if (root != null) {
	    inorderPrintTree(root);
	}
	System.out.println();
    }

    public void preorderPrint() {
	if (root != null) {
	    preorderPrintTree(root);
	}
	System.out.println();
    }

    public void postorderPrint() {
	if (root != null) {
	    postorderPrintTree(root);
	}
	System.out.println();
    }
    
    private static void inorderPrintTree(Node root) {
	if (root != null) {
	    inorderPrintTree(root.left);
	    System.out.print(root.key + " ");
	    inorderPrintTree(root.right);
	}	
    }

    private static void preorderPrintTree(Node root) {
	if (root != null) {
	    System.out.print(root.key + " ");	
	    preorderPrintTree(root.left);
	    preorderPrintTree(root.right);
	}
    }

    private static void postorderPrintTree(Node root) {
	if (root != null) {
	    postorderPrintTree(root.left);
	    postorderPrintTree(root.right);
	    System.out.print(root.key + " ");
	}
    }

    public static void main(String[] argv) {
	System.out.println("main: argv = " + Arrays.toString(argv));
    }
}
