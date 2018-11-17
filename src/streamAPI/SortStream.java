package streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.omg.CORBA.PERSIST_STORE;

import insumos.Person;
import insumos.Person.Gender;

public class SortStream {

	public static void main(String[] args) {
//		sortNaturalOrder();
//		sortComparator();
//		sortQuestion2();
//		sortQuestion3();
	}

	public static void sortQuestion3() {
		Collection<Person> collection = Arrays.asList(new Person("Eva"), new Person("Adam"));
		Stream<Person> stream = collection.stream().sorted((p1,p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
		stream.forEachOrdered(p -> System.out.println(p.getName()));
	}

	public static void sortQuestion2() {
		//Collection<Person> collection = Arrays.asList(new Person("Adam"), new Person("Eva"));
		Collection<Person> collection = Arrays.asList(new Person("Eva"), new Person("Adam"));
		Stream<Person> stream = collection.stream().sorted();
		stream.forEach(System.out::println);
	}

	public static void sortComparator() {
		Collection<String> collection = Arrays.asList("B", "C", "A");
		Stream<String> stream = collection.stream().sorted((s1,s2) -> s2.compareTo(s1));
		Optional<String> result = stream.reduce(String::concat);
		System.out.println(result);
//		stream.forEachOrdered(System.out::println);
//		stream.forEach(System.out::println);
	}

	public static void sortNaturalOrder() {
		Collection<Integer> collection = Arrays.asList(2,3,1);
		Stream<Integer> stream = collection.stream().sorted();
		stream.forEachOrdered(System.out::println);
		//stream.forEach(System.out::println);
	}
	
}