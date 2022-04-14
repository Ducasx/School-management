package gestione;

import albero.Tree;

public class Group {
	private String name;
	private double maxImport;
	protected Tree persons;
	
	public Group(String name, double maxImport, Tree persons) {
		super();
		this.name = name;
		this.maxImport = maxImport;
		this.persons = persons;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public double getMaxImport() {return maxImport;}
	public void setMaxImport(double maxImport) {this.maxImport = maxImport;}
	public Tree getPersons() {return persons;}
	public void setPersons(Tree persons) {this.persons = persons;}
	
	public String toString() {return name+" "+maxImport+"\n"+persons;}
}
