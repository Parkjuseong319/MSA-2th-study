package ex04.set;
import java.util.*;
class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "a";
		String to	= "b";
		set.add("abc");
		set.add("alien");set.add("bat");
		set.add("car");set.add("Car");
		set.add("disc");set.add("dance");
		set.add("dZZZZ");set.add("dzzzz");
		set.add("elephant");set.add("elevator");
		set.add("fan");set.add("flower");
		System.out.println(set);		// 출력 순서는 대문자 소문자 숫자 그 외 기타 순서 위주로 출력된다.
		System.out.println("range search : from " + from  +" to "+ to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
	}
}