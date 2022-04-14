package scuola;

import gestione.Person;

public class Teacher extends Person implements albero.Comparable{
	private String degree;
	private double baseWage;
	private double coursesMoney;
	
	public Teacher(int code, String surname, String degree, double baseWage, double coursesMoney) {
		super(code,surname);
		this.degree = degree;
		this.baseWage = baseWage;
		this.coursesMoney = coursesMoney;
	}

	public String getDegree() {return degree;}
	public void setDegree(String degree) {this.degree = degree;}
	public double getBaseWage() {return baseWage;}
	public void setBaseWage(double baseWage) {this.baseWage = baseWage;}
	public double getCoursesMoney() {return coursesMoney;}
	public void setCoursesMoney(double coursesMoney) {this.coursesMoney = coursesMoney;}
	
	public double calcWage() {return baseWage + coursesMoney;}

}
