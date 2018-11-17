package streamAPI;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import insumos.Person;
import insumos.Person.Gender;

public class CollectCollectorsData {

	public static void main(String[] args) {
//		exemplo1();
//		exemplo2();
//		exemplo3();
//		exemplo4();
//		exemplo5();
		exemplo6();
	}

	public static void exemplo6() {
		Person person1 = new Person("Donald", 40, Gender.MALE);
		Person person2 = new Person("Hillary", 30, Gender.FEMALE);
		Stream<Person> stream1 = Stream.of(person1, person2);
//		Map<Gender, String> map = stream1.collect(Collectors.groupingBy(p -> p.getGender(), Collectors.groupingBy(Person::getName)));
	}

	public static void exemplo5() {
		Person person1 = new Person("Leo", 40, Gender.MALE);
		Person person2 = new Person("Mia", 30, Gender.FEMALE);
		Person person3 = new Person("Eli", 20, Gender.MALE);
		Person person4 = new Person("Zeo", 10, Gender.FEMALE);
		
		Stream<Person> stream1 = Stream.of(person1, person2, person3, person4);
		Map<Boolean, List<Person>> map = stream1.collect(Collectors.partitioningBy(Person::isMale));
		System.out.println(map);
		
		Stream<Person> stream2 = Stream.of(person1, person2, person3, person4);
		Map<Boolean, Double> map2 = stream2.collect(Collectors.partitioningBy(Person::isMale, Collectors.averagingDouble(Person::getAge)));
		System.out.println(map2);
		
		Stream<Person> stream3 = Stream.of(person1, person2, person3, person4);
		Map<Gender, List<Person>> map3 = stream3.collect(Collectors.groupingBy(Person::getGender));
		System.out.println(map3);
		
		Stream<Person> stream4 = Stream.of(person1, person2, person3, person4);
		Map<Boolean, List<Person>> map4 = stream4.collect(Collectors.partitioningBy(p -> p.getAge() < 20));
		System.out.println(map4);
	}
	
	public static void exemplo4() {
		Person person1 = new Person("Leo", 40, Gender.MALE);
		Person person2 = new Person("Mia", 30, Gender.FEMALE);
		Person person3 = new Person("Eli", 20, Gender.MALE);
		Person person4 = new Person("Zeo", 10, Gender.FEMALE);
		
		Stream<Person> stream1 = Stream.of(person1, person2, person3, person4);
		Map<Gender, List<Person>> map = stream1.collect(Collectors.groupingBy(Person::getGender));
		System.out.println(map);
		
		Stream<Person> stream2 = Stream.of(person1, person2, person3, person4);
		Map<Gender, Double> map2 = stream2.collect(Collectors.groupingBy(Person::getGender, Collectors.averagingDouble(Person::getAge)));
		System.out.println(map2);
	}
	
	public static void exemplo3() {
		Stream<Person> stream = Stream.of(new Person("Adam", 20), new Person("Eva", 20));
		Map<Integer, String> map = stream.collect(Collectors.toMap(Person::getAge, Person::getName));
		System.out.println(map);
	}

	public static void exemplo2() {
		Stream<String> stream = Stream.of("A", "B", "C");
		LinkedList<String> list = stream.collect(Collectors.toCollection(() -> new LinkedList<>()));
		System.out.println(list);
	}

	public static void exemplo1() {
		Stream<String> stream1 = Stream.of("A", "B", "B", "A");
		List<String> list = stream1.collect(Collectors.toList());
		System.out.println(list);
		
		Stream<String> stream2 = Stream.of("A", "B", "B", "A");
		Set<String> set = stream2.collect(Collectors.toSet());
		System.out.println(set);
	}
	
}