package ex02.oop;

import java.util.Scanner;

class Person {
	String name, number;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String a) {
		name = a;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String a) {
		number = a;
	}
	
	public void display(String name, int age, String number) {
		System.out.println("이름: "+name+"\n나이: "+age+" 세\n번호: "+ number);
	}
	
}


public class PersonMain {
	public static void main(String[] args) {
		Person per = new Person();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름은?");
		per.setName(sc.next());
		System.out.println("당신의 나이는?");
		per.setAge(sc.nextInt());
		System.out.println("당신의 연락처를 입력해주세요");
		per.setNumber(sc.next());
		
		per.display(per.getName(), per.getAge(), per.getNumber());
		
		sc.close();
	}

}
