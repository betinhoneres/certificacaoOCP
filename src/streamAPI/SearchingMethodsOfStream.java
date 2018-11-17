package streamAPI;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import insumos.Person;

public class SearchingMethodsOfStream {

	Optional<String> finfFirst;
	Optional<String> finfAny;
	
	public static void main(String[] args) {
//		exampleOfFindFirstAndFindAny();
//		exampleOfAnyMatchAllMatchNoneMatch();
//		exemple1();
//		exemple2();
		exemple3();
	}

	private static void exemple3() {
		Stream<Integer> stream = Stream.of(0, 2);
		boolean result = stream.noneMatch(i -> i%2 == 0);
		System.out.println(result);
	}

	private static void exemple2() {
		Stream<String> stream = Stream.of();
		boolean result = stream.allMatch(s -> s.equals("Teste"));
		System.out.println(result);
	}

	private static void exemple1() {
		Stream<String> stream = Stream.of();
		//Optional<String> first = stream.findFirst();
		String second = stream.findFirst().get();
		System.out.println(second);
	}

	private static void exampleOfAnyMatchAllMatchNoneMatch() {
		Person dylan = new Person("Dylan", 30);
		Person sarah = new Person("Sarah", 20);
		
		Stream<Person> stream1 = Stream.of(dylan, sarah);
		Predicate<Person> predicate1 = p -> p.getAge() > 45;
		System.out.println(stream1.anyMatch(predicate1));
		
		Stream<Person> stream2 = Stream.of(dylan, sarah);
		Predicate<Person> predicate2 = p -> p.getAge() > 20;
		System.out.println(stream2.allMatch(predicate2));
		
		Stream<Person> stream3 = Stream.of(dylan, sarah);
		Predicate<Person> predicate3 = p -> p.getAge() >= 40;
		System.out.println(stream3.noneMatch(predicate3));
	}

	private static void exampleOfFindFirstAndFindAny() {
		Person dylan = new Person("Dylan", 30);
		Person sarah = new Person("Sarah", 20);
		
		Stream<Person> stream1 = Stream.of(dylan, sarah);
		System.out.println(stream1.findFirst().get().getName());
		
		Stream<Person> stream2 = Stream.of(dylan, sarah);
		System.out.println(stream2.findAny().get().getName());
	}
	
}