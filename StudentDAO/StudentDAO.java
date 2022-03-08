package br.ime.usp.mac321.ex2;

import java.util.List;

public interface StudentDAO {
	public List<Student> getAllStudents();
	public Student getStudent(int rollNu);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
