
package ex03.Enum;


enum UserStatus{
	PENDING,
	ACTIVE,
	INACTIVE,
	DELETE;
}


public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println(Thread.State.BLOCKED);
		
		// 1.
		System.out.println(UserStatus.DELETE);
		System.out.println("==============================");
		// 2.
		for (UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}
		System.out.println("==============================");
		
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
	}
}
