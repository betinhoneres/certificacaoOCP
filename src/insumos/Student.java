package insumos;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private int mark;
	
	private List<Double> marks = new ArrayList<>();
	
	public Student(String name){
		this.name = name;
	}
	
	public Student(String name, int mark){
		this.name = name;
		this.mark = mark;
	}
	
	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}
	
	public void addtMark(double mark) {
		this.marks.add(mark);
	}
	
	public List<Double> getMarks(){
		return marks;
	}

}