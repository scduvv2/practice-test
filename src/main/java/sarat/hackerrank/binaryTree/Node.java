package sarat.hackerrank.binaryTree;

public class Node {

	private Node left, right;

	private int data;

	public Node(int data) {
		this.data = data;
	}

	public void insert(int value) {
		if (value <= data) {
			if (left == null) {
				left = new Node(value);

			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new Node(value);

			} else {
				right.insert(value);
			}
		}
	}

	public boolean contains(int value) {

		if (data == value) {
			return true;
		} else if (value < data) {
			if (left == null) {
				return false;
			} else {
				return left.contains(value);
			}
		} else {
			if (right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		}
	}
	
	
}
