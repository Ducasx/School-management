package scuola;

import albero.*;
import albero.Comparable;
import gestione.Group;
import gestione.Person;

public class School extends Group{
	public School(String name, double maxWage, Tree employees) {
		super(name, maxWage, employees);
	}
	public void addEmployee(Comparable j) {
		getPersons().add(j);
	}
	public boolean searchEmployee(Comparable j) {
		return persons.search((albero.Comparable) j);
	}
	
	public double calcTotalWages() {
		return calcTotalWages(persons.getRoot());
	}
	private double calcTotalWages(Node node) {
		if(node == null) return 0;
		return ((Person)node.getKey()).calcWage() + calcTotalWages(node.getRight()) + calcTotalWages(node.getLeft());
	}
}
