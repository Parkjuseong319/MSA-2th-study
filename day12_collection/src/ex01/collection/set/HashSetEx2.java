package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person{	// extends Object가 생략되어 있다.
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	// set의 특성 때문에 중복이 제거된다.
	@Override
	public boolean equals(Object obj) {	// 객체 생성시 자동 호출.
		if(obj instanceof Person) {		// instanceof는 객체 타입 확인. 형변환 여부도 확인
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
}

public class HashSetEx2 {
	public static void main(String[] args) {
		Set set = new HashSet<>();
		// Set에다간 객체를 넣을 수 있다. 
		set.add(new Person("zoo", 28));
		set.add(new Person("zoo", 28));
		set.add(new Person("David", 30));
		set.add(new Person("David", 30));
		set.add(new Person("David", 37));
		set.add(new Person("David", 29));
		set.add(new String("Happy"));
		set.add(new String("Happy"));
		System.out.println(set);
//		Person p = new Person("zoo", 27);
//		System.out.println(p);
	}
}
