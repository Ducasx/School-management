package albero;

public class Node {
	private Comparable key;
	private Node left;
	private Node right;
	
	public Node(Comparable key, Node left, Node right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}
	public Comparable getKey() {return key;}
	public void setKey(Comparable key) {this.key = key;}
	public Node getLeft() {return left;}
	public void setLeft(Node left) {this.left = left;}
	public Node getRight() {return right;}
	public void setRight(Node right) {this.right = right;}
}
