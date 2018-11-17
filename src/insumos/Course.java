package insumos;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String name;
	private List<Student> students = new ArrayList<>();
	
	public Course(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void addStudents(Student student) {
		this.students.add(student);
	}
	
	public List<Student> getStudents(){
		return this.students;
	}
}