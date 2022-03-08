package test;
/*   
 *  Name Block:
 *  Lab Number: Lab 4
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of Binary Search Trees
 *  and to design a program that takes in user input, allows the user to traverse the tree and
 *  to respectably write a file with the given information requested by the user.
 */
public class BST {
	private BSTNode root;

    // Don't need pre or post for constructors or destructors
	public BST() {
		root = null;
	}
    
	/* Pre: root - BSTNode Object
	 * Post: sets BST value
	*/
	
	public BST(BSTNode root) {
		this.root = root;
	}
	
	/*
	 * Algorithm add(Dollar value)
	 * 
	 * The purpose of this method is to add a dollar value to the Binary tree
	 * Pre: Dollar value - dollar object
	 * Post: sets new node of tree in the right place where null or empty
	 * 
	 * if root equals null
	 *     root equals entry
	 * else 
	 * 	   BSTNode currenct node equals root
	 *     while current node is not null and currentNodes dats is not null
	 *        if entry data is greater than current node data and entry data equals current node data
	 *     		 if left node is null
	 *     			set left node to entry node
	 *     			set current node to null
	 *           else
	 *              current node equals current node left node
	 *           end if
	 *        else 
	 *         	 if right of current node is empty 
	 *              set right node to the entered node
	 *              current node becomes null
	 *           else
	 *           	current node equals current right node
	 *           end if
	 *        end if 
	 *      end while
	 * end if
	 */
	
	public void add(Dollar value) {
		BSTNode entry = new BSTNode(value);
		if (root == null) {
			root = entry;
		} else {
			BSTNode currentNode = root;
			while (currentNode != null && currentNode.getData() != null) {
				if (!entry.getData().isGreater(currentNode.getData())
						&& !entry.getData().isEqual(currentNode.getData())) {
					if (currentNode.getLeft() == null) {
						currentNode.setLeft(entry);
						currentNode = null;
					} else {
						currentNode = currentNode.getLeft();
					}
				} else {
					if (currentNode.getRight() == null) {
						currentNode.setRight(entry);
						currentNode = null;
					} else {
						currentNode = currentNode.getRight();
					}
				}
			}
		}
	}
    
	/* 
	 * Pre: no input
	 * Post: prints tree in post order
	*/
	
	public void printPostorder() {
		printPostorder(root);
	}

	/*
	 * Pre: no input
	 * Post: prints tree in order
	 */
	
	public void printInorder() {
		printInorder(root);
	}

	/*
	 * Pre: no input
	 * Post: prints tree in pre order
	 */
	
	public void printPreorder() {
		printPreorder(root);
	}

	/*
	 * Pre: input BSTNode node - BSTNode node object
	 * Post: prints tree in post order 
	 */
	
	private void printPostorder(BSTNode node) {
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(node.getLeft());

		// then recur on right subtree
		printPostorder(node.getRight());

		// now deal with the node
		node.getData().print();
	}

	/* 
	 * Given a binary tree, print its nodes in order 
	 * Pre: input BSTNode node - BSTNode node object
	 * Post: prints tree in order
	 */
	
	private void printInorder(BSTNode node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.getLeft());

		/* then print the data of node */
		node.getData().print();

