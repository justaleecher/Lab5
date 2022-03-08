package test;
/*   
 *  Name Block:
 *  Lab Number: Lab 4
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */
public class BSTNode {
	private BSTNode left, right;
	private Dollar data = null;

    // Don't need pre or post for constructors or destructors
	public BSTNode(Dollar c) {
		data = c;
		left = null;
		right = null;
	}

	/* The purpose of these methods is to get the values for the
	 * attributes of the BST. The left Child, right Child and Data Attribute
	 * Pre: No input
	 * Post: returns left child pointer,right child pointer,or data attribute
	*/
	
	public BSTNode getLeft() {
		return left;
	}
	
	public BSTNode getRight() {
		return right;
	}
	
	public Dollar getData() {
		return data;
	}

	/* The purpose of these methods is to set the values
	 * for the BST attributes. The left Child pointer, right Child pointer and Data Attribute
	 * Pre: new left pointer value,new right pointer value or data attribute
	 * Post: Sets input information Respectively 
	*/
	
	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public void setData(Dollar data) {
		this.data = data;
	}

}
