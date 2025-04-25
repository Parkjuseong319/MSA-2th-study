package ex01.lambda;

import java.util.ArrayList;

public class LambdaMain {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(55);
		numbers.add(92);
		numbers.add(31);
		numbers.add(52);
		
//		System.out.println(numbers);	// [55, 92, 31, 52]
		
//		numbers.forEach( (n) -> {System.out.println(n);});
		numbers.forEach( n -> {System.out.println(n);});
		
		
		
//		for (int item : numbers) {
//			System.out.println(item);
//		}
//		55
//		92
//		31
//		52
		
		
		
		
	}

}
