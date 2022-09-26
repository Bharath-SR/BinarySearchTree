/**
 * 
 */
package com.bridgeLabz;

/**
 * @author Admin
 *
 */
public class BST {

	/**
	 * Started BST
	 */
	
	static class Node {    
	    int value; //data stored as type int
	        Node left, right; //reference to left and right pointer
			public String key;
	          
	        Node(int value){ //constructor
	            this.value = value; 
	            // store null value for left and right child
	            left = null; 
	            right = null; 
	        }
	}
	// class to create nodes
	class Node1 {
	  int key;
	  Node left, right;

	  public void Node(int item) {
	  key = item;
	  left = right = null;
	  }
	}

	//class for binary tree
	class BinaryTree {
	  Node root;

	  // Traverse tree
	  public void traverseTree(Node node) {
	    if (node != null) {
	      traverseTree(node.left);
	      System.out.print(" " + node.key);
	      traverseTree(node.right);
	    }
	  }

	
	}
	


}
