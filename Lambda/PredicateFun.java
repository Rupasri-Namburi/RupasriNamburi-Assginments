import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PredicateFun {

	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList(
				"Raj", "Rani", "A1", "A2", "Abc");

		
		Predicate<String> p = (s) -> s.startsWith("R");

		
		for (String st : names) {
			
			if (p.test(st))
				System.out.println(st);
		
		}
		UnaryOperator<Integer> unary = v -> v * 10;
	      
	      Function<Integer, Integer> function = v -> v * 10;

	      System.out.println(unary.apply(10));
	      System.out.println(function.apply(20));
	      
	}

}
