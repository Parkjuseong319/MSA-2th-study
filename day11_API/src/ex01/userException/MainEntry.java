package ex01.userException;

import java.util.InputMismatchException;

public class MainEntry {
	public void test1(String[] n) throws UserException {

		System.out.println("Test1");
		if (n.length < 1)
			throw new UserException("아무것도 없다네"); // 강제 exception 발생
		else
//			throw new UserException("최종 예선", 703); // 강제 exception 발생
			throw new InputMismatchException();
	}

	public static void main(String[] args) {
		MainEntry ut = new MainEntry();
		try {
			ut.test1(args);
		} catch (UserException ue) {
			// System.out.println(ue.getMessage());
			ue.printStackTrace();
		}
	}
}
