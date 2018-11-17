package streamAPI;

import java.io.IOException;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OptionalClass {

	public static void main(String[] args) throws Exception {
		
		//construcaoOfOfNullableIsPresentIfPresentConsumerOrElseSupplier();
		
		//optionalFilter();
		
		//mapMethod();
		
		//flatMap();
		
		//question1();
		
		//question2();
		
		question3();
		
	}

	private static void question3() {
		Optional<Integer> optional = Optional.ofNullable(null);
		String value = optional.map(i -> "Whizlabs").get();
		System.out.println(value);
	}

	private static void question2() {
		Stream<Integer> stream = Stream.of(0);
		Optional<Integer> optional = stream.findFirst();
		int value = optional.filter(i -> i%2 == 0).orElseGet(() -> 1);
		System.out.println(value);
	}

	private static void question1() {
		Stream<String> stream = Stream.of();
		Optional<String> optional = stream.findAny();
		System.out.println(optional.get());
	}

	private static void flatMap() {
		Optional<String> opTeste = Optional.of("Teste");
		Optional<String> opString = opTeste.flatMap(s -> Optional.of(s.toUpperCase()));
		System.out.println(opString.get());
	}

	private static void mapMethod() {
		Optional<String> opTeste = Optional.of("Teste");
		Optional<Integer> opInteger = opTeste.map(String::length);
		System.out.println(opInteger.get());
		System.out.println(opInteger);
	}

	private static void optionalFilter() {
		Optional<Integer> opInteger = Optional.of(1);
		Optional<Integer> opFilter = opInteger.filter(i -> i%2 == 0); 
		System.out.println(opFilter.isPresent());
	}

	private static void construcaoOfOfNullableIsPresentIfPresentConsumerOrElseSupplier() throws Exception {
		Optional<String> opEmty = Optional.empty();
		System.out.println(opEmty);
		
		Optional<String> opString = Optional.of("teste");
		System.out.println(opString);
		System.out.println(opString.isPresent());
		opString.ifPresent(System.out::println);
		
		Optional<String> opNotNull = Optional.ofNullable(null);
		System.out.println(opNotNull);
		opNotNull.ifPresent(System.out::println);
		
		Optional<String> opNull = Optional.ofNullable(null);
		System.out.println(opNull.orElse("viu que legal!"));
		System.out.println(opNull.isPresent());
		
		Supplier<String> supplier = () -> "teste Supplier";
		Optional<String> opSupplier = Optional.ofNullable(null);
		System.out.println(opSupplier.orElseGet(supplier));
		System.out.println(opSupplier.isPresent());
		
		Supplier<Exception> supplierThrow = () -> new IOException();
		Optional<String> opSupplierThrow = Optional.ofNullable(null);
		System.out.println(opSupplierThrow.orElseThrow(supplierThrow));
	}
}