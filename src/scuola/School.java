package scuola;

import albero.Node;
import albero.Tree;
import gestione.Group;
import gestione.Person;

@SuppressWarnings("rawtypes")
public class School extends Group{
	public School(String name, double maxWage, Tree employees) {
		super(name, maxWage, employees);
	}
	public void addEmployee(Comparable j) {persons.add((albero.Comparable) j);}
	public boolean searchEmployee(Comparable j) {return persons.search((albero.Comparable) j);}
	
	public double calcTotalWages() {return calcTotalWages(persons.getRoot());}
	private double calcTotalWages(Node node) {
		if(node == null) return 0;
		return ((Person)node.getKey()).calcWage() + calcTotalWages(node.getRight()) + calcTotalWages(node.getLeft());
	}
}
