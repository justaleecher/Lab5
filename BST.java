
public class BST {
	private BSTNode root;

	public BST() {
		root = null;
	}

	public BST(BSTNode root) {
		this.root = root;
	}

	public void add(Dollar value) {
		BSTNode entry = new BSTNode(value);
		if (root == null) {
			root = entry;
		} else {
			BSTNode currentNode = root;
			while (currentNode != null && currentNode.getData() != null) {
				if (!Currency.isGreater(entry.getData(), currentNode.getData())
						&& !Currency.isEqual(entry.getData(), currentNode.getData())) {
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

	public void printPostorder() {
		printPostorder(root);
	}

	public void printInorder() {
		printInorder(root);
	}

	public void printPreorder() {
		printPreorder(root);
	}

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

	/* Given a binary tree, print its nodes in inorder */
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

	/* Given a binary tree, print its nodes in preorder */
	private void printPreorder(BSTNode node) {
		if (node == null)
			return;

		node.getData().print();

		printPreorder(node.getLeft());

		/* now recur on right subtree */
		printPreorder(node.getRight());
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int count() {
		return count(root);
	}

	private int count(BSTNode node) {
		if (node == null)
			return 0;
		return 1 + count(node.getLeft()) + count(node.getRight());

	}

	public BSTNode search(Dollar key) {
		BSTNode cur = root;
		while (cur != null) {
			if (Currency.isEqual(cur.getData(), key)) {
				return cur;
			} else if (!Currency.isGreater(key, cur.getData())) {
				cur = cur.getLeft();
			} else {
				cur = cur.getRight();
			}
		}
		return null;// Not found
	}

	public void remove(Dollar key) {
		BSTNode par = null;
		BSTNode cur = root;
		while (cur != null) { // Search for node
			if (Currency.isEqual(cur.getData(), key)) { // Node found
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
				return; // Node found and removed
			} else if (!Currency.isGreater(cur.getData(), key) && !Currency.isEqual(cur.getData(), key)) { // Search
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
		return; // Node not found
	}
}
