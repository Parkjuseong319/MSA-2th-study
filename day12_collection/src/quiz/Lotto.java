package quiz;

import java.util.Random;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		while(set.size() < 6) {
			set.add(r.nextInt(1, 46));
		}
		System.out.println(set);
	}

}
