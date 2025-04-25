package quiz;

import java.util.function.BiFunction;

// 사칙연산 함수 + plus( x, y ) / sub( x, y) lambda 형태로 구현해서 출력하기


public class Operator {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		//
		BiFunction<Integer, Integer, Integer> plus = (x, y) -> x + y;
		BiFunction<Integer, Integer, Integer> sub = (x, y) -> x - y;
		
		int resultPlus = plus.apply(a, b);
		
		int resultSub = sub.apply(a, b);
		
		System.out.println(resultPlus);
		System.out.println(resultSub);
	}
}
