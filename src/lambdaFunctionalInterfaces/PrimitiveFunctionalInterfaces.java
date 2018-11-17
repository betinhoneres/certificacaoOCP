package lambdaFunctionalInterfaces;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToLongFunction;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionalInterfaces {

	IntPredicate primitivePredicate = i -> {
		//System.out.println(i instanceof Integer);
		return i>0;
	};
	
	Predicate<Integer> wrapperPredicate = i2 -> {
		System.out.println(i2 instanceof Integer);
		return i2>0;
	};
	
	DoubleConsumer primiteveConsumer = d -> {
		System.out.println(d);
	};
	
	Consumer<Double> wrapperConsumer = d2 -> {
		System.out.println(d2.intValue());
	};
	
	LongFunction<String> longFunction = l -> String.valueOf(l);
	DoubleFunction<String> doubleFunction = d -> String.valueOf(d);
	
	ToIntFunction<String> toIntFunction = s -> s.length();
	
	DoubleToLongFunction doubleToLong = d -> Math.round(d);
	IntToLongFunction intToLong = i -> Math.round(i);
	DoubleToIntFunction doubleToInt = d -> Integer.valueOf(String.valueOf(d)).intValue();

	LongSupplier supplier = () -> Long.MAX_VALUE;
	IntSupplier intSupplier = () -> 6;

	public static void main(String[] args) {

		PrimitiveFunctionalInterfaces primitive = new PrimitiveFunctionalInterfaces();
		
		System.out.println(primitive.longFunction.apply(1l));
		System.out.println(primitive.toIntFunction.applyAsInt("teste"));
		
		System.out.println(primitive.supplier.getAsLong());
		
		System.out.println(primitive.intSupplier.getAsInt());
		
		DoublePredicate doublePredicate = d -> d < new BigDecimal(1).doubleValue();
		
		System.out.println(doublePredicate.negate().test(0.0));
		
		LongConsumer longConsumer = System.out::println;
		longConsumer.andThen(longConsumer).accept(1);		

		
	}
	
}