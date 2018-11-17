package streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDataMethods {

	public static void main(String[] args) {
//		countMethod();
//		minAndMaxMethods();
		//reduceOperator();
		averageMethod();
		//sumMethod();
		
		//questions1();
		//questions2();
		//question3();
		question4();
	}

	private static void question4() {
		Stream<Double> stram = Stream.of(1.0,2.0);
//		OptionalDouble op = stram.average();
//		System.out.println(op.getAsDouble());
				
		DoubleStream stream = DoubleStream.of(1.0,2.0);
		OptionalDouble op = stream.average();
		System.out.println(op.getAsDouble());
	}

	private static void question3() {
		Stream<Integer> stream = Stream.of(1,2,3);
		//Optional<Integer> op = stream.reduce(0, (i1,i2) -> i1 * i2);
		//System.out.println(op.get());
		int result = stream.reduce(0, (i,j) -> i*j);
		System.out.println(result);

	}

	private static void questions2() {
		Stream<String> stream = Stream.of("A", "B", "C");
		Optional<String> op = stream.reduce((s1,s2) -> s2+s1);
		System.out.println(op.get());
	}

	private static void questions1() {
		Stream<String> stream = Stream.of("A", "B");
		Optional<String> op = stream.max(String::compareTo);
		System.out.println(op.get());
	}

	private static void sumMethod() {
		DoubleStream stream2 = DoubleStream.of(0,2.5,4,1,3,5);
		double sum2 = stream2.sum();
		System.out.println(sum2);
		
		IntStream stream = IntStream.of(0,2,4,1,3,5);
		int sum = stream.sum();
		System.out.println(sum);
		
		LongStream stream3 = LongStream.of(0,2,4,1,3,5);
		long sum3 = stream3.sum();
		System.out.println(sum3);
	}

	private static void averageMethod() {
		IntStream stream = IntStream.of(0,2,4,1,3,5);
		OptionalDouble opAverage = stream.average();
		double average = opAverage.getAsDouble();
		System.out.println(average);
	}

	private static void reduceOperator() {
		Stream<Integer> stream = Stream.of(0,2,4,1,3,5);
		Optional<Integer> result = stream.reduce(Integer::sum);
		System.out.println(result.get());
		
		Stream<Integer> stream2 = Stream.of(0,2,4,1,3,5);
		int result2 = stream2.reduce(0, (i,j) -> i+j);
		System.out.println(result2);
		
	}

	private static void minAndMaxMethods() {
		Collection<Integer> source = Arrays.asList(3,1,4,5,2);
		Stream<Integer> stream1 = source.stream();
		Optional<Integer> opMin = stream1.min(Integer::compareTo);
		System.out.println(opMin.get());
		
		Stream<Integer> stream2 = source.stream();
		Optional<Integer> opMax = stream2.max(Integer::compareTo);
		System.out.println(opMax.get());
	}

	private static void countMethod() {
		Stream<String> stream = Stream.of("A", "B", "C");
		long count = stream.count();
		System.out.println(count);
	}
	
}