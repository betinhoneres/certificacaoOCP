package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import insumos.Course;
import insumos.State;
import insumos.Student;

public class FlatMapMethod {

	public static void main(String[] args) {
//		exemplo1();
//		questao1();
		questao2();
	}

	public static void questao2() {
		Student alex = new Student("Alex");
		alex.addtMark(80);
		
		Stream<Double> markStream = alex.getMarks().stream();
		Stream.of(alex).flatMapToDouble(s -> markStream.mapToDouble(Double::doubleValue))
		.forEach(System.out::println);
		markStream.forEach(System.out::println);
	}

	public static void questao1() {
		State california = new State("California");
		State texas = new State("Texas", "Houston", "Dallas");
		
		Stream<State> states = Stream.of(california, texas);
		states.flatMap(s -> s.getCities().stream()).forEach(System.out::println);
	}

	public static void exemplo1() {
		Student henry = new Student("Henry", 90);
		Student bella = new Student("Bella", 80);
		Student dylan = new Student("Dylan", 70);
		Student riley = new Student("Riley", 85);
		
		Course ocajp = new Course("OCAJP");
		Course ocpjp = new Course("OCPJP");
		
		ocajp.addStudents(bella);
		ocajp.addStudents(dylan);
		
		ocpjp.addStudents(henry);
		ocpjp.addStudents(riley);
		
		List<Course> course = Arrays.asList(ocajp, ocpjp);
		
		Stream<Student> students = course.stream().flatMap(c -> c.getStudents().stream());
		
		students.forEach(s -> System.out.println(s.getName()));
		
		IntStream marks = course.stream().flatMapToInt(c -> c.getStudents().stream().mapToInt(Student::getMark)); 
		
		marks.forEach(System.out::println);
	}
	
}