package main;

import scuola.School;
import scuola.Teacher;

public class Prova {
	public static void main(String args[]){
		School s1 = new School("Vito Volterra",1700,null);
		Teacher t1 = new Teacher(1234,"Cicogna","Sistemismo",1800,1);
		s1.addEmployee(t1);
	}
}
