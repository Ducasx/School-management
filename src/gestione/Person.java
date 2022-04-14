package gestione;

abstract public class Person{
	public int code;
	public String surname;
	
	public Person(int code, String surname) {
		this.code = code;
		this.surname = surname;
	}
	
	public int getCode() {return code;}
	public void setCode(int code) {this.code = code;}
	public String getSurname() {return surname;}
	public void setSurname(String surname) {this.surname =surname;}
	
	public String toString() {
		return code + " | " + surname;
	}
	abstract public double calcWage();
	public int getValue() {return getCode();}
}