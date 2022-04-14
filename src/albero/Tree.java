package albero;

public class Tree {
	private Node root;
	
	public Tree(Node root) {
		this.root = root;
	}
	
	public Node getRoot() {return root;}
	public void setRoot(Node root) {this.root = root;}
	
	public void add(Comparable j) {add(j, root);}
	private void add(Comparable j, Node node) {
		if(root == null) root = new Node(j,null,null);
		if(node.getKey() == j) return;
		if(j.getValue() > node.getKey().getValue()) {
			if(node.getRight() != null)
				add(j,node.getRight());
			node.setRight(new Node(j,null,null));
		} else {
			if(node.getLeft() != null)
				add(j,node.getLeft());
			node.setLeft(new Node(j,null,null));
		}
	}
	
	public boolean search(Comparable j) {return search(j,root);}
	private boolean search(Comparable j, Node node) {
		if(node == null) return false;
		if(node.getKey().getValue() == j.getValue()) return true;
		if(j.getValue() > node.getKey().getValue())
			return search(j,node.getRight());
		else
			return search(j,node.getLeft());
	}
	
	public String toString() {return toString(root);}
	private String toString(Node node) {
		return toString(node.getLeft()) +"|"+ node+"|"+ toString(node.getRight());
	}
}
