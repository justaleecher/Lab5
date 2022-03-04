
public class BSTNode {
	private BSTNode left, right;
	private Dollar data = null;

	public BSTNode(Dollar c) {
		data = c;
		left = null;
		right = null;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public Dollar getData() {
		return data;
	}

	public void setData(Dollar data) {
		this.data = data;
	}

}
