package br.ime.usp.mac321.ex2;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class StudentDAOImpl implements StudentDAO {
	List<Student> students;

	public StudentDAOImpl(String file) {
		students = new ArrayList<Student>();
		Student studant[] = new Student[100]; /** vetor de estudantes para inicializar a lista **/
		BufferedReader br;
		try {
			int regula = 0;                   /** regula decide se é name ou roll dependendo de impar e par **/
			String name = null;
			String roll = null;
			int i = 0;
			br = new BufferedReader(new FileReader(file));
			String line = null;
			do {
				line = br.readLine();
				if (line != null) {
					if(regula % 2 == 0) {
						name = line;
						regula++;
					}
					else {
						roll = line;
						regula++;
						studant[i] = new Student(name,Integer.parseInt(roll)); /** cria o estudante no vetor e add na lista **/
						students.add(studant[i]);
						System.out.println(name +" adicionado");
					}
				}
			} while(line != null);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNu) {
		return students.get(rollNu);
	}

	
	@Override
	public void updateStudent(Student student) {   /**update e delete sobreescrevem o arquivo lista.txt com a List **/
		students.get(student.getRoll()).setName(student.getName());
		try {
			PrintWriter writer = new PrintWriter("lista.txt", "UTF-8");
			for(int i = 0; i < students.size(); i++) {
				writer.println(students.get(i).getName());
				writer.println(students.get(i).getRoll());
	        }
			writer.close();
		}
		catch(FileNotFoundException | UnsupportedEncodingException e) {
			System.out.println(e);
		}
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRoll());
		try {
			PrintWriter writer = new PrintWriter("lista.txt", "UTF-8");
			for(int i = 0; i < students.size(); i++) {
				writer.println(students.get(i).getName());
				writer.println(students.get(i).getRoll());
	        }
			writer.close();
		}
		catch(FileNotFoundException | UnsupportedEncodingException e) {
			System.out.println(e);
		}
		System.out.print(student.getName()+" Removido");
	}
}
