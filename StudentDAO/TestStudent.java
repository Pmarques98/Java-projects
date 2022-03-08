package br.ime.usp.mac321.ex2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


public class TestStudent {
	StudentDAOImpl a = new StudentDAOImpl("listaInicial.txt");	
	                     										
	@Test
	public void teste1(){
		Student j = new Student("Lazaro",2); 
		a.updateStudent(j);
		assertEquals("Lazaro",a.students.get(2).getName());
	}
	@Test
	public void teste2(){
		Student j = new Student("Lazaro",2); 
		a.deleteStudent(j);
		assertEquals("d",a.students.get(2).getName());
	}
	

}
