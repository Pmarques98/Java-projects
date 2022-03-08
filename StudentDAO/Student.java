package br.ime.usp.mac321.ex2;

public class Student {
	private String name;
	private int rollNu;
	
	public Student(String name, int rollNu) {
		this.name = name; this.rollNu = rollNu;
	}
	public String getName() {
		return name;
	}
	public int getRoll() {
		return rollNu;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setName(int roll) {
		this.rollNu = roll;
	}
}