		/* now recur on right child */
		printInorder(node.getRight());
	}

	/* 
	 * Given a binary tree, print its nodes in pre order
	 * Pre: input BSTNode node - BSTNode node object
	 * Post: prints tree in pre order
	 */
	
	private void printPreorder(BSTNode node) {
		if (node == null)
			return;

		node.getData().print();

		printPreorder(node.getLeft());

		/* now recur on right subtree */
		printPreorder(node.getRight());
	}

	/*
	 * Pre: no input
	 * Post: returns the root null
	 */
	
	public boolean isEmpty() {
		return root == null;
	}

	/*
	 * count attribute/method constructor
	 * Pre: no input
	 * Post: sets count node to root
	 */
	
	public int count() {
		return count(root);
	}

	/*
	 * count attribute/method constructor
	 * Pre:  bstnode node - node object of BST
	 * Post: return 0 or 1 + left and right node
	 */
	
	private int count(BSTNode node) {
		if (node == null)
			return 0;
		return 1 + count(node.getLeft()) + count(node.getRight());

	}
	
	/*
	 * Algorithm BSTNode search (dollar key)
	 * 
	 * Purpose: The purpose of this method is to search the tree with a dollar key and find where the matching key is
	 * Pre:  key - dollar object key
	 * Post: returns curr node with the key or null
	 * 
	 * public BSTNode search(dollar key)
	 * 		 BSTNode cur equals root
	 *   while current is not null
	 * 		 if cur data equals key data
	 * 			return cur node
	 *       else if cur data isnt greater than key
	 *       	cur node = cur left node
	 *       else
	 *       	cur node = cur right node
	 *       end if
	 *   end while
	 *  	 return null
	 */

	public BSTNode search(Dollar key) {
		BSTNode cur = root;
		while (cur != null) {
			if (cur.getData().isEqual(key)) {
				return cur;
			} else if (!cur.getData().isGreater(key)) {
				cur = cur.getLeft();
			} else {
				cur = cur.getRight();
			}
		}
		return null;// Not found
	}
	
	/*
	 * Algorithm remove(Dollar key)
	 * 
	 * Purpose: The purpose of this Algorithm is to remove a node in the tree based on the desired key
	 * Pre:  key = some node of dollar object
	 * Post: returns found and removed or nothing found
	 * 
	 * public void remove (dollar key)
	 * 
	 * 
	 */
	
	public void remove(Dollar key) {
		BSTNode par = null;
		BSTNode cur = root;
		while (cur != null) { // Search for node
			if (cur.getData().isEqual(key)) { // Node found
				if (cur.getLeft() == null && cur.getRight() == null) { // Remove leaf
					if (par == null) { // Node is root
						root = null;
					} else if (par.getLeft() == cur) {
						par.setLeft(null);
					} else
						// par->right = null
						par.setRight(null);
				} else if (cur.getRight() == null) { // Remove node with only left child
					if (par == null) // Node is root
						root = cur.getLeft();
					else if (par.getLeft() == cur)
						par.setLeft(cur.getLeft());
					else
						par.setLeft(cur.getLeft());
				} else if (cur.getLeft() == null) { // Remove node with only right child
					if (par == null) // Node is root
						root = cur.getRight();
					else if (par.getLeft() == cur)
						par.setLeft(cur.getRight());
					else
						par.setRight(cur.getRight());
				} else { // Remove node with two children
					// Find successor (leftmost child of right subtree)
					BSTNode suc = cur.getRight();
					while (suc.getLeft() != null)
						suc = suc.getLeft();
					Dollar successorData = suc.getData();
					remove(suc.getData()); // Remove successor
					cur.setData(successorData);
				}
				System.out.print("Found and Removed");
				return; // Node found and removed
			} else if (!cur.getData().isGreater(key) && !cur.getData().isEqual(key)) { // Search
				// right
				par = cur;
				
//				par.setData(cur.getData());
//				par.setRight(cur.getRight());
//				par.setLeft(cur.getLeft());
				cur=cur.getRight();
//				cur.setData(cur.getRight().getData());
//				cur.setRight(cur.getRight().getRight());
//				cur.setLeft(cur.getRight().getLeft());
			} else { // Search left
				par = cur;
//				par.setData(cur.getData());
//				par.setRight(cur.getRight());
//				par.setLeft(cur.getLeft());
				cur=cur.getLeft();
				//cur.setData(cur.getLeft().getData());
				//cur.setRight(cur.getLeft().getRight());
				//cur.setLeft(cur.getLeft().getLeft());
			}
		}
		System.out.print("Not Found");
		return; // Node not found
	}
	public void printLevelorder(){
       int h = getHeight(root);
       int i;
       for (i = 1; i <= h; i++)
            printLevel(root, i);
    }


    public int getHeight(BSTNode cur)
    {
        if (cur == null)
            return 0;
        else {

            int lh = getHeight(cur.getLeft());
            int rh = getHeight(cur.getRight());


            if (lh > rh)
                return (lh + 1);
            else
                return (rh + 1);
        }
    }


    public void printLevel(BSTNode cur, int level)
    {
        if (cur == null)
            return;
        if (level == 1)
            cur.getData().print();
        else if (level > 1) {
            printLevel(cur.getLeft(), level - 1);
            printLevel(cur.getRight(), level - 1);
        }
    } 
}
