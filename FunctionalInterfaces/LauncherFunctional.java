package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LauncherFunctional {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Print primes numbers less than 10");
		eval(list, n -> n % 2 != 0 && n % 3 != 0);
		
	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.println(n + " ");
			}
		}
	}
}
